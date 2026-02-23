# 🌱 Spring Boot REST API - Fundamentals

> A practical implementation of Spring Boot RESTful web services, exploring routing, path variables, and query parameters.

## 📖 Project Overview

This application was developed as part of the **IT3030 - Programming Applications and Frameworks (PAF)** module. It demonstrates the core concepts of building a backend API from scratch, progressing from a basic web server to handling dynamic, user-customized requests. 

The project highlights the transition from standard configurations to a fully functional REST controller capable of processing web requests efficiently.

## 🛠️ Technologies Used

* **Language:** Java (JDK 18+)
* **Framework:** Spring Boot 3.x
* **Dependencies:** Spring Web
* **Build Tool:** Maven
* **IDE:** Visual Studio Code

---

## 🚀 Getting Started

Follow these instructions to get a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites
* Java Development Kit (JDK) 18 or higher installed.
* Maven installed (or use the provided Maven wrapper).

### Running the Application
1. Clone the repository to your local machine.
2. Open the project folder in your preferred IDE (e.g., VS Code).
3. Run the `PafApplication.java` main class.
4. The server will start on port `8080`. *(Note: If port 8080 is occupied, you can change it in `src/main/resources/application.properties` using `server.port=8081`)*.

---

## 📡 API Reference

Below are the endpoints available in this application and examples of how to interact with them.

| Endpoint | Method | Parameters | Description | Example Output |
| :--- | :---: | :--- | :--- | :--- |
| `/` | `GET` | None | Returns a basic welcome message. | `Hello world!` |
| `/hello` | `GET` | `name` (Query, Optional) | Greets the user based on the provided query parameter. Defaults to "World". | `Hello Amith` |
| `/greet/{username}` | `GET` | `username` (Path, Required) | A personalized greeting using a URL path variable. | `Hello John! Welcome to Spring Boot!` |
| `/greet/{username}` | `GET` | `username` (Path, Required)<br>`message` (Query, Optional) | Combines a path variable with an optional query parameter to customize the greeting. | `Hello John! Good to see you!` |

### Example Usage (Browser or Postman)
* **Basic Query Parameter:** `http://localhost:8080/hello?name=Amith`
* **Custom Message:** `http://localhost:8080/greet/John?message=Good%20to%20see%20you!`

---

## 👨‍💻 Author

**K.P.C.L.B.Peellawatta** <br>
**Student ID: IT23347908**
* Module: IT3030 - Programming Applications and Frameworks (PAF)
