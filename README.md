# 🏨 Hostel Management Spring Boot Application

A simple RESTful API to manage student registrations, room allocations, and room management in a hostel, built with Spring Boot.

---

## 📦 Technologies Used

- Java 17+
- Spring Boot
- Maven
- REST API (Spring Web)
- IntelliJ IDEA (recommended)

---

## 🚀 Getting Started

### Prerequisites

- Java 17 or higher
- Maven
- IntelliJ IDEA (Community or Ultimate)
- Postman or curl (for API testing)

### How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/HostelManagement.git
   cd HostelManagement
   ```

2. Build and run the application:

   ```bash
   mvn spring-boot:run
   ```

3. Access the API at: `http://localhost:8080/hostel`

---

## 📚 API Endpoints

### ➕ Register a Student

- **POST** `/hostel/student`
- **Request Body:**

```json
{
  "name": "John Doe",
  "gender": "M",
  "age": 20,
  "roomPreference": "Single"
}
```

---

### ➕ Add a Room

- **POST** `/hostel/room?roomNumber=101&roomType=Single`

---

### 🛏️ Allocate a Room to Student

- **PUT** `/hostel/allocate?name=John Doe`

---

### 🚪 Vacate a Student's Room

- **DELETE** `/hostel/vacate?name=John Doe`

---

### 📋 List All Students

- **GET** `/hostel/students`

---

### 📋 List All Rooms

- **GET** `/hostel/rooms`

---

## 📄 Data Models

### Student

```json
{
  "id": 1,
  "name": "John Doe",
  "gender": "M",
  "age": 20,
  "roomPreference": "Single",
  "allocated": 101
}
```

### Room

```json
{
  "roomNumber": 101,
  "roomType": "Single",
  "isAvailable": false
}
```

---

## ⚠ Notes

- Student IDs are auto-generated internally.
- Room availability updates dynamically on allocation and vacating.
- Data is stored in-memory and will reset on server restart.

