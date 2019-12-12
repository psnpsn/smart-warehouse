# Smart Warehouse Project
## Microserivce architecture, this application is for managing a smart warehouse internal system
### Developped by X-Bit ( Members are this repository's collaborators ) 

### Technologies used 
```
Spring Boot 2.2
Maven
Java
RabbitMQ
Mongodb
MySQL
```

# a 10 Microservice Architechture !
This project is developped in a 10 Microservices architecture which are : 
## MSProducts port 8080
Used for CRUD operations on products, their category and location within the warehouse and intercepting the read tags of products
Spring Boot, Spring Webflux, ReactiveMongo, Spring Cloud Stream RabbitMQ
## MSEmployees port 8081
Used for CRUD operations on the warehouse employees and intercepting read badges from doors
Spring Boot, Spring Webflux, ReactiveMongo, Spring Cloud Stream RabbitMQ
## MSSupplier port 8082
Used for CRUD operations on suppliers of products
Spring Boot, Spring Web, Mongo
## MSForklift port 8083
Used for CRUD operation on forklifts within the warehouse
Spring Boot, Spring Web, Mongo
## MSConditions port 8086
Used for visualizing conditions of the warehouse
Spring Boot, Spring Web, MySQL
## MSTagReader port 8084
Used for reading tags and publishing to the RabbitMQ topics to be consumed by the subsribers
Spring Boot, Spring Web, Spring Cloud Stream RabbitMQ
## MSProxy port 8765
This microservice the default application gateway, Netflix Zuul
## MSDiscovery port 8761
This is an Eureka server used for discovering and registering microservices
## MSConfigServer port 8888
This config server is used to get the microservices config from the cloud, from github repo in our case

## How to use
1. Install any Java IDE with Java 1.8 JDK
2. Intall Maven and POSTMAN
3. clone repository into a new folder
4. Build the microservice `mvn build`
5. Run in order: MSDiscovert, MSConfigServer then any microservice `mvn run` then test with POSTMAN
6. Run MSProxy then use localhost:8765/microservce_name/** on POSTMAN to run the same operations
