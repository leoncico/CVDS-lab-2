# Laboratorio 2 CVDS
### Autores: 
* Camilo Nicolas Murcia Espinosa
* Juan David Contreras Becerra
* David Leonardo Piñeros Cortés

## Maven
Maven es una herramienta open-source de gestión de proyectos con el fin de simplificar algunos procesos como compilar y generar ejecutables. 

Las principales fases del ciclo de vida en Maven son:
1. Validate: Se valida que el proyecto es correcto y tiene la información necesaria para su construcción.
2. Compile: Compila el código fuente del proyecto.
3. Test: Se ejecutan los test del proyecto.
4. Package: Compila aplicacion en java en torno a las dependencias declaradas en el POM
   
Para ejecutar un proyecto maven desde la línea de comandos y verificar su salida se usan los siguientes comandos:
* mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.App"
* En la salida obtenemos 'hello world!'

Al realizar el cambio en la clase App.java para crear el saludo personalizado, y siguiendo cada una de las instrucciones especificadas, como ejecutar la clase con nuestro nombre y apellido como parámetros, obtenemos que **sigue imprimiendo 'hello world' de forma normal** y al ejecutar nuevamente y verificar la salida en la consola de los cambios realizados para que se leyera la entrada y se imprimieran los elementos nuevos en la pantalla, conseguimos que una vez se entran los parametros, se imprimen exitosamente. 

Al ejecutar varias veces la clase ShapeMain y usando el plugin exec de maven, se obtiene que para todos los parámetros, tanto *qwerty, pentagon, hexagon* y cuando no se ingresa ningún parámetro, el código responde correctamente a todas estas entradas, esto debido a que se interpreta de igual forma las figuras regulares o entradas que tengan errores de sintaxis, y para el resto de los casos, las respuestas son las que se pueden esperar.

*gitignore* permite escribir las extensiones de los archivos que no se desean 'subir' al repositorio, aunque en este caso no es un comando como tal, sino un archivo de texto, que lleva el mismo nombre, y que se encuentra ubicado en el directorio raíz, además contiene una lista de patrones que permite que Git compare nombre de archivos para determinar si deben mantenerse o no. Esto nos da como ventajas tener y seguir con archivos irrelevantes, mejorar la colaboración entre los miembros, además de mantener un historial más limpio de Git, entre otras más ventajas.
## Fuentes
* https://www.javiergarzas.com/2014/06/maven-en-10-min.html
* 
