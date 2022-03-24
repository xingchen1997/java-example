FROM maven

WORKDIR /src
COPY . .
RUN mvn clean compile

RUN mvn test

CMD java -cp target/classes org.piki.App
