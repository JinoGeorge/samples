## A Book Catalog with spring boot

### init with spring-boot cli
$ spring init --description="Book Catalog" -n=BookCat -g=com.samples.spring -a=bookcat --package-name=com.samples.spring --build=maven -j=1.8 -p=jar -d=h2,jdbc,jpa -x

### running the project
$ mvn clean spring-boot:run

### components
1. CommandLine runner
2. Logback logging
3. Data source config with application.properties (In debug mode H2 is used and you should see the following file in your home directory: test.mv.db)

   If you want to connect to a regular (non-embedded) database, besides just having the
   appropriate driver library in the classpath, we need to specify the driver of our choice in
   the configuration. The following snippet is what the configuration to connect to MySQL
   would resemble:
````
   spring.datasource.driver-class-name: com.mysql.jdbc.Driver
   spring.datasource.url: jdbc:mysql://localhost:3306/springbootcookbook
   spring.datasource.username: root
   spring.datasource.password:
````   
   If we wanted Hibernate to create the schema automatically, based on our entity classes, we
   will need to add the following line to the configuration:
4. 