# 📝 ToDo List Spring Boot Application

A simple RESTful ToDo List application built with Spring Boot. It supports creating, reading, updating, and deleting tasks using HTTP endpoints.

## 📦 Technologies Used

- Java 17+
- Spring Boot
- Maven
- REST API (Spring Web)
- IntelliJ IDEA (recommended)

## 🚀 Getting Started

### Prerequisites

Ensure you have the following installed:

- Java 17 or higher
- Maven
- IntelliJ IDEA (Community or Ultimate)
- Postman or curl (for API testing)

### How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/ToDoList.git
   cd ToDoList
   ```

2. Build and run the application:

   ```bash
   mvn spring-boot:run
   ```

3. The server will start at: `http://localhost:8080`

## 📚 API Endpoints

### ➕ Add a new task

- **POST** `/todos`
- **Request Body**:

  ```json
  {
    "title": "Buy groceries",
    "completed": false
  }
  ```

### 📋 Get all tasks

- **GET** `/todos`

### 🛠 Update a task

- **PUT** `/todos/{id}`
- **Request Body**:

  ```json
  {
    "title": "Buy fruits and vegetables",
    "completed": true
  }
  ```

### ❌ Delete a task

- **DELETE** `/todos/{id}`

## 🗂 Sample Todo Structure

```json
{
  "id": 1,
  "title": "Complete assignment",
  "completed": false
}
