# Enghouse Backend

A Spring Boot based backend application for the Enghouse project that manages questions and answers.

## Overview

This application provides a RESTful API to manage questions and their corresponding answers. It uses Spring Boot with JPA for data persistence.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Maven
- MySQL (Database)

## Project Structure

The project follows a standard Spring Boot application structure:

- `src/main/java/com/Enghouse/demo/model`: Contains entity classes like Questions
- `src/main/java/com/Enghouse/demo/repository`: Data access interfaces
- `src/main/java/com/Enghouse/demo/service`: Business logic layer
- `src/main/java/com/Enghouse/demo/controller`: REST endpoints
- `src/main/resources`: Configuration files

## Getting Started

### Prerequisites

- Java 17
- Maven
- Database (MySQL)

### Installation

1. Clone the repository
   ```bash
   git clone https://github.com/Meera27/enghouse-backend.git
   cd enghouse-backend
   ```

The application will start on port 8080 by default.

## API Endpoints

- `GET /all`: Retrieve all questions
- `POST /add`: Adds an answer

## Development

### Adding New Features

1. Create model classes in the `model` package
2. Create corresponding repositories in the `repository` package
3. Implement service logic in the `service` package
4. Expose APIs through controllers in the `controller` package

