https://spring.io/guides/gs/centralized-configuration/
find out why default to listening for config on port 8888. 
Even If I change the port to (8787) spring.cloud.config.uri=http://localhost:8787
Log shows that search to 8888 instead of 8787

build start server first
then start client app. Then do rest call