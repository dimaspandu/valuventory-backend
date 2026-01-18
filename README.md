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

* Basic authentication (form login for development)
* Inventory item management (create, list)
* Item status tracking (ACTIVE, UNUSED, DONATE, SELL)
* Asset value storage and aggregation (manual input)
* Simple REST API for inventory access

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
* Spring Security (form login, development)
* H2 Database (development)
* PostgreSQL (planned for production)
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

This project is licensed under the MIT License. See the LICENSE file for details.
