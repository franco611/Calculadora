/******************************************************************
 StackVector.java
 Autor: Diego Franco

 Clase que implementa la interfaz de Stack que se utiliza para almacenar
 los datos de las operaciones necesarias por la calculadora.
 ******************************************************************/
import java.util.Vector;

public class StackVector<E> implements Stack<E> {

    public Vector<E> almacenamiento;

    /** Metodo constructor*/
    public StackVector()
    {
        almacenamiento = new Vector<E>();
    }

    @Override
    public void push(E item) {
        almacenamiento.add(item);
    }

    @Override
    public E pop() {
        E ad = almacenamiento.get(size()-1);
        almacenamiento.remove(size()-1);
        return ad;
    }

    @Override
    public E peek() {
        return almacenamiento.get(size()-1);
    }

    @Override
    public boolean empty() {
        return almacenamiento.isEmpty();
    }

    @Override
    public int size() {
        return almacenamiento.size();
    }
}
