# Library Management System

Web application built with Servlets, JDBC, MySQL, HTML and CSS.

## Features
- Add a book
- View all books
- Update a book
- Delete a book

## Technologies
- Java, Servlets (jakarta.servlet)
- JDBC and MySQL
- HTML and CSS
- Apache Tomcat 11

## Setup
1. Install MySQL and run `schema.sql`
2. Download MySQL Connector/J and put the jar in `src/main/webapp/WEB-INF/lib`
3. Set your MySQL password in `src/main/java/library/DBConnection.java`
4. Run the project on Apache Tomcat 11
5. Open http://localhost:8080/LibraryManagement/
