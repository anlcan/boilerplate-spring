cp: c p


p:
	branch = git rev-parse --abbrev-ref HEAD
	gith push origin $(branch)

c:
	git commit -am "$(message)"

