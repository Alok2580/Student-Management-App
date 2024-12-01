
# Student Management App  

This repository contains a **Student Management App**, a simple Java-based application to manage student records. The app leverages **JDBC** for database connectivity and uses **MySQL** for managing and querying the data. It allows users to perform CRUD (Create, Read, Update, Delete) operations efficiently.  

## Features  
- **Add Students**: Save new student details in the MySQL database.  
- **Update Records**: Modify existing student information.  
- **Delete Records**: Remove student records from the database.  
- **View Details**: Display all students’ data in a tabular format.  

## Repository Link  
Find the project code here: [Student Management App](https://github.com/Alok2580/Student-Management-App).  

## Prerequisites  
### Tools and Technologies  
- **Java**: Core language for backend development.  
- **JDBC**: For database connectivity.  
- **MySQL**: As the relational database system.  

Ensure you have:  
1. Java 8+ installed on your system.  
2. MySQL server running with appropriate user credentials.  

## Getting Started  
### Installation  
1. Clone the repository:  
   ```bash  
   git clone https://github.com/Alok2580/Student-Management-App.git  
   cd Student-Management-App  
   ```  

2. Set up the database:  
   - Create the required database schema using the provided SQL file (`schema.sql`).  
   - Update the `db-config.properties` file with your MySQL credentials and database details.  

3. Build the project:  
   ```bash  
   mvn clean install  
   ```  

### Running the App  
1. Start the application:  
   ```bash  
   java -jar target/student-management-app.jar  
   ```  

2. Use the application to manage student records.  

## Key Components  
- **`Student.java`**: Represents the student entity.  
- **`StudentService.java`**: Contains business logic for CRUD operations.  
- **`DatabaseHandler.java`**: Manages database connectivity and SQL queries using JDBC.  
- **`MainApp.java`**: Entry point for the application.  

## Future Improvements  
- Add a graphical user interface (GUI) using Swing or JavaFX.  
- Implement advanced search and filtering options.  
- Support exporting and importing data in CSV or Excel formats.  

## Contributing  
Contributions are welcome! Please fork the repository, make changes, and submit a pull request.  

## License  
This project is licensed under the MIT License. See the `LICENSE` file for details.  

