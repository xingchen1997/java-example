FROM maven

WORKDIR /src
COPY . .
RUN javac Example.java

# TODO: migrate first, run in gunicorn
CMD java Example
