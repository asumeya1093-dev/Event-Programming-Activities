# University Management System — Week 10

Student: Ahmed Sumeya

Project folder: `UniversitySystem`  
Package: `com.university`  
Database: `university_db`

Based on the lecturer’s Week 10 capstone guide. JavaFX UI, background database tasks, observable properties, and five-second heartbeat.

## Setup

1. Start MySQL in XAMPP or MySQL Server.
2. Run `database_setup.sql` using an administrator account in phpMyAdmin or MySQL Workbench.
3. The Java connection uses `localhost:3306`, user `sumeya_app`, and local development password `Campus@2026!`. Change the port in `DatabaseUtil.java` to `3307` if your MySQL installation runs on that port.
4. From the `UniversitySystem` folder, run `mvn clean javafx:run`.

Do not publish actual database passwords in a public repository. For production, use environment variables or a private configuration.

The Java code and file names follow the supplied lecturer reference; the database login is customized. The missing HBox import in the reference FXML was added.

Not tested against a live MySQL server in this environment.
