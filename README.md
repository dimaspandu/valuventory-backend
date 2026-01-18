# Valuventory

## Description

Valuventory is a Java-based backend system designed to help individuals or small businesses track owned items, understand asset value, and decide whether items should be kept, donated, or sold.

The system focuses on clarity, maintainability, and real-world business rules. It is designed as a foundation that can later be extended with AI-based recommendations and messaging integrations (such as WhatsApp), without overengineering the initial MVP.

This project is also intended as a practical learning and reference project for modern Java and Spring Boot development.

---

## Goals

* Track personal or small business inventory
* Identify items that are no longer in use
* Calculate total and current asset value
* Support decisions to keep, donate, or sell items
* Provide a clean and extensible backend architecture

---

## Core Features (MVP)

* User registration and authentication
* Inventory item management (create, update, list)
* Item status tracking (in use, unused, broken)
* Asset value calculation with simple depreciation rules
* Filtering unused or inactive items
* Action tagging (keep, donate, sell)

---

## Domain Overview

### User

* Owns inventory items
* Authenticates to access the system

### Item (Inventory)

* Name and category
* Purchase date and purchase price
* Current estimated value
* Usage status
* Recommended or selected action

---

## Business Rules (Initial)

* Items not used for more than 12 months may be considered unused
* Item value decreases over time using simple depreciation logic
* Low-value unused items are candidates for donation
* Higher-value unused items are candidates for resale

---

## Technology Stack

* Java 21 (LTS)
* Spring Boot 3
* Spring Web
* Spring Data JPA
* Spring Security (JWT-based authentication)
* PostgreSQL (production)
* H2 Database (development)
* Maven

---

## Project Structure (Planned)

```
controller/
service/
repository/
entity/
dto/
security/
```

---

## Development Approach

* Start with a simple, clean MVP
* Avoid premature optimization or overengineering
* Focus on readable and maintainable code
* Use clear separation of concerns

---

## Future Enhancements

* AI-based inventory analysis and recommendations
* WhatsApp or chat-based inventory assistant
* Image-based item input
* Organization and multi-user support
* Subscription-based SaaS model

---

## License

This project is intended for learning and experimental purposes. Licensing can be adjusted as the project evolves.
