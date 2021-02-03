import java.util.Vector;

public class StackVector<E> implements Stack<E> {

    Vector<E> almacenamiento;

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
        return almacenamiento.remove(size()-1);
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
