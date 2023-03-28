# Project of the digital library

This project allows you to keep a digital record of books and readers in the library. User can register readers, give them
books and release books (after the reader returns
book back to the library).

## Built With

* [Spring](https://spring.io) - The web framework used
* [Hibernate](https://hibernate.org) - Object–relational mapping tool
* [Maven](https://maven.apache.org/) - Dependency Management
* [PostgreSQL](https://www.postgresql.org) - Relational database management system
* [Thymeleaf](https://www.thymeleaf.org) - Template engine

## Application description
On the app's home page you can see a list of readers, a list of books and find a book by title:
![home_page](/src/main/resources/screenshots/home_page.png)

You can see who is reading the book at the moment and find out if it's time to return it
![book_page](/src/main/resources/screenshots/book_page.png)

## Launching an application
You can run the application from any IDE by writing the paths to spring.datasource.url, spring.datasource.username, and spring.datasource.password in application.properties

#### Running from the command line:
1. At the root of the project, run the command to build the project:
````
mvn package
````

2. Go to the folder `target`:
````
cd target
````

3. Запустить проект:
````
java -jar <filename.jar>
````
