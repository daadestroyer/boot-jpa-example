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

API(Application Programmable Interface):-
-----------------------------------------
1. It is a set of rules that allow programs to talk to each other . The developer creates the API on the 
   server and allows the client to talk to it

2. With the help of API we can communicate with third party persons codes
3. For example we use paytm transaction API in our website when user do some payment then our website code calls paytm website code for transaction and then we will get response 

REST(Represential State Transfer):-
-----------------------------------
1. A set of constraints to be used for creating web services
2. REST API is simply a sub set of API 
3. It is the architecture for creating webstie , means there are some standard to create REST API
4. REST API follow client-server , cachabled , stateless , layered
5. Some important methods of HTTP are :-
   GET : to get the resource
   PUT : to update on resource
   POST : create new resource
   DELETE : to delete the resource
