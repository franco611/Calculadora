public interface Stack<E> {
    /** Agrega el elementeo a la lista*/
    public void push(E item);

    /** Retorna el ultimo elemento antes de eliminarlo*/
    public E pop();

    /** Retorna el valor del ultimo elemento*/
    public E peek();

    /** Verifica si esta vacio o no*/
    public boolean empty();

    /** Retorna el tamaño*/
    public int size();
}
