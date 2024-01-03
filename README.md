# Spring Basics

- Separate transfer objects with suffix:
    - controller objects with -Request and -Response
    - queue objects with -Message
    - callback/webhooks with -Notification
- validate transfer objects with `import javax.validation.constraints.*` using `@valid`
- test controllers without the whole applicationcontext

# Docker basics

- Read [docker caching](https://docs.docker.com/build/cache/)
- and docker [env variables](https://docs.docker.com/build/building/env-vars/)
- Do not run HEALTHCHECKS (this should be done by orchestration, let the pod die if image fails)

# AWS Basics

- use [localstack](https://github.com/localstack/localstack)
-

# k8s Basics

- learn [kubectl](https://kubernetes.io/docs/reference/generated/kubectl/kubectl-commands#delete) 
- Define liveness and readiness probes in your deployment to help Kubernetes know when your app is ready to serve
  traffic and when to restart containers. They are not the same!
- Use ConfigMaps for non-sensitive configuration data and Secrets for sensitive data, referencing them appropriately in
  your deployment configurations.
- use Helm 3 for k8s resources definitions
    - Use the command helm create [chart-name] to create a new chart with the default structure. (no copy-paste)
    -
- for local development, try [minikube](https://minikube.sigs.k8s.io/)
    - 'brew install minikube'
    - 'minikube image load <image name>'
    - create a deployment and service(nodeport)
    - expose the port 'minikube service <service name> --url'
    - enjoy

# K24 Basics
