# test-springboot-docker
demo how to use spring boot and docker

this project code was build using spring boot and docker
prerequisite:
1. installed docker 
2. springboot 

for docker tutorial follow this instruction:
1. open cmd or terminal
2. # docker-machine start default
3. # docker-machine env --shell cmd default
4. # FOR /f "tokens=*" %i IN ('docker-machine env --shell cmd default') DO @%i
5. # docker build -t com.shadr/shadr-spring-boot-docker:1.0-SNAPSHOT path/to/docker/image/
6. # docker run -p 8080:8080 -t com.shadr/shadr-spring-boot-docker-1.0.jar
7. open your DOCKER IP with 8080 port on the browser 
