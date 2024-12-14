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


