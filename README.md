Why spring boot?
--------------------
1. Spring Boot is a sub module of Spring framework which we speed us the development
2. Spring Boot makes it easy to create stand-alone , production-grade spring based application that you can 
   "just run"

What is Spring boot ?
---------------------
It provides	an easier and faster way to set up , configure , and run both simple and web based application.

Advantage?
----------
1. It create stand-alone spring applications that can be started using java -jar 
2. Embedded Tomcat we will get 
3. Provide option for starter dependencies to simplify your build configuration
4. automatically configure spring and 3rd party libraries whenever possible
5. provide production ready features such as metrices , health checks , and externelazied configuration
6. no XML required


How to configure jsp page in boot application:-
----------------------------------------------
1. Create view folder

src
 |-main
 	 |-webapp
 	 	   |-views
 	 	        |-views
 	 	             |-home.jsp
 	 	             |-contact.jsp

2. Write this in applicaiton.properties

spring.mvc.view.prefix=views/
spring.mvc.view.suffix=.jsp

3. Open google download dependency of tomcat-embed-jasper and paste into in pom.xml

<!-- https://mvnrepository.com/artifact/org.apache.tomcat.embed/tomcat-embed-jasper -->
<dependency>
    <groupId>org.apache.tomcat.embed</groupId>
    <artifactId>tomcat-embed-jasper</artifactId>
    <version>9.0.37</version>
</dependency>

