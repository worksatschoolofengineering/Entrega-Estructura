import java.util.Scanner;

public class VEDArbin<E extends Comparable<E>> {

    private Nodo<E> raiz;

    public void insertar(E valor) {
        if (raiz == null) {
            raiz = new Nodo<>(valor);
        } else {
            insertar(raiz, valor);
        }
    }

    private void insertar(Nodo<E> nodo, E valor) {
        if (valor.compareTo(nodo.getValor()) < 0) {
            if (nodo.getIzquierdo() == null) {
                nodo.setIzquierdo(new Nodo<>(valor));
            } else {
                insertar(nodo.getIzquierdo(), valor);
            }
        } else {
            if (nodo.getDerecho() == null) {
                nodo.setDerecho(new Nodo<>(valor));
            } else {
                insertar(nodo.getDerecho(), valor);
            }
        }
    }

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
        arbol.insertar(5);
        arbol.insertar(3);
        arbol.insertar(7);
        arbol.insertar(1);
        arbol.insertar(4);
        arbol.insertar(6);
        arbol.insertar(8);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor a buscar:");
        int valor = scanner.nextInt();
        if (arbol.buscarValor(valor)) {
            System.out.println("El valor " + valor + " está en el árbol");
        } else {
            System.out.println("El valor " + valor + " no está en el árbol");
        }
    }
}

class Nodo<E> {

    private E valor;
    private Nodo<E> izquierdo;
    private Nodo<E> derecho;

    public Nodo(E valor) {
        this.valor = valor;
    }

    public E getValor() {
        return valor;
    }

    public void setValor(E valor) {
        this.valor = valor;
    }

    public Nodo<E> getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo<E> izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo<E> getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo<E> derecho) {
        this.derecho = derecho;
    }
}




/**
 * El programa implementa un Árbol Binario de Búsqueda (ABB) y permite buscar un valor en el árbol. La complejidad algorítmica para la búsqueda es O(log n) en el mejor caso y O(n) en el peor caso, donde n es la cantidad de nodos en el árbol.
 * 
 */