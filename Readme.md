# Student Management API

A simple REST API built using **Spring Boot** that allows users to manage student records. It supports adding, viewing, updating, and deleting students.

## Technologies Used
- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

## Features
- Add a new student
- View all students
- View a student by ID
- Update student details
- Delete a student

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/Satyam-garg27/PBLJ.git
   ```

2. Open the `studentapi` folder.

3. Run the application using:
   ```bash
   mvn spring-boot:run
   ```

4. The server will start at:
   ```text
   http://localhost:8080
   ```

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | `/students` | Add a student |
| GET | `/students` | Get all students |
| GET | `/students/{id}` | Get student by ID |
| PUT | `/students/{id}` | Update student |
| DELETE | `/students/{id}` | Delete student |

## Example Requests

### 1. Add Student
**POST** `/students`

Input:
```json
{
  "name": "Satyam",
  "email": "satyam@example.com"
}
```

### 2. Get All Students
**GET** `/students`

Example response:
```json
[
  {
    "id": 1,
    "name": "Satyam",
    "email": "satyam@example.com"
  }
]
```

### 3. Update Student
**PUT** `/students/1`

Input:
```json
{
  "name": "Satyam Garg",
  "email": "satyamgarg@example.com"
}
```

### 4. Delete Student
**DELETE** `/students/1`

Deletes the student with ID 1.

## Database

The project uses an H2 in-memory database.

H2 Console:
```text
http://localhost:8080/h2-console
```

Database name: `studentdb`  
Username: `sa`  
Password: Leave blank

## Author
Satyam Garg