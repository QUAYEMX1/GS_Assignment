## GrowSpace ToDo Application

This project is a simple ToDo application with a Java backend built using Spring Boot, and a frontend developed using HTML, CSS, and JavaScript. The backend provides RESTful APIs for managing ToDo items, while the frontend offers a user-friendly interface for interacting with the ToDo list.

## Features:-
Create a ToDo: Users can create a new ToDo item by entering a task and submitting it.

List ToDos: The application lists all ToDo items in descending order of their creation date, along with their status.

Update ToDo Status: Users can mark a ToDo item as completed or incomplete by updating its status.

Project Structure:-

Backend:-

Framework: Spring Boot

Language: Java

Development Environment: IntelliJ IDEA

Controller Class:

The ToDoController class handles API requests for creating, retrieving, and updating ToDo items.
The endpoints are as follows:
POST /todos/create: Create a new ToDo item.
GET /todos/get: Retrieve all ToDo items.
PUT /todos/change/{id}: Update the status of a ToDo item.
GET /todos/say: Custom endpoint to return ToDos in a specific format.

Frontend:-
Languages: HTML, CSS, JavaScript
Development Environment: Visual Studio Code (VS Code)
UI Design:
The frontend is designed to be simple and intuitive, allowing users to easily add tasks and manage their ToDo list.
Users can see the tasks listed with options to mark them as completed.

Technologies Used:-
Backend:
Java Spring Boot

Frontend:
HTML CSS JavaScript

Database:
MySQL

Development Tools:
IntelliJ IDEA (Backend) Visual Studio Code (Frontend)

