# sample-spring-boot-db-1
Proyecto Demo Spring Boot con conexión a base de datos

# Clone project

```
git clone https://github.com/stockcrowd/sample-spring-boot-db-1.git
```

# Run

To build and run:

    mvn spring-boot:run

or create the jar

    mvn clean package
    java -jar target\sample-spring-boot-sample-db-1-1.0.0-SNAPSHOT.jar
    
# Test

On the browser, enter [http://localhost:9002/](http://localhost:9002/)
    
    curl http://localhost:9002/pfp

# View DB Data    

On the browser, enter [http://localhost:9002/h2-console](http://localhost:9002/h2-console)

Enter the following data

	JDBC URL: jdbc:h2:mem:test
	User Name: sa
	Pasword: <leave this empty>
  
