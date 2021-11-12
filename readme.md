# Fractions

Fractions is a Spring Boot project which aims to make arithmetic operatios such as sum, subtraction, multiplication, division and simplification with fractions.

## Installation

You need to have the following items installed on your computer
* Package manager [maven](https://maven.apache.org/download.cgi).
* Java [JDK 1.8](https://www.oracle.com/co/java/technologies/javase/javase8-archive-downloads.html).
* Version Control Manager [Git](https://git-scm.com/downloads).

1. First clone or download this repository
   ```bash
   git clone https://github.com/aglopezn/fractions.git
   ```
2. Then go to the root project folder on your terminal and install the dependencies
   ```bash
   mvn clean install
   ```
3. On the root folder in your terminal execute
   ```bash
   mvn spring-boot:run
   ``` 
4. After that you cann go to your browser and search for http://localhost:8080/api/ping and you'll see a "pong" response.

## Usage
Fractions consists in 5 endpoints you can access through your browser, each of them is an arithmetic operation and receives parameters to build the fractions.

```http
http://localhost:8080/api/sum?a=1&b=2&c=1&d=4

http://localhost:8080/api/substract?a=1&b=2&c=1&d=4

http://localhost:8080/api/multiply?a=1&b=2&c=1&d=4

http://localhost:8080/api/divide?a=1&b=2&c=1&d=4

http://localhost:8080/api/simplify?a=4&b=2
```

The fractions are built like this

```
a/b
c/d
```

### Example
```http
http://localhost:8080/api/sum?a=1&b=2&c=1&d=4
```
This will sum (1/2) + (1/4), then it returns 3/4
