
````markdown
# BankMicroservices

A full-fledged microservices-based banking system built using **Spring Boot**, **Spring Cloud**, **Eureka**, **Zuul**, **JWT**, and **MySQL**. This project demonstrates a modular, scalable architecture suitable for real-world fintech applications.

---

## 🧩 Architecture Overview

This project follows a **Microservices Architecture** and includes the following components:

### Core Microservices
- **Auth-Service**: Handles user authentication and JWT token generation.
- **Account-Service**: Manages customer account operations (e.g., account creation, balance inquiry).
- **Transaction-Service**: Handles credit/debit transactions between accounts.

### Supporting Services
- **API Gateway (Zuul)**: Entry point to all microservices, routes requests, and applies filters.
- **Service Discovery (Eureka Server)**: Registers and discovers services dynamically.
- **Config Server** *(if applicable)*: Centralized configuration management for all services.
  
---

## 🔐 Security

- JWT-based authentication.
- Role-based access control.
- Auth-Service issues and validates tokens across services via request headers.

---

## 🧱 Tech Stack

| Layer                | Technology                             |
|---------------------|----------------------------------------|
| Core Framework      | Spring Boot, Spring Cloud              |
| Service Discovery   | Eureka                                 |
| API Gateway         | Zuul                                   |
| Security            | Spring Security, JWT                   |
| Database            | MySQL                                  |
| ORM                 | Spring Data JPA                        |
| Config Management   | Spring Cloud Config (optional)         |
| Build Tool          | Maven                                  |
| Testing             | JUnit, Mockito                         |

---

## 🔧 Setup Instructions

### Prerequisites

- Java 11+
- Maven 3.6+
- MySQL 8+
- Postman (for testing APIs)

### Steps

1. **Clone the repository:**
   ```bash
   git clone https://github.com/sauravdaruka/BankMicroservices.git
   cd BankMicroservices
````

2. **Set up MySQL Database:**

   * Create databases: `auth_db`, `account_db`, `transaction_db`
   * Update database credentials in `application.properties` or `application.yml` in each microservice.

3. **Run Eureka Server**

   ```bash
   cd discovery-server
   mvn spring-boot:run
   ```

4. **Run Auth, Account, and Transaction Services**

   ```bash
   cd auth-service
   mvn spring-boot:run

   cd ../account-service
   mvn spring-boot:run

   cd ../transaction-service
   mvn spring-boot:run
   ```

5. **Run API Gateway (Zuul)**

   ```bash
   cd api-gateway
   mvn spring-boot:run
   ```

6. **Test API using Postman:**

   * First, authenticate via `/auth/login`
   * Use JWT token to call secure endpoints in account and transaction services

---

## 🔍 Sample API Endpoints

### Authentication

```http
POST /auth/login
```

```json
{
  "username": "john",
  "password": "password"
}
```

### Account Operations (via Gateway)

```http
GET /api/accounts/{id}
```

### Transactions

```http
POST /api/transactions
```

---

## 🚀 Features

* Microservices with independent deployment
* JWT-secured APIs
* Centralized routing via API Gateway
* Service discovery via Eureka
* Scalable and loosely coupled architecture
* DTOs for service communication

---

## 🧪 Future Improvements

* Dockerize all services with Docker Compose
* Add circuit breaker with Resilience4j
* Implement distributed tracing using Zipkin
* Include Swagger/OpenAPI documentation

---

## 🙌 Author

**Saurav Daruka**

* 💼 [LinkedIn](https://www.linkedin.com/in/sauravdaruka)
* 📧 [saurav.daruka@gmail.com](mailto:saurav.daruka@gmail.com)

```
