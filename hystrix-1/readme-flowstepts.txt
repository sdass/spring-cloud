
https://howtodoinjava.com/spring-cloud/spring-hystrix-circuit-breaker-tutorial/
step-1
start hystrix-restserver. Test as below
http://localhost:8080/getStudentDetailsForSchool/AAschool
data came
step-2 
create this hystrix enabled
http://localhost:9098/getStudentDetailsForSchool/AAschool
output
NORMAL FLOW !!! - School Name -  AAschool :::   Student Details [{"name":"Sajal","className":"Class IV"},{"name":"Lokesh","className":"Class V"}] -  2020-01-03T15:24:01.026
step-3
break/shutdown backend service on 8080
and confirm http://localhost:8080/getStudentDetailsForSchool/AAschool
"page is not working"
step-4
invoke hystrix client service
http://localhost:9098/getStudentDetailsForSchool/AAschool
CIRCUIT BREAKER ENABLED!!! No Response From Student Service at this moment.  Service will be back shortly - 2020-01-03T15:28:17.005
---------------------works---
extra (follow: https://github.com/Netflix/Hystrix/issues/1566#issuecomment-324619231)
http://localhost:9098/hystrix/monitor (showed dashboard)

http://localhost:9098/actuator/hystrix.stream (only ping to see health)