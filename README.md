# Gateway-Implementation

An implementation of the use of Spring Cloud gateway (a non-blocking API) with the help of two microservices running on port `8081` and `8082`

The gateway configuration is done using both the way an `application.yml` (which is commented out) and a Configuration file as well.

#### Note:

- First run the microservices and then the gateway.
- Run the gateway proxy at `localhost:8080/serviceOne/one` or `localhost:8080/serviceTwo/two`.
- Since the gateway is reactive and uses `Web Flux` try avoiding the `Spring MVC` dependency from POM.
