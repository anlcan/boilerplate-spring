cp: c p


p:
	export branch=`git rev-parse --abbrev-ref HEAD`
	echo $(branch)
	gith push origin $(branch)

m ?= default message
c:

	git commit -am "$(m)"

