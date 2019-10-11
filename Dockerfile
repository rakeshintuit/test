FROM openjdk:8-jre

COPY . ./functional-test

WORKDIR ./functional-test

CMD java -cp ./target/dependency/*:./target/classes org.testng.TestNG ./src/main/resources/testng.xml