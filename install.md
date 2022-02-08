# Examen con Maven

Este es un proyecto que contiene un servicio API-RES simple para mostrar un mensaje. 
Incluye dependencias y perfiles del proyecto en un archivo jar.

## Instalación

1. Instale el paquete con el siguiente comando

```bash
mvn clean package
```

2. Dependiendo del entorno que desee  utilice uno de los dos comandos

```bash
mvn clean package -P test
```
```bash
mvn clean package -P prod
```

## Uso
3. para ejecutar el archivo JAR, ejecute lo siguiente

```bash
java -jar target/MavenTest-1.0-SNAPSHOT-jar-with-dependencies.jar
```

4. En un navegador, dirijase al siguiente enlace 

OBTENER [[http://localhost:3456/entornos](http://localhost:3456/entornos) 

El entorno se identificará según el perfil seleccionado en el paso 2 (test / prod)


5. Asegúrese de actualizar las pruebas según corresponda.

