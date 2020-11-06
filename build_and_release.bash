#!/usr/bin/env bash
set -e 
scm_repo_client="git@github.com:norrs/testrepo.git"

updateReleases() {
 IFS=$'\n' read -r -d '' -a releases < <( git branch \
	 --no-color --remote --list --format '%(refname)' | \
	 sed s#refs/remotes/origin/##g | \
	 grep -E '[0-9]+.' | \
	 sed '/-/!{s/$/_/}' | sort -V | sed 's/_$//' | \
	 sort -r && printf '\0' )
 declare -a releases 
}

main() {
 local repo="$1"
 local output="$2"
 mkdir -p "${output}"
 local version
 version=$(git describe --tags)
 ./gradlew :clean :buildDataciteRestApiClient
 (
   cd "${output}/generated"
   git init
   git checkout -b "${version}"
   git add . 
   git commit -m "Generated from ${version}"
   git remote add origin "${repo}"
   git push origin "HEAD:${version}"
 )
 (
   cd "${output}/generated"
   local timestamp
   timestamp=$(date)
   git fetch origin 
   git checkout main
   git pull origin main
   updateReleases
   cat << EOF > README.md
# OpenAPI native java client for Datacite Rest API 

This is UNITs generated OpenAPI client library in the programming language java.

This code gets generated from a git tag done in repository holding the OpenAPI definition: $scm_repo_client 

We try to tag our versions to match the upstream's OpenAPI version.

Currently generated versions you can see below.

# Released versions 

EOF
   for release in "${releases[@]}"; do
     echo "* [${release}](https://github.com/norrs/testrepo/tree/${release}) released at ${timestamp}" >> README.md
   done
   git add README.md
   git commit \
	   -m "Release of ${version}" \
	   \
	   -m "Source lives in branch ${version}" \
	   -m "Url: https://github.com/norrs/testrepo/tree/${version}" \
	   -m "Date: ${timestamp}"
   git push origin main
 )


}

main "$scm_repo_client" "build"
