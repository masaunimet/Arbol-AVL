# Arbol-AVL

----Para su funcionamiento tiene que implementarse en el framework de Java, NetBeans----

Una de las dificultades que se presentan con los árboles binarios de búsqueda es que puede resultar complicado mantener una complejidad cercana a Log2N, en la operación de búsqueda de una clave. Para que lo anterior sea cierto, debe contarse con mecanismos que mantengan equilibrado al árbol binario de búsqueda. Esa condición de equilibrio puede verse rápidamente afectada tras operaciones de inserción y eliminación realizadas sobre el árbol, a tal punto, que el mismo pudiese convertirse en un árbol degenerado, que como se trató en clases, es sencillamente una lista, en la que la búsqueda puede tener una complejidad de O(n). Para hacer frente a tal problema, Adelson-Velskii y Landis, crearon una especialización de los árboles binarios de búsqueda. Tal estructura de datos es conocida como árboles balanceados o árboles AVL.  En dichos árboles, debe mantenerse en todo momento una condición de equilibrio, la cual es revisada cada vez que se realiza una inserción o una eliminación en el árbol. Cuando se detecta algún desequilibrio, entonces se ejecutan los denominados algoritmos de rotación, tanto simple, como doble. 
Su equipo de trabajo deberá implementar un pequeño sistema en Java que implemente un árbol AVL. Específicamente, se requieren las siguientes funcionalidades:

Creación del árbol: que deberá crear un árbol vacío.
Inserción de una clave: que insertará una clave en el árbol, según las restricciones propias de los árboles binarios de búsqueda.
Eliminación de una clave: que eliminará el nodo correspondiente a la clave.
Mantenimiento de la condición de equilibrio del árbol: Tomando en cuenta que las operaciones de eliminación e inserción pueden desequilibrar el árbol, cada vez que estas sucedan, deberá revisarse la condición de equilibrio del árbol y si es necesario, ejecutar los algoritmos de rotación.
Visualización del árbol: En todo momento, el usuario podrá visualizar el árbol y su evolución a medida que se realicen operaciones de inserción o eliminación en él. 

Las claves a contener en el árbol serán numéricas. 
