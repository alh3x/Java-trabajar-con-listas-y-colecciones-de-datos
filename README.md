# Java: trabajando con listas y colecciones de datos

## __1-Coleccion de peliculas__

### Lista de peliculas con ArrayList

Las listas en java simplifican el manejo y almacenamiento de datos, ofreciendo flexibilidad y eficiencia.

Arrays
Collections
List

Para declarar una arraylist se hace de la siguiente manera `ArrayList<'tipoDeDato'> nombreDeLaLista = new ArrayList<>()`

las ArrayList tiene varios metodos, como `nombreDeLista.add(nombreDeVariable)` para agregar un item a la lista

### Para saber más: declarando variables con var

A partir de la versión 10 de Java se agregó una nueva funcionalidad para la declaración de variables llamada var. Esta nueva palabra clave permite al compilador inferir automáticamente el tipo de variable en función del valor asignado a ella. Esto puede hacer que el código sea más limpio y legible, además de reducir la escritura de código redundante.

Sintaxis básica
La sintaxis básica para declarar una variable con `var` es la siguiente:
```
var nombreDeLaVariavel = valorInicial;
```
Donde `nombreDeLaVariable` es el nombre que desea darle a la variable y `valorInicial` es el valor que desea asignarle. El compilador inferirá automáticamente el tipo de variable en función del valor asignado.

Ejemplo:
```
var numero = 10;
```
En este ejemplo, se inferirá que la variable `numero` es de tipo int, ya que el valor asignado es un número entero.

Limitaciones
Declarar variables con `var` tiene algunas limitaciones:

1. El compilador debe inferir automáticamente el tipo de variable. Esto significa que no puede usar `var` en variables cuyo tipo no se puede inferir automáticamente.
2. No se puede usar `var` en variables sin valor inicial. Debes asignar un valor a la variable en la misma línea donde está declarada.

Declarar variables con `var` es una característica relativamente nueva en Java, pero puede aportar muchos beneficios al código, como escribir menos cantidad de código y una mejor legibilidad del mismo. Sin embargo, es importante recordar que existen limitaciones y que no siempre es posible utilizar esta función.

### Para saber más: arrays con Java

En Java, los arrays son estructuras de datos que permiten almacenar una colección de elementos del mismo tipo. Son ampliamente utilizados para la manipulación de datos en proyectos de programación.

Para declarar un array en Java, es necesario definir su tipo y tamaño. Por ejemplo, para crear un array de números enteros con tamaño 5, podemos escribir el siguiente código:
```
int[] numeros = new int[5];
```
Aquí estamos declarando una matriz llamada "números" de tipo "int" y con tamaño 5. Es importante recordar que el índice de los elementos de un array comienza en 0 y va hasta el tamaño del array menos 1.

Después de declarar un array, podemos inicializarlo con valores. Por ejemplo, podemos llenar el array "números" con los números del 1 al 5 de la siguiente forma:
```
for (int i = 0; i < numeros.length; i++) {
    numeros[i] = i + 1;
}
```
Aquí, recorremos el array de "números" usando un loop for y llenando cada posición con su índice respectivo más 1.

También es posible crear arrays de objetos y no sólo tipos primitivos. Por ejemplo:
```
Pelicula[] peliculas= new Pelicula[2];

Pelicula pelicula1 = new Pelicula("Avatar", 2009);
Pelicula pelicula2 = new Pelicula("El señor de los anillos", 2001);

peliculas[0] = pelicula1;
peliculas[1] = pelicula2;
```
Si bien los arrays son útiles, tienen algunas limitaciones que pueden causar problemas en los proyectos. Algunos de estos problemas incluyen:

1. Tamaño fijo: el tamaño de un array es fijo y no se puede cambiar una vez creado. Esto puede resultar problemático en situaciones en las que el tamaño de los datos que se almacenarán es desconocido o variable.

2.  Ausencia de métodos: los arrays no cuentan con métodos que permitan insertar, quitar o buscar elementos de manera eficiente. Esto puede conducir a soluciones de código complicadas e ineficientes para tareas simples.

Precisamente por estos problemas y dificultades, no deberíamos utilizar arrays para representar una colección de elementos, sino alguna clase Java, como ArrayList, que encapsula y abstrae un array, facilitando su uso mediante métodos y dejando el código del proyecto más sencillo de entender y evolucionar.

### Entendiendo la jerarquia de clases y metodos

Presionando `Ctrl + q` puedes ver una ventana flotante que hace referencias a la documentacion de java en intellij. 

Otra manera de encontrar documentacion es utilizando un buscador de internet con lo siguiente `javadoc 17 sobreloquequiero`. En este caso `jacadoc 17 ArrayList` donde podemos ver los distintos metodos de este objeto `ArrayList`, como `add()`, `forEach`, `size()`, etc.

En intelliJ para saber mas del metodo utilizado se puede dar `Ctrl + click` en un algun metodo de el codigo java, este te dirige al codigo de la clase detras del metdodo justo con la documentacion junto a él.

Por ejemplo: Al ir a la calse de `printLn` ppodemos ver que utiliza un metodoto `String.valueOf`, que por detras utiliza como parametro `Object obj` para el metodo `obj.toString()`.

`Object` es la clase raiz de toda la jerarquia de clases, es decir que todas la clases heredan los metodos de esta clase. lo que nos permite utilizar el metodo `toString()`. Lo que nos permite sobreescribir dicho metodo.(heredan de manera implicita)

Cambiamos el comportamiento de `toString()` en la clase `Pelicula` lo que altera el comportamiento de todos los objetos.

### Para saber más: JavaDoc y ArrayList

La documentación de Java, conocida como JavaDoc, es una referencia completa para todas las clases, interfaces y métodos disponibles en la plataforma Java. Está disponible en línea y se puede acceder a ella en este [sitio web de Oracle](https://docs.oracle.com/en/java/javase/17/docs/api/index.html).

JavaDoc está organizada en paquetes, que contienen varias clases e interfaces relacionadas con alguna funcionalidad específica del lenguaje. Cada clase e interfaz está documentada individualmente, con información detallada sobre su funcionalidad, uso y ejemplos de código.

Esta documentación debería ser una referencia esencial para cualquiera que desee programar en el lenguaje Java, ya que nos da información detallada sobre cómo utilizar las clases e interfaces proporcionadas por el lenguaje. Al tener acceso a la documentación, también podemos descubrir nuevas clases y métodos que pueden ser útiles en nuestros proyectos, para resolver problemas comunes y recurrentes.

En los últimos vídeos vimos algunos métodos de la clase ArrayList de Java. Sin embargo, sólo se mostró una pequeña fracción de las funcionalidades que tiene esta clase.

Para conocer más sobre la clase, así como todos los métodos que tiene, puedes consultar el [JavaDoc de ArrayList](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html).

No dejes de visitar la web de JavaDoc y explorar los paquetes y clases que el lenguaje pone a nuestra disposición, ya que así te familiarizaras con cómo descubrir nuevas características del lenguaje, además de comprender mejor cómo funcionan las principales clases de Java.

### Lo que aprendimos

Lo que aprendimos en esta aula:

+ Cómo representar listas de objetos en Java, usando la clase ArrayList;
* Manipular un ArrayList con sus métodos add, size y get;
* Los diferentes tipos de clases de Java para representar una lista;
* Cómo funciona el método toString(), utilizado para representar un objeto en texto.

## __2-Construyendo Objetos__

### Construyendo Objetos con valores

Al crear instancias de clases, utilizamos `new nombreClase()`, a pesar de lo que paresca esto no es un metodo, esto es llamado un __Constructor__, lo que reserva un espacio en memoria para un determinado objeto y sus atributos. Este constructor no solo puede reservar un espacio en memoria, tambien nos permite determinar parametros dentro del contructor para asignar argumentos a sus atributos. `new nombreClass(nombre, fecha, etc...)`

Dicho constructor es heredado de la superClase Object, y esta de manera implicita en cada clase, para sobreescribirlo solo hace falte declararla explicitamente
```
public Pelicula(String nombre) {
        this.setNombre(nombre);
    }
```
Pero al hacerlo cada vez que instancimos un objeto este requerira siempre un argumento, para evitar esto debemos declarar de manera explicita el constructor nuevamente pero sin parametros.
```
public Pelicula() {
        super();
    }
```
Ambos casos dependera de las reglas de negocios, asi como tambien pensar si sera necesario tener el metodo `setNombre()`?

### Para saber más: constructor predeterminado

En Java, un constructor es un método especial que se utiliza para crear e inicializar un objeto recién creado. Cuando se define una clase, puede tener uno o más constructores y, si no se define ningún constructor explícitamente, Java creará automáticamente un constructor predeterminado.

Un constructor predeterminado es un constructor que no recibe parámetros ni ejecuta instrucciones. Se llama siempre que se crea un objeto de la clase sin argumentos. Por ejemplo:
```
public class Persona{

    private String nombre;
    private String email;

    public Persona() {
    }

    //metodos getters/setters
}
```
En el ejemplo de código anterior, la clase Persona tiene un constructor predeterminado, que será exactamente el mismo constructor que Java creará automáticamente si no se definió ningún constructor en la clase.

Si una clase define explícitamente uno o más constructores, pero no define un constructor sin parámetros, entonces no existe un constructor predeterminado. En ese caso, si se crea un objeto sin argumentos, se generará un error de compilación. Por ejemplo:
```
public class Persona{

    private String nombre;
    private String email;

    public Persona(String nombre, String email) {
    this.nombre = nombre;
    this.email = email;
    }
}
Persona persona = new Persona(); //error, faltan los parámetros
```
Es importante tener en cuenta que, aunque un constructor predeterminado puede resultar útil en algunos casos, siempre se recomienda definir explícitamente los constructores de la clase, especialmente si la clase tiene atributos que deben inicializarse con valores específicos o requeridos. También hace que el código sea más claro y fácil de entender.

### Definiendo otras formas de construir Peliculas y series

Si definimos un contructor con parametro, para una `superClase` ocurrira un error en las clases que heredan de ella, por lo que tendremos que definir el contructor en cada clase hija que llame al contructor, con la misma cantidad de parametros. en caso de querer cambiar la cantidad de paramtros solo se debe definir un constructor con la cantidad de arametros deseados a demas del ya declarado.

```
public class Titulo {

    private String nombre;
    private int fechaDeLanzamiento;

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }
}
```

```
public class Pelicula extends Titulo implements Clasificable {
    
    private String director;

    public Pelicula(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }
}
```

Los constructores a demas nos permite determinar valores de importacia para nuestros objetos y validadr caracteristicas o comportamientos. Como evitar crear un objeto Pelicula con una fecha de lanzamiento porterior(2034) a la fecha de timpo actual(2024).

En caso de que una clase hija requiera parametros adicionales se crea de la siguiente manera:

```
    public Pelicula(String nombre, int fechaDeLanzamiento, String director) {
        super(nombre, fechaDeLanzamiento);
        this.director = director;
    }
```

### Lo que aprendimos
PRÓXIMA ACTIVIDAD

Lo que aprendimos en esta aula:

* Pasar parámetros al instanciar objetos, utilizando constructores;
* Cómo funciona el constructor default (predeterminado) en Java;
* Cómo declarar constructores en una clase;
* Llamar al constructor de la clase madre, con la palabra reservada super.


## __3-Lista de objetos distintos__

### Tipos de objetos diferentes en la lista

crearemos una nueva lista que contenga peliculas y series, para esto en el `ArrayList<>` dentro del generic `<>` colocamos un supertipo que tengan en comun, en este caso seria `Titulo`. con esto podremos adicionar tanto series como peliculas, pero al momento de querer realizar una accion como ver la clasificacion, ocurrira algo y es que Serie no tiene el metodo igual a Pelicula. por lo que trataremos de de hacer un casting de Serie a Pelicula, pero esto tampoco fucionara ya que no se puede ya que son cosas diferentey la clase Serie no tiene el metodo `evalua()` ni `getClasificacion()`, este error no se vera en la compilacion pero si al momento de ejecutar.

```
for (Titulo item: lista){
            System.out.println(item);
            Pelicula pelicula = (Pelicula) item;
            System.out.println(pelicula.getClasificacion());
        }
```

###  Para saber más: otras formas de recorrer la lista

La forma más común de recorrer una lista en Java es utilizar el bucle foreach tradicional, también conocido como for-each. Este bucle te permite recorrer todos los elementos de una lista, sin necesidad de preocuparte por los índices o su tamaño, haciendo el código más simple y legible. Por ejemplo, supongamos que tenemos una lista de nombres de personas y queremos imprimirlos en la pantalla:
```
ArrayList<String> nombres = new ArrayList<>();
nombres.add("Andrea");
nombres.add("Bruno");
nombres.add("Darío");
nombres.add("Emilia");

for (String nombre : nombres) {
    System.out.println(nombre);
}
```
Este bucle for recorre todos los elementos de la lista, asignando cada uno de ellos a la variable `nombre`, que se utiliza para imprimir el valor en la pantalla. Este tipo de bucle es muy útil en situaciones en las que no necesitamos realizar operaciones complejas en los elementos de la lista.

Sin embargo, a partir de Java 8, se agregó a la interface `List` (la cual la clase `ArrayList` implementa) un nuevo método llamado forEach, que permite iterar sobre los elementos de la lista de una manera más concisa y elegante. Por ejemplo, el ejemplo anterior se puede reescribir usando el método forEach de la siguiente manera:
```
nombres.forEach(nombre -> System.out.println(nombre));
```
En este caso, se llama al método forEach sobre la lista de nombres y recibe como parámetro una expresión lambda que imprime el valor en pantalla. La expresión lambda `nombre -> System.out.println(nombre)` es una forma compacta de definir una función que recibe un parámetro nombre y realiza la operación de impresión.

Es posible simplificar aún más el ejemplo de código anterior utilizando el recurso conocido como Method Reference, que no es más que una forma reducida de una expresión lambda:
```
nombres.forEach(System.out::println);
```
En el código anterior, el símbolo :: es la sintaxis del Method Reference, que en el ejemplo mostrado hace una referencia al método `println`.


### Identificando el Objeto

Como vimos anteriormente en el bucle `for`, para evitar el error al trabajar con distintos tipos de objetos, podemos validar el tipo de objeto, e imprimir la clasificacion solo si es del tipo `Pelicula` esto nos permite utilizar los metodos de dicha clase cuando se necesario, en este caso `getClasificacion()` y evitar el error de `toString` de Serie utilizamos `getNombre()`:

```
 for (Titulo item: lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula) {
                Pelicula pelicula = (Pelicula) item;
                System.out.println(pelicula.getClasificacion());
            }

        }
```
a partir de java 14 podemos adicionar una variable `pelicula` seguido a `instanceof` para poder reducir las lineas de codigo, ademas de poder combinar operadores logicos junto a este(esto a artir de java17)
``` 
for (Titulo item: lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion()>2) {                
                System.out.println(pelicula.getClasificacion());
            }

        }
```

De esta manera mediante el cast de la variable modificamos por referencia (`variables por referencia`) la menra en que ve java a ese objeto. en este caso `item` a `Pelicula`


### Para saber más: variables y referencias
PRÓXIMA ACTIVIDAD

Las referencias son punteros a objetos en la memoria, es decir, apuntan a un objeto y le permiten trabajar con él. En Java, cada variable de objeto es en realidad una referencia a ese objeto que se ha asignado en la memoria.

Cuando creas una instancia de un objeto, en realidad estás creando un nuevo bloque de memoria que almacena la información de ese objeto. La forma de llegar a este bloque de memoria, almacenar y leer información de él, se produce a través de una referencia, la cual está representada por una variable. Por ejemplo:
```
Pelicula pelicula1 = new Pelicula("Avatar", 2009);
```
En el ejemplo de código anterior, creamos un nuevo objeto de la clase `Pelicula` y almacenamos una referencia a él en la variable `pelicula1`.

Es importante recordar que las referencias a objetos en Java no son el objeto en sí, ya que sólo apuntan al objeto. Cuando pasas una referencia a un método o asignas una referencia a otra variable, solo estás copiando el valor de la referencia y no el objeto en sí. Por ejemplo:
```
Pelicula pelicula1 = new Pelicula("Avatar", 2009);
Pelicula pelicula2 = new Pelicula("The Matrix", 1999);
Pelicula pelicula3 = pelicula1;
```
En el ejemplo de código anterior, solo se crearon dos objetos en la memoria. La variable `pelicula3` es solo una referencia que apunta al mismo objeto al que hace referencia la variable `pelicula1`.

Una cuestión importante relacionada con las referencias a objetos en Java es la cuestión de la igualdad e identidad de los objetos. Cuando comparas dos referencias de objetos usando el operador de igualdad ==, estás comparando las referencias en sí, no los objetos a los que apuntan. Por ejemplo:
```
Pelicula pelicula1 = new Pelicula("Avatar", 2009);
Pelicula pelicula2 = new Pelicula("Avatar", 2009);

if (pelicula1 == pelicula2) {
    System.out.println("Iguales");
} else {
    System.out.println("Diferentes");
}
```
En el ejemplo de código anterior, la salida en la consola será: "Diferente". Aunque los dos objetos tienen la misma información en la memoria, la comparación con == verifica si las referencias son las mismas, es decir, si apuntan al mismo objeto en la memoria.

### Lo que aprendimos

Lo que aprendimos en esta aula:

* A recorrer un ArrayList con un loop foreach;
* A realizar un casting de un objeto, convirtiéndolo a otro tipo compatible;
* Cómo comprobar si un objeto es de un determinado tipo, utilizando la palabra reservada instanceof.


## __4-Ordenando Datos__

### Ordenando la lista

El ordenar la lista no permite poder realizar operaciones y accines especificas, como saber el primer o menor valor, el ultimo o mayo valor, Alfabeticamente, etc.
Po ejemplo una lista de actores:

```
ArrayList<String> listaDeActores = new ArrayList<>();
        listaDeActores.add("Penelope Cruz");
        listaDeActores.add("Antonio Banderas");
        listaDeActores.add("Ricardo Darin");
```
Para poder ordenar una lista ya existen una biblioteca llamada `Collections` del paquete `java.lang` que nos permite hacer ese ordenamiento mediante un metodo estatico `sort()`.

```
    Collections.sort(listaDeActores);
    System.out.println("Lista de actores Ordenada " + listaDeActores);
```

Pero que pasa si tratamos de ordenar una lista de objetos como la lista de `Titulos` tomando en cuenta sus nombres. Esto no funcionara porque la clase `Titulo` no implementa la interface `Comparable<String>`, como si lo hace la clase `String` de la lista de actores. Podemos verlo al hacer `Ctrl + click` en `String`.
Al buscar la documentacion [java doc 17 String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html) podemos ver las interface que implementa como [Comparable<T>](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Comparable.html) el cual nos obliga a implementar el metodo `compareTo(T o)`. dando como resultado un -1 si el objeto a comparar es menor, 0 si es igual y 1 si es mayor.

```
public class Titulo implements Comparable<Titulo> {
    ...

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }
}
```
Al comparar los nombres de los titulos, podemos utilizar el metoto compareTo() directamente con los nombres, reotrnaando el ordenamiento.


### Para saber más: interfaces Comparable y Comparator

Además de la interfaz `Comparable`, Java tiene otra interfaz llamada `Comparator`, que nos proporciona otra alternativa para ordenar colecciones.

Puede comprender mejor la diferencia entre ellos, con ejemplos de código, leyendo el artículo [Ordenar colecciones con Comparable y Comparator](https://www.aluracursos.com/blog/ordenando-colecciones-con-comparable-y-comparator?utm_source=gnarus&utm_medium=timeline).
Al Crear una clase que implemente la interface `Comparator` y definiento uno de sus metodos, puedo instancias un objeto, el cual puede ser utilizado como argumento de comparacion para el segundo parametro del metodo Collections.sort(T o, comparator).

### Definiendo otros criterios de ordenacion

Si quisieramos realizar un ordenamiento por medio de otro criterio, pero sin perder el orden natural ya definido con la inteface `Comparable` y su metodo `CompareTo()`. Podriamos utilziar el metodo `sort()` de la clase `ArrayList`, el cual te pide un `Comparator`(interface) como metodo de comparacion para el ordenamiento, por ejemplo:

```
lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
```
en el codigo andterior se utiliza el metodo `Comparing()` directamente dentro del `sort()` el cual utiliza una referencia a un metodo dentro del objeto a comparar, en este caso `getFechaDeLanzamiento`.

### Considere la siguiente clase Java:
```
public class Cuenta {

    private String titular;
    private double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    //getters y setters omitidos
}

@Override
public int compareTo(Cuenta otra) {
    if (this.saldo < otra.saldo) {
        return 1;
    } else if (this.saldo > otra.saldo) {
        return -1;
    } else {
        return 0;
    }
}
```
La implementación del método compareTo es correcta y ordena por saldo en orden descendente.

### Utilizando la interface List

Si vemos en la documentacion, podemos ver que la clase ArrayList esta implementado la interface List, lo que nos permite cambiar la referencia de la ArrayList creada anteriormente.

```
ArrayList<Titulo> lista = new ArrayList<>();
```
por: 

```
List<Titulo> lista = new ArrayList<>();
```
Esto nos permite poder trabajar de manera mas abstracta al hacerlo mediante interface(`programacion orientada a interfaces`), haciendo que podamos cambiar el tipo de instancia que utilizan `List`, por ejemplo:

```
List<Titulo> lista = new LinkedList<>();
```
esto no afectaria nuestro codigo, pero los distintos tipos de listas se utilizan para determinadas tareas que veremos mas adelante.

Tambien tenemos la interface madre de `List` que es `Collection`(no confundir con la clase `Collections`). Collection es una interface mas generica y no tenemos un conjunto de items ordenados(como en `List`), solo es un conjunto de items.

Dentro de Collection tenemos una interface que la hereda llamada `Set` en la que tenemos un conjunto de datos que no puede repetir un mismo dato. Una clase importnte que implementa Set es `HashSet`.

Tambien esta la interface `Map` que utiliza el conjunto de datos llave valor, el cual tendra dos datos; una llave y un valor, en la que encontraremos al item necesario a traves de la llave.Esto mediante una de las clases mas importanres llamada `HashMap`


### Para saber más: otras clases de listas en Java

Java ofrece diferentes clases para representar una lista de objetos. Estas clases son útiles en diferentes escenarios, dependiendo de las necesidades de cada aplicación.

Las clases más comunes para representar una lista en Java son:

__ArrayList__

La característica principal de ArrayList es que se basa en un array dinámico. Almacena los elementos en una matriz interna y, a medida que se agregan nuevos elementos, el tamaño de la matriz se ajusta automáticamente para acomodar el nuevo elemento. De manera similar, cuando se elimina un elemento, el tamaño del array se ajusta para evitar desperdiciar espacio. ArrayList se usa ampliamente debido a su facilidad de uso y eficiencia de rendimiento.

__LinkedList__

La clase LinkedList proporciona una lista enlazada de elementos. A diferencia de ArrayList, que se basa en un array, LinkedList se basa en una lista vinculada, lo que significa que cada elemento de la lista es un objeto que contiene una referencia al siguiente elemento. Esto permite agregar y eliminar elementos de manera eficiente en cualquier posición de la lista, pero puede hacer que la búsqueda de un elemento específico sea menos eficiente.

LinkedList es una buena opción cuando insertar y eliminar elementos en cualquier posición de la lista es frecuente y cuando no es necesario acceder a elementos aleatoriamente.

__Vector__

La clase Vector es similar a ArrayList, pero está sincronizada, lo que significa que es segura de usar en threads simultáneos. Sin embargo, la sincronización añade una sobrecarga de rendimiento, por lo que Vector puede ser más lento que ArrayList en algunas situaciones.

__Stack__

La clase Stack implementa una pila, que es una colección ordenada de elementos donde la inserción y eliminación de elementos siempre ocurren en el mismo extremo de la lista. Los elementos se agregan y eliminan en un orden conocido como "last-in, first-out" (LIFO), es decir, el último elemento agregado es el primero en ser eliminado. La clase Stack se usa a menudo en algoritmos de procesamiento de texto, así como en otras situaciones donde LIFO es la forma natural de organizar datos.

Cada una de estas clases tiene sus propias fortalezas y debilidades, y la elección de cuál utilizar dependerá de las necesidades específicas de la aplicación. Para una mejor comprensión de las estructuras de datos, recomendamos leer el siguiente artículo:

[Estructura de datos: introducción](https://www.aluracursos.com/blog/estructura-de-datos-introduccion)

### Para saber más: Map y HashMap

Una de las características más importantes de Java es su amplia biblioteca estándar, que ofrece muchas clases e interfaces útiles para los desarrolladores. Entre ellos se encuentran Map y HashMap, que son herramientas esenciales para asociar claves y valores en muchas aplicaciones Java.

__Map__

Map es una interface que permite a los desarrolladores asociar claves con valores. Es una estructura de datos útil para muchas aplicaciones Java, especialmente aquellas que implican manipular grandes cantidades de datos, por lo que es común utilizarla para buscar, actualizar y recuperar elementos por claves.

Está implementada por varias clases, la más común de las cuales es HashMap.

__HashMap__

HashMap es una clase que implementa la interfaz Map utilizando una tabla hash para almacenar pares clave-valor. Es conocido por su eficiencia en términos de tiempo de ejecución. Esta clase tiene una complejidad de tiempo O(1) - constante - para la inserción, recuperación y eliminación de elementos. ¡Esto significa que el rendimiento de HashMap no depende del tamaño de la recopilación de datos!

Sin embargo, es importante recordar que HashMap no mantiene el orden de inserción de los elementos y no garantiza el orden de los elementos en la salida. Esto se debe a que el orden de los elementos depende de la función hash utilizada para asignar las claves a los índices en la tabla hash. Además, el rendimiento de HashMap puede verse afectado si hay muchas colisiones de hash entre las claves.

Por ejemplo:
```
import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {

    public static void main(String[] args) {
        //Creando un objeto de la clase HashMap que implementa la interface Map
        Map<String, Integer> usandoHashMap = new HashMap<>();

        // Agregando pares clave-valor
        usandoHashMap.put("Gatos", 1);
        usandoHashMap.put("Perros", 2);
        usandoHashMap.put("Ratones", 3);

        // Accediendo un valor usando una clave
        int valor = usandoHashMap.get("Perros");
        System.out.println("Valor de la clave Perros: " + valor);

        // Eliminando un par clave-valor
        usandoHashMap.remove("Gatos");

        // Iterando sobre las claves
        for (String clave : usandoHashMap.keySet()) {
            System.out.println("Clave: " + clave);
            System.out.println("Valor: " + usandoHashMap.get(clave));
        }
    }
}
```
El resultado será:
```
Valor de la clave Perros: 2
Clave: Perros
Valor: 2
Clave: Ratones
Valor: 3
```

### Lo que aprendimos

Lo que aprendimos en esta aula:

Cómo ordenar una lista en Java, mediante el método Collections.sort;
Que para ordenar objetos que pertenecen a clases de nuestro proyecto, con la clase Título, debemos implementar en ella la interface Comparable;
Cómo implementar correctamente el método compareTo, de la interface Comparable, para que Java ordene correctamente los elementos de una lista;
Que podemos flexibilizar la ordenación de una lista, mediante el método sort de la propia interface List, pasando un criterio de ordenación como parámetro;
Que la clase ArrayList implementa la interface List, y esta interface tiene otras implementaciones, como la clase LinkedList;
Que podemos declarar una variable de lista usando la interface List, ganando así polimorfismo con la flexibilidad de cambiar fácilmente la implementación de la que se está instanciando.
