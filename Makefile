cp: c p

m ?= default message
branch=`git rev-parse --abbrev-ref HEAD`

p:
	echo $(branch)
	gith push origin $(branch)


c:
	echo $(m)
	git commit -am "$(m)"

