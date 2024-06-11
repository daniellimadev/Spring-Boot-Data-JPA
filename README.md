# Spring Boot JPA!

# Description
This simple application was made with the aim of practicing all the mapping of Java relational objects to the database, also implementing relationships between entities OneToOne, OneToMany, ManyToOne, ManyToMany, using Repositories!

# Application installation

First, clone the repository:
```
git clone https://github.com/daniellimadev/Spring-Boot-Data-JPA.git
```
Once done, access the project:
```
cd Spring-Boot-Data-JPA
```
You need to compile the code and download the project dependencies:
```
mvn clean package
```
Once this step is complete, let's start the application:
```
mvn spring-boot:run
```

## Prerequisite

Before running the application, you must ensure that the following dependencies are correctly installed:

```
Java 21
Docker
Maven
```

To run the MySQL database in Docker, just docker compose:
```
docker-compose up -d
```

# To test the Endpoints follow the parameters below:

## Author

Create Author:

POST : http://localhost:8080/bookstore/authors

In JSON parameters:

```
{"name": "Joshua Bloch"}
```

Get All Authors:

GET : http://localhost:8080/bookstore/authors

It returns in JSON:

```
{
   "id": 1,
   "name": "Joshua Bloch"
}
```

## Publisher

Create Publisher:

POST : http://localhost:8080/bookstore/publishers

In JSON parameters:

```
{"name": "O'Reilly Media"}
```

Get All Publishers:

GET : http://localhost:8080/bookstore/publishers

It returns in JSON:

```
{
   "id": 1,
   "name": "O'Reilly Media"
}
```

## Book

Create Book:

POST : http://localhost:8080/bookstore/books

In JSON parameters:

```
{
    "title": "Effective Java",
    "publisherId": 1,
    "authorIds": [1, 1],
    "reviewComment": "Great book for Java developers!"
}
```

Get All Books:

GET : http://localhost:8080/bookstore/books

It returns in JSON:

```
{
   "id": 1,
   "name": "O'Reilly Media"
}
```

Delete Book:

DELETE : http://localhost:8080/bookstore/books/{id}

<h3>Author</h3>

<a href="https://www.linkedin.com/in/danielpereiralima/">
 <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/96916005?v=4" width="100px;" alt=""/>

Made by Daniel Pereira Lima 👋🏽 Contact!

[![Linkedin Badge](https://img.shields.io/badge/-Daniel-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/danielpereiralima/)](https://www.linkedin.com/in/danielpereiralima/)

