# If you are on main branch, please select appropriate branch to see the appropriate coding logic of
- **Different Coding Logic which will begin from Core Java**
  - Core Java -> Spring Core -> Spring Web -> Spring Boot Web

## Dispatcher Servlet
   - Spring Boot will automatically configure `Dispatcher Servlet` through AutoConfiguration feature

## Configure Tomcat server
   - Spring Boot internally has `tomcat server` embedded

## Run your application
- **Right-click on the CoreJavaToSpringBootWebProject main class and run the application as Java Application:**
  - enter this url http://localhost:8080/test in browser and hit

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
