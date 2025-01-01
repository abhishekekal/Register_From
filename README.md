# Registration Form REST API

## Project Overview
This project is a RESTful API built with **Spring Boot** and **Hibernate** that handles user registration. The API performs standard CRUD operations, manages user data, and stores information in a **MySQL** database.

## Features
- User registration with form validation
- Data persistence using Hibernate ORM
- REST endpoints for user operations (Create, Read, Update, Delete)
- Error handling and validation
- Secure password storage

## Technologies Used
- **Backend**: Java, Spring Boot, Hibernate
- **Database**: MySQL
- **Tools**: Postman (API testing), Git, Eclipse/IntelliJ
- **Version Control**: GitHub

## Project Structure
```
/registration-api
|-- src
|   |-- main
|   |   |-- java
|   |   |   |-- com.example.registration
|   |   |   |   |-- controller
|   |   |   |   |   |-- UserController.java
|   |   |   |   |-- entity
|   |   |   |   |   |-- User.java
|   |   |   |   |-- repository
|   |   |   |   |   |-- UserRepository.java
|   |   |   |   |-- service
|   |   |   |   |   |-- UserService.java
|   |   |-- resources
|   |   |   |-- application.properties
|-- pom.xml
|-- README.md
```

## Endpoints
| Method | Endpoint               | Description                 |
|--------|------------------------|-----------------------------|
| POST   | /api/users/register    | Register a new user         |
| GET    | /api/users             | Get all registered users    |
| GET    | /api/users/{id}        | Get user by ID              |
| PUT    | /api/users/{id}        | Update user information     |
| DELETE | /api/users/{id}        | Delete a user by ID         |

## Setup and Installation
1. Clone the repository:
   ```
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```
   cd registration-api
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
- Use Postman or any API client to test the endpoints.
- Example request to register a user:
   ```json
   {
     "username": "abhishek",
     "email": "abhishek@example.com",
     "password": "securepassword"
   }
   ```

## License
This project is licensed under the MIT License. Feel free to modify and distribute.

---
### Author
**Abhishek Hanmant Ekal**  
GitHub: [abhishekekal](https://github.com/abhishekekal)  
LinkedIn: [abhishek-ekal](https://www.linkedin.com/in/abhishek-ekal-57642425b/)

