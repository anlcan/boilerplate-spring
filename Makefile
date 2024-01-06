cp: c p


## GIT RELATED
m ?= default message
branch=$(shell git rev-parse --abbrev-ref HEAD)

p:
	echo $(branch)
	git push origin $(branch)


c:
	echo $(m)
	git commit -am "$(m)"


## TESTING RELATED
h:
	http localhost:8080$(path) # brew install httpie, if not curl should work
