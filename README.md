# Spring Data Example


## Ejecutar una Base de Datos PostgreSQL con Docker

```shell
docker run --name some-postgres -p 5432:5432 -e POSTGRES_PASSWORD=admin -d postgres
```

NOTA: hay que crear la base de datos `pruebas01`.

## Arrancar y usar el servicio de animals

### Arrancar la aplicación

Ejecutar en la consola, en el directorio del proyecto (donde está el pom.xml):

```shell
mvn clean spring-boot:run

```
También puedes darle al play en Eclipse.

### Para usar los servicios

#### Ver la Lista de animales

```shell
curl http://localhost:8080/animals/
```

#### Crear un animal

```shell
curl -X POST -H "Content-Type: application/json" -d '{"name": "Todd"}' http://localhost:8080/animals/
```

#### Recomendable

Es muy recomendable que instalar el paquete `jq` de Linux:

```shell
sudo apt-get install jq
```

Sirve para visualizar mejor el formato JSON. Ejemplo de uso:

```shell
curl http://localhost:8080/animals/ | jq
```
