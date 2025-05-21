# 🎓 Student Management Spring Boot Application

A simple RESTful API to manage students’ information such as roll number, name, and marks, built with Spring Boot.

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
   git clone https://github.com/your-username/StudentManagement.git
   cd StudentManagement

2. Build and run the application:

   ```bash
   mvn spring-boot:run
   ```

3. Access the API at: `http://localhost:8080/student`

---

## 📚 API Endpoints

### ➕ Add a Student

- **POST** `/student/add`
- **Request Body:**

  ```json
  {
    "rollno": 101,
    "name": "Alice",
    "marks": 85
  }
  ```

---

### 📋 Display All Students

- **GET** `/student`

---

### 🔍 Search Student

- **GET** `/student/search?name=Alice`  
- **OR**  
- **GET** `/student/search?rollno=101`

---

### ✏️ Update Student Marks

- **PUT** `/student/update/{rollno}?marks=90`

---

### ❌ Delete Student

- **DELETE** `/student/delete?rollno=101`

---

## 📄 Data Model

### Student

```json
{
  "rollno": 101,
  "name": "Alice",
  "marks": 85
}
```

---

## ⚠ Notes

- Roll numbers are used as unique identifiers.
- Data is stored in-memory and will reset on server restart.
