# Java Database Operations with MySQL and Swing UI

## About the Project

This project is developed in Java and performs database operations using MySQL. The user interface is built with Java Swing. It demonstrates basic database connection, login function based on database, data querying, and data presentation through a graphical user interface.

## Features

- **Database Operations:** Connects to a MySQL database to perform CRUD (Create, Read, Update, Delete) operations.
- **User Interface:** A modern and user-friendly UI built using Java Swing.
- **Configurable:** Easily update the database connection settings to suit your environment.

## Requirements

- Java Development Kit (JDK) 8 or higher
- MySQL Server
- MySQL Connector/J (JDBC driver)
- An IDE (such as IntelliJ IDEA, Eclipse, etc.) is recommended

## Setup and Execution

1. **Run the Provided SQL File:**
   - Execute the SQL file included with the project on your MySQL server to create the required database and tables.

2. **Update Database Connection Settings:**
   - In the source code, ConnectorSQL class, locate the connection string line:
     ```
     "jdbc:mysql://localhost:3306/sitesdatabase", "root", "asdbnm1122"
     ```
   - Change the username (`root`) and password (`asdbnm1122`) to match your MySQL server configuration.

3. **Import the Project:**
   - Import the project into your preferred IDE.

4. **Compile and Run:**
   - Build the project.
   - Run the FavoriteSites class (the one containing the `main` method) to start the application.

## Usage

Once the application starts, you can view data from the database through the Swing UI and perform various CRUD operations. Ensure that the database connection details are correctly configured before proceeding.



