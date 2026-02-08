📘 Endterm Booking API
📌 Project Description

This project is a Spring Boot REST API developed as an Endterm Project.
The system simulates a Booking platform that supports different booking types such as Hotel and Flight, implemented using Builder and Factory design patterns.

The main goal of the project is to demonstrate clean architecture, OOP principles, and correct usage of design patterns in a real backend application.

🛠 Technologies Used

Java 17+

Spring Boot

Maven

REST API

Builder Pattern

Factory Pattern

SQLite (optional / schema-based)

Git & GitHub

🧩 Design Patterns
🔹 Builder Pattern

Used to create complex Booking objects step-by-step.

BookingBuilder

HotelBookingBuilder

FlightBookingBuilder

BookingDirector

This allows flexible object creation without large constructors.

🔹 Factory Pattern

Used to determine which booking type should be created based on input data.

BookingFactory

📂 Project Structure
src/main/java/kz/aitu/endtermbookingapi
│
├── controller        → REST Controllers
├── dto               → Request DTOs
├── model             → Booking Models
├── patterns
│   ├── builder       → Builder Pattern implementation
│   └── factory       → Factory Pattern
├── service            → Business Logic
└── EndtermBookingApiApplication.java

🚀 How to Run the Project
1️⃣ Clone the repository
git clone https://github.com/Maksat166/endterm-booking-api.git

2️⃣ Navigate to project folder
cd endterm-booking-api

3️⃣ Run the application
mvn spring-boot:run


The application will start on:

http://localhost:8081

🔌 API Endpoints
➤ Create Booking

POST /bookings

Example JSON (Hotel Booking):

{
  "type": "hotel",
  "customerName": "Maksat",
  "startDate": "2026-02-12",
  "endDate": "2026-02-15",
  "price": 20000,
  "hotelName": "Rixos Astana",
  "roomType": "LUX"
}

➤ Get All Bookings

GET /bookings

Returns a list of all created bookings.


