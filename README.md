[![Codacy Badge](https://app.codacy.com/project/badge/Grade/c74d474797eb463aa10bbaf38440e56d)](https://app.codacy.com?utm_source=gh&utm_medium=referral&utm_content=&utm_campaign=Badge_grade)

# Spring Basics

-
use [actuator](https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html?query=health%27%20target=_blank%3E%3Cb%3Ehealth%3C/b%3E%3C/a%3E-groups)
- Separate transfer objects with suffix:
    - controller objects with -Request and -Response
    - queue objects with -Message
    - callback/webhooks with -Notification
- validate transfer objects with `import jakarta.validation.constraints.*` using `@valid`
- test controllers without the whole applicationcontext
- use sprindoc and swagger for openapi documentation, upload it to bump.sh

# Docker basics

- Read [docker caching](https://docs.docker.com/build/cache/)
- and docker [env variables](https://docs.docker.com/build/building/env-vars/)
- Do not run HEALTHCHECKS (this should be done by orchestration, let the pod die if image fails)

# AWS Basics

- use [localstack](https://github.com/localstack/localstack)
- always publish through SNS

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
- ingress
  - [helm](https://helm.sh/docs/intro/quickstart/)
  - {host}/{service-name}/{version}/{path} 
    - [ ] get the version from pom.xml
# K24 Basics

- Add your repo into codacy and generate a token on
  the [settings page](https://app.codacy.com/gh/kfzteile24/boilerplate-k8s-app/settings/coverage)
- use the badge on your readme


# TODO

- new relic
    - [ ] tracing?
    - [ ] spring new relic addon

- database
    - [ ] jpa
    - [ ] liquidbase

- docker-compose?
- spring
    - [x] actuator
    - [x] springdoc & bumpsh
    - [ ] env only controllers
    - [ ] tests
    - [ ] mvn profiles
    - [ ] configuration NOT in maven
- k8s
    - [x] ingress
    - [ ] cronjob
    - [x] configmaps
- localstack
    -  [ ] s3
    -  [ ] sns ingress
    -  [ ] sqs

