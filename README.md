# TravelsProject-consolebased-
# Ramu Travels

A console-based travel booking system developed using Core Java and JDBC for database interaction.

## Project Overview

Ramu Travels offers a modular and maintainable solution for travel bookings with features such as user authentication, journey planning, fare calculation including extra weekend charges, and static route management. The system ensures smooth execution with exception handling and is designed for scalability.

## Features

- User authentication with sign-up, sign-in, and account lock after five failed login attempts.
- Journey planning and rescheduling modules.
- Fare calculation with additional charges for weekend travel.
- Static travel route management.
- Robust exception handling for error-free execution.
- Modular code organization for clarity and maintainability.

## Project Structure

Ramu Travels/
└── src/
└── com/
├── DatabaseUtil.java
├── Main.java
├── model/
│ ├── Journey.java
│ ├── User.java
│ ├── Order.java
│ └── Route.java
└── service/
├── JourneyService.java
└── UserService.java


## Database Tables

The system uses the following database tables which you need to create before running the application:

Database Tables and Attributes
routes:
route_id, source, destination, journey_date, no_of_seats_available, ticket_price_per_passenger

users:
firstname, lastname, gender, password, full_name, email, mobilenumber, is_locked, failed_count, id (auto_increment)

orders:
order_id, user_id, route_id, order_amount, no_of_passengers, order_status

## Setup and Run

1. Ensure you have Java and JDBC-compatible database installed.
2. Import the project into your IDE.
3. Add the required JAR file to your project's build path.
4. Configure database connection settings in `DatabaseUtil.java`.
5. Run `Main.java` to start the application.

## Technologies Used

- Core Java
- JDBC for database connectivity


