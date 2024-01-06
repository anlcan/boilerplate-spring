## This make file is not part of the boilerplate, feel free to ignore/delete it


## GIT
m ?= default message
branch=$(shell git rev-parse --abbrev-ref HEAD)
cp: c p
p:
	echo $(branch)
	git push origin $(branch)
c:
	echo $(m)
	git commit -am "$(m)"

## TESTING
h:
	http localhost:8080$(path) # brew install httpie, if not curl should work
