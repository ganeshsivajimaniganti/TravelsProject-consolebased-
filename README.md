# TravelsProject-consolebased-
# 🚗 Ramu Travels – Console-Based Travel Booking System

A **console-based travel booking system** built using **Core Java** and **JDBC** for seamless database interaction.

---

## 🧭 Project Overview

**Ramu Travels** provides a simple yet powerful solution for managing travel bookings.  
It includes **user authentication**, **journey planning**, **fare calculation with weekend charges**, and **static route management**.  
The application emphasizes **clean code structure**, **exception handling**, and **scalability** for future enhancements.

---

## ✨ Features

✅ **User Authentication** — Sign-up, Sign-in, and Account lock after 5 failed login attempts  
✅ **Journey Management** — Plan and reschedule journeys with ease  
✅ **Fare Calculation** — Includes extra weekend charges automatically  
✅ **Static Route Management** — Predefined routes for simplified operations  
✅ **Robust Exception Handling** — Ensures smooth execution without crashes  
✅ **Modular Architecture** — Organized and maintainable code design  

---

## 🗂️ Project Structure

📦 Ramu Travels
└── 📁 src
└── 📁 com
├── ⚙️ DatabaseUtil.java
├── 🚀 Main.java
├── 📁 model
│ ├── 🧳 Journey.java
│ ├── 👤 User.java
│ ├── 🧾 Order.java
│ └── 🗺️ Route.java
└── 📁 service
├── ✈️ JourneyService.java
└── 👥 UserService.java


---

## 🗃️ Database Design

Before running the project, create the following tables in your database:

| Table Name | Columns |
|-------------|----------|
| **routes** | `route_id`, `source`, `destination`, `journey_date`, `no_of_seats_available`, `ticket_price_per_passenger` |
| **users** | `id (AUTO_INCREMENT)`, `firstname`, `lastname`, `gender`, `password`, `full_name`, `email`, `mobilenumber`, `is_locked`, `failed_count` |
| **orders** | `order_id`, `user_id`, `route_id`, `order_amount`, `no_of_passengers`, `order_status` |

---

## ⚙️ Setup & Run Instructions

1. ☕ Install **Java (JDK 8 or above)** and a **JDBC-compatible database** (e.g., MySQL).  
2. 🧩 Import the project into your favorite **IDE (Eclipse / IntelliJ / VS Code)**.  
3. 📁 Add the **JAR file** for JDBC (e.g., `mysql-connector-java.jar`) to your project’s build path.  
4. 🛠️ Configure your **database connection** in `DatabaseUtil.java`.  
5. ▶️ Run `Main.java` to start the console-based application.  

---

## 🧰 Technologies Used

| Technology | Description |
|-------------|--------------|
| ☕ **Core Java** | For application logic and modular structure |
| 🗄️ **JDBC** | For connecting and executing SQL queries on the database |
| 🧩 **MySQL / Any SQL DB** | For persistent storage of routes, users, and orders |

---

## 💡 Future Enhancements

🚀 Add dynamic route management (CRUD operations)  
📅 Implement real-time seat availability tracking  
🌐 Develop GUI / Web-based version using Spring Boot  

---

## 👨‍💻 Author

**Ganesh Sivaji Maniganti**  
🎓 B.Tech CSE | Aspiring Full Stack Java Developer  
📫 _Feel free to connect for collaboration or feedback!_

---

⭐ *If you like this project, don’t forget to give it a star on GitHub!* ⭐
