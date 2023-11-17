
# Demo postman

Esta api expone el endpoint `/api/v1/users/{userId}` que permite consultar mediante
el *userId* uno de los 3 posibles usuarios existentes.

| **Endpoint**        | Código de Respuesta | Json                                                                                             |
|---------------------|:-------------------:|--------------------------------------------------------------------------------------------------|
| `/api/v1/users/1`   |         200         | `{"id":1,"name":"Nicola","lastName":"Tesla"}`                                                    |
| `/api/v1/users/2`   |         200         | `{"id":2,"name":"Albert","lastName":"Einstein"}`                                                 |
| `/api/v1/users/3`   |         200         | `{"id":3,"name":"Alejandro","lastName":"Magno"}`                                                 |
| `/api/v1/users/4`   |         404         |                                                                                                  |
| `/api/v1/users/asd` |         400         | `{"timestamp":"2023-11-17T18...","status":400,"error":"Bad Request","path":"/api/v1/users/asd"}` |

## Correr el proyecto de forma local

#### Pre requisitos

- Instalar un cliente de [git](https://git-scm.com/downloads)
- Instalar [maven](https://maven.apache.org/users/index.html)
- Instalar el [JDK 11](https://docs.oracle.com/en/java/javase/11/install/installation-jdk-microsoft-windows-platforms.html#GUID-BCE568C9-93D3-49F4-9B0C-9DD4A3419792)

#### Proceso de compilación y ejecución

1. Clonar el repositorio: `git clone https://github.com/david26/postman-demo`
2. Navegar al directorio postman-demo: `cd postman-demo`
3. Compilar el proyecto: `mvn clean package`
4. Correr el servicio: `java -jar target/demo-postman-0.0.1-SNAPSHOT.jar`
