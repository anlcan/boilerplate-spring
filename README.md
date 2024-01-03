# Spring Basics

- Separate transfer objects with suffix:
  - controller objects with -Request and -Response 
  - queue objects with -Message
  - callback/webhooks with -Notification
- validate transfer objects with `import javax.validation.constraints.*` using `@valid` 

# Docker basics

- Read [docker caching](https://docs.docker.com/build/cache/)
- and docker [env variables](https://docs.docker.com/build/building/env-vars/)
- Do not run HEALTHCHECKS (this should be done by orchestration, let the pod die if image fails)

# AWS Basics
 
- use [localstack](https://github.com/localstack/localstack)
- 

# K24 Basics

# k8s Basics

- use helm for k8s resources definitions
- for local development, try [minikube](https://minikube.sigs.k8s.io/)
  - 'brew install minikube' 
  - 'minikube image load <image name>'
  - create a deployment and service(nodeport)
  - expose the port 'minikube service <service name> --url'
  - enjoy
