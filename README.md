
# 👤 User Management Spring Boot Application

A simple RESTful User Management system built with Spring Boot. It allows creating, reading, updating, and deleting user records.

## 📦 Technologies Used

- Java 17+
- Spring Boot
- Maven
- REST API (Spring Web)
- IntelliJ IDEA (recommended)

## 🚀 Getting Started

### Prerequisites

- Java 17 or higher
- Maven
- IntelliJ IDEA (Community or Ultimate)
- Postman or curl (for API testing)

### How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/UserManagement.git
   cd UserManagement
   ```

2. Build and run the application:

   ```bash
   mvn spring-boot:run
   ```

3. Access it at: `http://localhost:8080/user`

## 📚 API Endpoints

### ➕ Create a user

- **POST** `/user`
- **Request Body:**
```json
{
  "name": "Alice",
  "email": "alice@example.com",
  "password": "securepass123"
}
```

### 📋 Get all users

- **GET** `/user`

### 🔍 Get user by ID

- **GET** `/user/{id}`

### 🛠 Update user

- **PUT** `/user/{id}`
- **Request Body:**
```json
{
  "name": "Updated Name",
  "email": "updated@example.com",
  "password": "newpassword456"
}
```

### ❌ Delete user

- **DELETE** `/user/{id}`

## 🗂 Sample User Structure

```json
{
  "id": 1,
  "name": "Alice",
  "email": "alice@example.com",
  "password": "securepass123"
}
```

## ⚠ Note

- User `id` is auto-generated in the constructor (not from client input).
- Data is stored in-memory only; it will reset on server restart.

