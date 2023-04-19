
// Metodo recursivo.

/* 
Se tiene un método público contains que recibe un valor de tipo E y llama a un método privado contains que recibe un nodo del árbol y el valor a buscar.

El método privado contains verifica si el nodo es nulo, en cuyo caso retorna false. Si el nodo no es nulo, compara el valor del nodo con el valor buscado, y si son iguales, retorna true. 
Si los valores son distintos, se llama recursivamente a contains con el hijo izquierdo y luego con el hijo derecho del nodo actual.

La complejidad algorítmica de este método es de O(n), siendo n la cantidad de nodos en el árbol. Esto se debe a que en el peor caso se debe recorrer todo el árbol para encontrar el valor buscado, 
lo que implica visitar cada uno de los n nodos del árbol.
*/

public boolean contains(E valor) {
    return contains(this.raiz, valor);
}

private boolean contains(Nodo<E> nodo, E valor) {
    if (nodo == null) {
        return false;
    } else if (nodo.getValor().equals(valor)) {
        return true;
    } else {
        return contains(nodo.getIzquierdo(), valor) || contains(nodo.getDerecho(), valor);
    }
}


