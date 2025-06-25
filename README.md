Mi nombre es **Juan Carlos Quintero Rubiano**, mi código es **20232020172** y este es el parcial.

---

# Guía de Inicio Rápido: Mi Proyecto Java

¡Bienvenido! Aquí te explico cómo compilar y ejecutar el código Java de mi parcial.

## Estructura de Carpetas

Para que todo funcione correctamente, es importante que sepas cómo está organizado el proyecto. La estructura es la siguiente:

* **`parcial`**: Carpeta principal del proyecto.
* **`parcial/src`**: Contiene todos los archivos `.java`, incluyendo `App.java` (la clase principal).
* **`parcial/lib`**: Para librerías externas (no usadas en este parcial).
* **`parcial/bin`**: Aquí se guardarán los archivos `.class` compilados.

---

## Cómo Compilar y Ejecutar Mi Código

Para poner en marcha la aplicación, sigue estos pasos desde tu terminal o línea de comandos:

1.  **Dirígete a la carpeta `src`**:
    ```bash
    cd parcial/src
    ```

2.  **Compila los archivos Java**:
    ```bash
    javac -d ../bin *.java
    ```
    * `javac`: Compilador de Java.
    * `-d ../bin`: Guarda `.class` en la carpeta `bin`.
    * `*.java`: Compila todos los archivos Java en `src`.

3.  **Ejecuta la aplicación**:
    ```bash
    java -cp ../bin App
    ```
    * `java`: Ejecuta la Máquina Virtual de Java.
    * `-cp ../bin`: Define la ruta donde buscar los `.class`.
    * `App`: Nombre de la clase principal (sin extensión).

### Flujo de Trabajo Completo (Ejemplo)

Si partes desde el directorio donde tienes la carpeta `parcial`:

```bash
# Entra a la carpeta src del parcial
cd parcial/src

# Compila y guarda en bin
javac -d ../bin *.java

# Ejecuta la aplicación principal
java -cp ../bin App
