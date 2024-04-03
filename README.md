Basic Resources

http://localhost:8080/hello-world
http://localhost:8080/hello-world-bean
http://localhost:8080/hello-world/path-variable/Ranga
http://localhost:8080/users
http://localhost:8080/users/1
JPA Resources
http://localhost:8080/jpa/users
http://localhost:8080/jpa/users/1
http://localhost:8080/jpa/users/10001/posts
Filtering
http://localhost:8080/filtering
http://localhost:8080/filtering-list
Actuator
http://localhost:8080/actuator
Versioning
http://localhost:8080/v1/person
http://localhost:8080/v2/person
http://localhost:8080/person
params=[version=1]
http://localhost:8080/person
params=[version=2]
http://localhost:8080/person/header
headers=[X-API-VERSION=1]
http://localhost:8080/person/header
headers=[X-API-VERSION=2]
http://localhost:8080/person/accept
produces=[application/vnd.company.app-v1+json]
http://localhost:8080/person/accept
produces=[application/vnd.company.app-v2+json]
Swagger
http://localhost:8080/swagger-ui.html
http://localhost:8080/v3/api-docs
H2-Console
http://localhost:8080/h2-console
HAL Browser
http://localhost:8080
























# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.in28minutes.rest.webservices.restful-web-services' is invalid and this project uses 'com.in28minutes.rest.webservices.restfulwebservices' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.3.0-M1/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.3.0-M1/maven-plugin/reference/html/#build-image)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.3.0-M1/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.3.0-M1/reference/htmlsingle/index.html#web)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.3.0-M1/reference/htmlsingle/index.html#using.devtools)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

