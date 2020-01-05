sequence to follow:
eureka-server-springboot -- eureka server
eureka-client-springboot -- rest service (to be registered with eureka)
eureka-consumer -- rest client that will discover "rest service [name] from eureka and then make rest call.


1st step: http://localhost:8761/ -- see eureka server
2nd step (see rest service end point): 
http://localhost:8080/serviceinstance/eureka-regstd-server (for debugging)
and see the eureka server "eureka-regstd-server" registered.
3rd step:http://localhost:8096/consume
