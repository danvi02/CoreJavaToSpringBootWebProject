# If you are on main branch, please select appropriate branch to see the appropriate coding logic of
- **Different Coding Logic which will begin from Core Java**
  - Core Java -> Spring Core -> Spring Web -> Spring Boot Web

## Dispatcher Servlet
   - The "DispatcherServlet" is a central component in the Spring Framework's web module that handles the HTTP requests and manages the processing of these requests in a Spring-based web application. It acts as a front controller, responsible for dispatching requests to the appropriate handlers (controllers) and coordinating the processing of the request and response.

## Configure Tomcat server
   - You need to configure tomcat server in IDE , give the path where your tomcat is located in your local machine. You can add the tomcat server by clicking on to menu Windows-> Others -> Type `servers` then a new tab will be generated in after the console tab in below then you can right-click and add your tomcat server.

## Run your application on Tomcat server by starting the server
- **test URL of the application after you add your application to TOMCAT server and run :**
  - http://localhost:8080/corejavatospringbootweb/test (since it is java spring web application maven project, it 	takes artifactId as URL context path).
  - And also if you want to add your application to tomcat server then in pom.xml, you must mention <packaging> as 	war

## Spring Annotations

### `@Configuration`

- **Purpose:**
  - Indicates that a class declares one or more `@Bean` methods and may be processed by the Spring container to generate bean definitions and service requests for those beans.

- **Usage:**
  - Applied to classes that define Spring configuration.

### `@ComponentScan`

- **Purpose:**
  - Configures the scanning of the specified package for Spring components (e.g., `@Component`, `@Service`, `@Repository`, `@Controller`).

- **Usage:**
  - Applied to configuration classes to specify the base packages to scan for components.

### `@Component`

- **Purpose:**
  - Indicates that a class is a Spring component, and the Spring container should manage it as a bean.

- **Usage:**
  - Applied to classes that should be auto-detected and registered as Spring beans.

### `@RestController`

- **Purpose:**
  - Combines `@Controller` and `@ResponseBody`.
  - Used for creating RESTful web services.

- **Usage:**
  - Applied to classes to indicate that all methods return data suitable for RESTful services.

### `@Controller` + `@ResponseBody`

- **Purpose:**
  - `@Controller`: Marks a class as a Spring MVC controller.
  - `@ResponseBody`: Indicates a method return value should be bound to the web response body.

- **Usage:**
  - Applied to classes for handling HTTP requests and returning data.

### `@Service`

- **Purpose:**
  - Marks a class as a service class in the business layer.
  - Typically used to hold business logic.

- **Usage:**
  - Applied to service classes.

### `@Repository`

- **Purpose:**
  - Indicates that a class is a Data Access Object (DAO).
  - Converts checked exceptions into Spring's DataAccessException.

- **Usage:**
  - Applied to classes at the persistence layer.

These annotations are part of the Spring framework and are used to configure and manage various components within a Spring-based application. Depending on the type of class and its role in the application, you would apply the relevant annotation(s) to enable Spring to handle it appropriately.
