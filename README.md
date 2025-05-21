# 🚗 Parking Lot Management System

A simple Spring Boot RESTful API to manage a vehicle parking lot, including vehicle entries, exits, and waiting list handling.

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
   git clone https://github.com/your-username/ParkingManagement.git
   cd ParkingManagement
   ```

2. Build and run the application:

   ```bash
   mvn spring-boot:run
   ```

3. Access the API at: `http://localhost:8080/parking`

---

## 📚 API Endpoints

### ➕ Vehicle Entry

- **POST** `/parking`
- **Request Body:**

```json
{
  "vehicleNumber": "KA01AB1234"
}
```

---

### ❌ Vehicle Exit

- **POST** `/parking/exit/{vehicleNumber}`

Returns the entry and exit time along with total parking duration in minutes.

---

### 📊 Parking Lot Status

- **GET** `/parking/status`

Returns available slots, occupied slots, and list of vehicles in the lot and waiting.

---

## 📄 Data Model

### Vehicle

```json
{
  "vehicleNumber": "KA01AB1234",
  "entryTime": "10:30:00",
  "exitTime": "11:00:00"
}
```

---

## ⚠ Notes

- Maximum parking slots: 10
- If all slots are full, incoming vehicles are added to a waiting list.
- When a vehicle exits, the first vehicle in the waiting list is moved into the parking lot.
- All data is stored in memory and resets when the application restarts.
