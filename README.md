# Fitness Workout Tracker – Spring Boot REST API

## Project Overview
The Fitness Workout Tracker is a REST API application developed using Java and Spring Boot. It helps users record and manage their workout details, including workout type, exercise name, duration, calories burned, workout date, intensity, trainer name, and workout status.

## Technologies Used
- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman

## Features
- Create and save workout details.
- Store workout information in a MySQL database.
- Automatically generate workout IDs.
- Manage workout details using REST API endpoints.
- Test API requests and responses using Postman.

## Project Structure

```text
com.Vcube.fitnesstracker
├── controller
│   └── WorkoutController.java
├── model
│   └── Workout.java
├── repo
│   └── WorkoutRepo.java
└── FitnesstrackerApplication.java
```

## Database Configuration

Database: `db`

MySQL configuration in `application.properties`:

```properties
spring.application.name=fitnesstracker
server.port=6666

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3307/db
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Make sure MySQL is running on port `3307` and the `db` database exists.

## REST API Endpoint

### Create Workout

- **Method:** POST
- **URL:** `http://localhost:6666/workout/create`
- **Content-Type:** `application/json`

### Sample Request Body

```json
{
  "userName": "Amrutha sai",
  "workoutType": "Cardio",
  "exercizeName": "Running",
  "duration": 30,
  "caloriesBurned": 250.5,
  "workoutDate": "2026-10-12",
  "intensity": "Medium",
  "trainerName": "Rahul",
  "status": "Completed"
}
```

## How to Run the Project

1. Clone or download the project.
2. Open the project in Eclipse, IntelliJ IDEA, or Spring Tool Suite.
3. Configure the MySQL database in `application.properties`.
4. Make sure the required Maven dependencies are installed.
5. Run the main Spring Boot application class.
6. Open Postman and select the POST method.
7. Enter `http://localhost:6666/workout/create`.
8. Select **Body → raw → JSON**.
9. Enter the workout details and click **Send**.
10. Verify the response and check the saved record in MySQL.

## Sample Users

The application can store workout records for different users, such as:
- Amrutha sai
- Mokshitha Pavani
- Hyndhavi sri
- Anuradha

Each POST request saves one workout record using the current API implementation.

## Future Enhancements
- Retrieve all workout records.
- Retrieve workout details by ID.
- Update existing workout records.
- Delete workout records.
- Search workouts by user name or workout type.
- Add fitness progress reports and workout summaries.

## Author
Developed as a Java Spring Boot REST API project for learning and practicing CRUD operations, database connectivity, and RESTful web services.
