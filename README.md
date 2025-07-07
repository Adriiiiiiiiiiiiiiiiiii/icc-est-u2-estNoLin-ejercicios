# Estructuras No Lineales – Ejercicios Árboles

Este proyecto contiene la solución a cuatro ejercicios prácticos sobre estructuras de datos tipo árbol binario, como parte del aprendizaje de estructuras no lineales en Java. Cada ejercicio se encuentra organizado en su propia carpeta, siguiendo la convención de paquetes y buenas prácticas.

---

## Identificación del Estudiante (Obligatorio)

Antes de comenzar a programar o ejecutar el proyecto, **debes completar tu nombre y correo institucional en el archivo `student.env`** que se encuentra en la raíz del proyecto. Este archivo es necesario para validar tu identidad como autor del trabajo.

### ¿Por qué es obligatorio?

Este proyecto utiliza una verificación automática que valida que has ingresado tu información personal. Si no lo haces:

- Al ejecutar el proyecto (`App.java`) verás este mensaje de error:
```
❌ Debes completar STUDENT_NAME y STUDENT_EMAIL en student.env
```
- No podrás enviar tu código (`push`) al repositorio si tienes activado el sistema de validación local.
- Las pruebas automáticas en GitHub Actions también fallarán si no detectan tu nombre y correo.

### ¿Qué debo hacer?

1. Abre el archivo `student.env` que ya está creado en el proyecto.
2. Rellena tus datos:

```
STUDENT_NAME=Tu Nombre Completo
STUDENT_EMAIL=tu.correo@institucion.edu.ec
```


3. **No borres estas líneas ni cambies los nombres de las variables.**
4. Guarda los cambios y vuelve a ejecutar el programa o hacer push.

> 💡 Este mecanismo asegura la autoría del código y que cada estudiante reciba su evaluación automática de forma personalizada.

---




## Explicación para el estudiante

```
src/
│
├── Materia/
│
├── Ejercicio_01_insert/
├── Ejercicio_02_invert/
├── Ejercicio_03_listLeves/
└── Ejercicio_04_depth/
```

---

## Descripción de Ejercicios

### Ejercicio 01: Insertar en un Árbol Binario de Búsqueda (BST)

Carpeta: `Ejercicio_01_insert`
Implementa un algoritmo para insertar nodos en un Árbol Binario de Búsqueda.

 **Input de ejemplo:** `[5, 3, 7, 2, 4, 6, 8]`
 **Output esperado:**

```
    5
  3   7
 2 4 6 8
```

---

### Ejercicio 02: Invertir un Árbol Binario

📂 Carpeta: `Ejercicio_02_invert`
Dada la raíz de un árbol binario, el algoritmo devuelve su versión invertida (espejo).

 **Input de ejemplo:**

```
    4
  2   7
1  3 6  9
```

**Output esperado:**

```
    4
  7   2
9  6 3  1
```

---

### Ejercicio 03: Listar Niveles en Listas Enlazadas

📂 Carpeta: `Ejercicio_03_listLeves`
Devuelve una lista enlazada con los nodos por nivel. Si hay N niveles, se obtienen N listas.

 **Input de ejemplo:**

```
    4
  2   7
1  3 6  9
```

**Output esperado:**

```
4  
2 → 7  
1 → 3 → 6 → 9
```

---

### Ejercicio 04: Calcular la Profundidad Máxima

Carpeta: `Ejercicio_04_depth`
Calcula la profundidad máxima de un árbol binario (la longitud del camino más largo desde la raíz hasta una hoja).

**Input de ejemplo:**

```
    4
  2   7
1  3  
8
```

**Output esperado:** `4`

---

## Indicaciones Generales

* Lee cuidadosamente el enunciado de cada ejercicio.
* Cada carpeta debe contener:

  * Código fuente Java.
  * Casos de prueba.
  * Comentarios claros.
* Realiza commit y push con el mensaje:

  ```
  Estructuras No Lineales – Ejercicios Árboles
  ```
* En el AVAC, sube la **URL del repositorio** con el código.

---

## No se calificará si:

* No hay commit con los ejercicios.
* No se incluye este README explicativo.
* Las clases o métodos no siguen los nombres requeridos.

---

## Rúbrica de Calificación

| **Criterio**       | **Descripción**                                                                       | **Puntaje** |
| ------------------ | ------------------------------------------------------------------------------------- | ----------- |
| **Informe**        | No hay informe                                                                        | 0 pts       |
|                    | Informe parcial **sin explicación** de cada método                                    | 1 pt        |
|                    | Informe parcial **con explicación** de cada método                                    | 2 pts       |
|                    | Informe completo                                                                      | 3 pts       |
| **Funcionamiento** | No implementado                                                                       | 0 pts       |
|                    | Implementado parcialmente: <br>• Ejercicio 1 y 4 → 2 pts<br>• Ejercicio 2 y 3 → 4 pts | 2–4 pts     |
|                    | Código funcional pero **no pasa todas las pruebas**                                   | 6 pts       |
|                    | Código funcional y **pasa todas las pruebas correctamente**                           | 7 pts       |



## Contribuir

Para contribuir a este proyecto, por favor crea un fork y envía una solicitud de extracción, o simplemente abre un issue con tus comentarios y sugerencias.

## Autores

- [PABLO TORRES] - Desarrollo inicial
## 👥 Colaboradores

- **Pablo Torres** – Autor del desarrollo original
- **Adriano Rodas** – Participación estudiantill

## 🧾 Informe del Proyecto

### 🎓 Información General

Este repositorio corresponde al desarrollo de una práctica académica enfocada en el estudio y aplicación de estructuras de datos tipo árbol binario en Java. Su propósito principal es fortalecer las competencias relacionadas con la recursividad, el análisis estructurado de datos jerárquicos, y el diseño de algoritmos orientados a árboles.

El proyecto fue desarrollado por el estudiante **Adriano Rodas** como parte del proceso de aprendizaje en cursos relacionados con algoritmos y estructuras de datos, guiado inicialmente por una base proporcionada por **Pablo Torres**.

---

### 🎯 Objetivos del Proyecto

- Implementar un Árbol Binario de Búsqueda (BST) y realizar inserciones correctamente.
- Desarrollar un algoritmo para invertir recursivamente un árbol binario.
- Extraer los nodos de un árbol nivel por nivel y almacenarlos en listas enlazadas.
- Calcular de manera eficiente la profundidad máxima de un árbol binario.
- Integrar todo en una aplicación modular y funcional en Java.
- Validar resultados mediante pruebas automatizadas con JUnit.

---

### 🛠️ Tecnologías y Herramientas Utilizadas

- **Lenguaje de Programación:** Java (JDK 8 o superior)
- **Entorno de desarrollo:** IntelliJ IDEA / VS Code
- **Testing:** JUnit 5
- **Automatización (opcional):** Maven o Gradle
- **Control de versiones:** Git y GitHub

---

### 📁 Organización del Código

La estructura del proyecto está organizada por ejercicios, cada uno en su propio paquete, siguiendo buenas prácticas de separación de responsabilidades. Todos los ejercicios son ejecutados desde la clase principal `App.java`.

src/
├─ main/
│ ├─ Ejercicio_01_insert/
│ │ └─ InsertBST.java
│ │ └─ App.java # Clase principal para ejecutar todos los ejercicios
│ ├─ Ejercicio_02_invert/
│ │ └─ InvertBinaryTree.java
│ ├─ Ejercicio_03_listLeves/
│ │ └─ ListLevels.java
│ └─ Ejercicio_04_depth/
│ └─ Depth.java
└─ test/
├─ Ejercicio_01_insert/
│ └─ InsertBSTTest.java
├─ Ejercicio_03_listLeves/
│ └─ ListLevelsTest.java
└─ Ejercicio_04_depth/
└─ DepthTest.java


---

### 🧪 Descripción de los Ejercicios

#### 🔹 Ejercicio 1 – Insertar en un Árbol Binario de Búsqueda
Permite insertar una serie de valores enteros en un BST y luego imprimir el recorrido por niveles del árbol, visualizando la organización jerárquica de los nodos.

#### 🔹 Ejercicio 2 – Invertir un Árbol Binario
A través de recursión, intercambia los subárboles izquierdo y derecho de todos los nodos del árbol, generando su reflejo en espejo.

#### 🔹 Ejercicio 3 – Listar Niveles en Listas Enlazadas
Recorre el árbol por niveles y agrupa los nodos en listas enlazadas (`List<List<Node>>`), representando cada nivel como una lista independiente.

#### 🔹 Ejercicio 4 – Calcular la Profundidad Máxima
Calcula la altura total del árbol binario, entendida como el número máximo de niveles desde la raíz hasta el nodo más profundo.

---

### ✅ Resultados Obtenidos

- Se logró implementar y ejecutar correctamente los cuatro algoritmos propuestos.
- Los recorridos y resultados obtenidos durante las pruebas coinciden con los comportamientos esperados de cada operación.
- Las pruebas unitarias permiten verificar el correcto funcionamiento de las estructuras y métodos utilizados.
- La aplicación puede escalar para adaptarse a árboles más grandes o modificarse para nuevos retos con árboles binarios.

---

### 🙋 Autor

**Adriano Rodas**  
Universidad Politécnica Salesiana – Ecuador  
📧 arodass@est.ups.edu.ec
---
## ✅ Resumen de Resultados

A continuación, se presenta un resumen de la ejecución de pruebas unitarias para cada ejercicio del proyecto:

| Ejercicio                             | Clase de Prueba               | Resultado | Descripción breve                                       |
|--------------------------------------|-------------------------------|-----------|----------------------------------------------------------|
| Ejercicio 1 – Insertar en BST        | `InsertBSTTest`              | ✔️ Aprobado | Inserta nodos en un BST y verifica el orden correcto     |
| Ejercicio 2 – Invertir Árbol Binario | `InvertBinaryTreeTest`       | ✔️ Aprobado | Invierte recursivamente un árbol binario                |
| Ejercicio 3 – Listar Niveles         | `ListLevelsTest`             | ✔️ Aprobado | Extrae los niveles del árbol como listas enlazadas      |
| Ejercicio 4 – Profundidad Máxima     | `DepthTest`                  | ✔️ Aprobado | Calcula la profundidad máxima de un árbol binario       |

> 🟢 **Todos los tests se ejecutaron correctamente sin errores (exit code 0).**


