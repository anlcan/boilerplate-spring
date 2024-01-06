cp: c p

m ?= default message
branch=$(shell git rev-parse --abbrev-ref HEAD)

p:
	echo $(branch)
	git push origin $(branch)


c:
	echo $(m)
	git commit -am "$(m)"

