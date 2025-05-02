# QuizMaster-Microservices (E-commerce Microservices Architecture)

This is a complete backend for an e-commerce application built using **Spring Boot Microservices architecture**. It includes service discovery, API Gateway, load balancing, inter-service communication, and database integration.

---

## 🧩 Microservices Overview

| Service             | Description                                         |
|---------------------|-----------------------------------------------------|
| **Service Registry** | Eureka Server for service registration & discovery |
| **API Gateway**      | Routes external traffic to internal services       |
| **Quiz Service**     | Handles quiz-related business logic (CRUD)         |
| **Question Service** | Handles question-related logic and DB operations   |

---

## 🔧 Technologies Used
- Java (Spring Boot)
- Spring Cloud (Eureka, Gateway, OpenFeign)
- MySQL (or PostgreSQL)
- Docker (optional)
- Spring Boot Actuator (service monitoring)

---

## Access Endpoints:

- API Gateway: http://localhost:8080

- Eureka Dashboard: http://localhost:8761

- Quiz API (via gateway): http://localhost:8080/Quiz

- Question API (via gateway): http://localhost:8080/Question

---
  

## ✅<b> Features Implemented :

- ✅ Microservice Communication via OpenFeign

- ✅ Load Balancing using Eureka + Gateway

- ✅ API Routing via Spring Cloud Gateway

- ✅ Service Registry with Eureka

- ✅ MySQL Database Integration

- ✅ Service Monitoring with Spring Boot Actuator

---


