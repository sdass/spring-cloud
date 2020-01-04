https://javabeginnerstutorial.com/spring-boot/spring-boot-2-microservices-with-netflix-zuul-api-gateway/

After running application test:
http://localhost:8082/student/hi
A student Hello!

(The above output is received when the gateway (this app) as a proxy made a call 
to zuul-studentservice <-- this is configured in application.properties file.)