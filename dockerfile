FROM maven:latest
COPY . .
CMD java -jar milestonetrail-1.jar