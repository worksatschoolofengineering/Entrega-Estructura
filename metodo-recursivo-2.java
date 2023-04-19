// Ejercicio Metodo Recursivo

/**
 *  Si es entero positivo retorne true...
 * 
 *  Metodo de scanner en tipo string
 *  luego ese 
 * 
 */

public boolean buscarValor(E valor) {
    return buscarValor(raiz, valor);
}

private boolean buscarValor(Nodo<E> nodo, E valor) {
    if (nodo == null) {
        return false;
    }
    if (nodo.getValor().equals(valor)) {
        return true;
    }
    return buscarValor(nodo.getIzquierdo(), valor) || buscarValor(nodo.getDerecho(), valor);
}

public static void main(String[] args) {
    VEDArbin<Integer> arbol = new VEDArbin<>();
    // Agregar nodos al árbol
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el valor a buscar:");
    int valor = scanner.nextInt();
    if (arbol.buscarValor(valor)) {
        System.out.println("El valor " + valor + " está en el árbol");
    } else {
        System.out.println("El valor " + valor + " no está en el árbol");
    }
}

