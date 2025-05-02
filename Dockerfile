# Use OpenJDK as the base image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the jar file into the container (replace with your actual jar file name)
COPY target/eureka-server.jar app.jar

# Expose the port the application will run on
EXPOSE 8761

# Run the application using the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
