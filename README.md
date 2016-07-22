# Help desk

This web-based application is a resource intended to provide the end user with information and support, troubleshoot problems.

## Main features:
 - creation of new tasks
 - attach files to tasks
 - solving tasks by moderators
 - user registration / login / logout
 - user passwords stored in encrypted form

## Used technologies:
 - Spring (web-mvc, security, orm, test)
 - Hibernate
 - PostgreSQL
 - JUnit
 - REST - services
 - JSP + JS + CSS

## Version:
0.0.2 alpha

## Installation:
 - copy helpdesk.war into your deploy directory
 - for auto create tables uncomment: ```hibernate.hbm2ddl.auto=create``` in ```src/main/resources/hibernate.properties```
 - execute ```INSERT INTO users VALUES (1, 'admin', '$2a$10$1TyRpp5d7ReFtjcnnXmaFe3cP47D5xZGEfbcESJhvU9bttyTF50Eq', 'ROLE_ADMIN');``` to insert into DB first user with admin rights (defauld password: admin)

## License:
Freeware
