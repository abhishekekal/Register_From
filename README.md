# Registration Form REST API with JSP

## Project Overview
This project is a Spring Boot application that implements a user registration form using JSP (JavaServer Pages) for the frontend and Hibernate for ORM. The API supports CRUD operations and integrates with a MySQL database.

## Features
- User registration form with JSP
- RESTful API endpoints
- Data persistence with Hibernate
- Custom validation and error handling
- JSP views for user interaction

## Technologies Used
- **Backend**: Java, Spring Boot, Hibernate
- **Frontend**: JSP
- **Database**: MySQL
- **Tools**: Maven, Eclipse/IntelliJ, Postman
- **Version Control**: GitHub

## Project Structure
```
/registerform
|-- src
|   |-- main
|   |   |-- java
|   |   |   |-- com.example.registerform
|   |   |   |   |-- controller
|   |   |   |   |   |-- UserController.java
|   |   |   |   |-- model
|   |   |   |   |   |-- User.java
|   |   |   |-- resources
|   |   |   |   |-- application.properties
|   |   |   |-- webapp
|   |   |   |   |-- WEB-INF/views
|   |   |   |   |   |-- register.jsp
|   |   |   |   |   |-- register1.jsp
|-- pom.xml
|-- README.md
```

## Endpoints
| Method | Endpoint               | Description                 |
|--------|------------------------|-----------------------------|
| GET    | /register              | Render user registration JSP|
| POST   | /api/users/register    | Register a new user         |
| GET    | /api/users             | Get all users               |

## Setup and Installation
1. Clone the repository:
   ```
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```
   cd registerform
   ```
3. Configure the MySQL database in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/registration_db
   spring.datasource.username=root
   spring.datasource.password=password
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```
4. Build and run the application:
   ```
   mvn spring-boot:run
   ```

## Usage
- Access the registration form at `http://localhost:8080/register`
- Submit user data via the form or API endpoint.

## License
This project is licensed under the MIT License.

---
### Author
**Abhishek Hanmant Ekal**  
GitHub: [abhishekekal](https://github.com/abhishekekal)  
LinkedIn: [abhishek-ekal](https://www.linkedin.com/in/abhishek-ekal-57642425b/)

