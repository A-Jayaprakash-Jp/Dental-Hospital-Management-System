# 🦷 Dental Hospital Management System

A backend application developed using **Spring Boot** to manage dental hospital operations such as patient registration, doctor management, appointment scheduling, and medical records.  
This project is developed as part of the **Backend Frameworks** course.

---

## 📌 Project Overview

The **Dental Hospital Management System** provides a centralized and structured backend solution for managing dental hospital data.  
It replaces manual record keeping with RESTful APIs and database integration to ensure **efficiency, scalability, and data consistency**.

The system is designed using a **layered architecture** and supports CRUD operations for all major hospital entities.

---

## 🎯 Objectives

- Implement a layered backend architecture
- Develop RESTful APIs using Spring Boot
- Manage patients, doctors, appointments, and medical records
- Integrate MySQL database using JPA and Hibernate
- Ensure validation and centralized exception handling
- Build a scalable and maintainable backend system

---

## 🛠️ Technology Stack

| Technology | Purpose |
|---------|--------|
| Java | Backend programming |
| Spring Boot | REST API development |
| Spring Data JPA | Database abstraction |
| Hibernate | ORM implementation |
| MySQL | Relational database |
| Maven | Dependency management |
| Postman | API testing |
| GitHub | Version control |

---

## 🧱 System Architecture

The application follows a **layered architecture**:

- **Controller Layer** – Handles HTTP requests and responses
- **Service Layer** – Contains business logic
- **Repository Layer** – Handles database operations
- **Model Layer** – Defines entity classes and relationships

This architecture improves maintainability, scalability, and separation of concerns.

---

## 📦 Modules Implemented

- **Patient Management**
- **Doctor Management**
- **Appointment Scheduling**
- **Medical Record Management**
- **Admin Management**

---

## 🗃️ Database Design

The project uses a **relational database (MySQL)** with proper relationships:

- One Patient → Many Appointments
- One Doctor → Many Appointments
- One Patient → Many Medical Records

Foreign keys are used to maintain referential integrity.

---

## 🔗 API Endpoints

### Patient APIs
| Method | Endpoint | Description |
|------|--------|------------|
| POST | `/patients` | Add new patient |
| GET | `/patients` | Get all patients |
| GET | `/patients/{id}` | Get patient by ID |
| PUT | `/patients/{id}` | Update patient |
| DELETE | `/patients/{id}` | Delete patient |

### Doctor APIs
| Method | Endpoint | Description |
|------|--------|------------|
| POST | `/doctors` | Add new doctor |
| GET | `/doctors` | Get all doctors |
| GET | `/doctors/{id}` | Get doctor by ID |
| PUT | `/doctors/{id}` | Update doctor |
| DELETE | `/doctors/{id}` | Delete doctor |

### Appointment APIs
| Method | Endpoint | Description |
|------|--------|------------|
| POST | `/appointments` | Schedule appointment |
| GET | `/appointments/{id}` | Get appointment by ID |
| GET | `/appointments/status/{status}` | Get appointments by status |
| PUT | `/appointments/{id}` | Update appointment |
| DELETE | `/appointments/{id}` | Cancel appointment |

### Medical Record APIs
| Method | Endpoint | Description |
|------|--------|------------|
| POST | `/medicalrecords` | Add medical record |
| GET | `/medicalrecords/{id}` | Get medical record |
| GET | `/medicalrecords/patient/{id}` | Get records by patient |
| PUT | `/medicalrecords/{id}` | Update medical record |
| DELETE | `/medicalrecords/{id}` | Delete medical record |

---

## ⚠️ Exception Handling & Validation

- Centralized exception handling using `@ControllerAdvice`
- Validation annotations prevent invalid data
- Proper HTTP status codes returned:
  - `200 OK`
  - `201 Created`
  - `204 No Content`
  - `400 Bad Request`
  - `404 Not Found`

---

## 🧪 API Testing

All APIs are tested using **Postman** to verify:
- Correct request handling
- Proper response structure
- Error handling
- HTTP status codes

---

## 🌍 Sustainable Development Goals (SDGs)

This project supports the following SDGs:

- **SDG 3 – Good Health and Well-Being**
- **SDG 9 – Industry, Innovation and Infrastructure**
- **SDG 16 – Peace, Justice and Strong Institutions**
- **SDG 17 – Partnerships for the Goals**

---

## 🚀 Future Enhancements

- JWT-based authentication and authorization
- Role-Based Access Control (RBAC)
- Swagger / OpenAPI documentation
- Frontend or mobile application integration
- Caching for performance optimization
- Cloud deployment and Dockerization

---

## 📌 How to Run the Project

1. Clone the repository
   ```bash
   git clone https://github.com/your-username/Dental-Hospital-Management-System.git
