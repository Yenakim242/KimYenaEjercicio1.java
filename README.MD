## Ejercicio #1 About me

Imagina que has sido contratado por una red social emergente (신생의) que quiere dar la posibilidad a sus usuarios de crear un perfil interactivo. Esta red social no busca ser un simple muro (담) de publicaciones, sino una experiencia personal donde cada usuario pueda compartir su historia, gustos y curiosidades de una forma más dinámica.

Tu primera tarea es crear una aplicación llamada "About Me" en Java usando la consola, donde dada la información de un perfil, la muestre de forma organizada en categorías como My Story, Favorites, Fun Facts. Esta aplicación servirá como prototipo que ayudará a tus compañeros a entender cómo podría estructurarse un perfil en la futura red social

1. Tarea 1 – Clase Perfil

Define la clase Perfil con las siguientes características:

· name: El nombre del perfil.

· story: La historia personal del perfil.

· hobbies: Colección de hobbies del perfil.

· foods: Colección de comidas favoritas del perfil.

· funFacts: Colección de datos curiosos.

La clase deberá tener métodos para acceder a estos atributos y métodos que devuelvan la información de manera formateada para que sea fácil de mostrar por consola la información. 

2. Tarea 2 – Creando objeto del tipo Perfil

En la clase Main crea un objeto del tipo Perfil que contenga información sobre ti. Declara al menos 3 hobbies, 3 foods y 3 funFacts. Muestra por consola su información. 

3. Tarea 3 – Interactuando con objetos del tipo Perfil.

En la clase Main crea un menú de consola que permita al usuario navegar entre las distintas secciones del perfil. El menú se mostrará mientras que el usuario no seleccione la opción [4 ] Salir. Si el usuario escoge cualquier otro valor (incluido un valor no numérico), le indicaremos que esta opción no existe y le volveremos a mostrar el menú.

Menu AboutMe [nombre del perfil]

[1] Story: se mostrará al usuario la historia del perfil y se regresará al menú.

[2] Favorites: se mostrará al usuario los hobbies y foods del perfil y se regresará al menú

   
[3] Fun Fact: se mostrará al usuario uno de los fun facts del perfil (escogido de forma aleatoria) y se regresarña al menú

[4] Salir: se terminará el programa

-----------------------------------


## Ejercicio1: About Me
El proyecto About Me es una aplicación interactiva desarrollada en Java, que permite a los usuarios explorar un perfil personal simulado. Este perfil incluye una breve historia, una lista de hobbies, comidas favoritas y datos curiosos. El objetivo principal es practicar el uso de clases, listas dinámicas y menús interactivos para mejorar las habilidades en programación orientada a objetos.


## Explicación de la aplicación
1. Creación de la clase KimYenaPerfil: La clase KimYenaPerfil fue diseñada para representar un perfil de usuario.

    · Atributos privados

        - name: nombre del perfil.

        - story: historia del perfil.

        - hobbies: lista del perfil.

        - foods: lista de comidas favoritas.

        - funFacts: lista de datos curiosos.
    
    · Constructor

        - Se inicializó el nombre y la historia del perfil.

        - Las listas (hobbies, foods, funFacts) fueron instanciadas como ArrayList vacíos.

    · Métodos: para recuperar y dar formatos a los datos.

        - getFormattedStory(), getFormattedHobbies(), getFormattedFood().

    Esto permitió encapsular la información del perfil y estructurar el acceso a sus datos.


2. Creación de la claseKimYenaEjercicio1Main

    · Creación del objeto perfil: Un objeto de tipo KimYenaPerfil se inicializó con datos reales (tu nombre, historia, hobbies, comidas y fun facts).

    · Interfaz de usuario: Se diseñó un menú interactivo utilizando un bucle while que muestra opciones al usuario:

        - Mostrar la historia del perfil.

        - Mostrar los hobbies y comidas favoritas.

        - Mostrar un dato curioso aleatorio.

        - Salir del programa.

    · Cada opción se gestionó con un switch que llama a los métodos correspondientes del objeto perfil.

    · Entradas no válidas se manejaron con un try-catch para evitar errores y guiar al usuario.


3. Uso de Random

La funcionalidad de seleccionar un dato curioso aleatorio se implementó con: new Random().nextInt(lista.size());
Esto asegura que cada vez que el usuario elige la opción 3, se muestra un dato curioso diferente.


4. Código claro y bien organizado

    · Se utiliza un método auxiliar showMenu(String nombre) para mantener el código del menú separado del bucle principal.