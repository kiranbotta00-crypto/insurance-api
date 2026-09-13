# Insurance Policy Management API

A RESTful backend application built with Java and Spring Boot for managing insurance policies.

## Features

- Create insurance policies
- Get policy by ID
- Get all policies
- Update policies
- Delete policies
- Request validation
- Global exception handling
- PostgreSQL database integration
- JPA/Hibernate persistence
- Swagger/OpenAPI documentation

## Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven
- REST API
- Jakarta Validation
- Swagger/OpenAPI
- Lombok

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | `/api/policies` | Create a policy |
| GET | `/api/policies/{id}` | Get policy by ID |
| GET | `/api/policies` | Get all policies |
| PUT | `/api/policies/{id}` | Update a policy |
| DELETE | `/api/policies/{id}` | Delete a policy |

## Sample Request

### Create Policy

```json
{
  "policyNumber": "POL1001",
  "customerName": "Rahul",
  "policyType": "HEALTH",
  "premium": 15000,
  "status": "ACTIVE"
}