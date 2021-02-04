import static org.junit.jupiter.api.Assertions.*;

class Pruebas {

    @org.junit.jupiter.api.Test
    public void Calculo() {
        CalculadoraGeneral a = new Calculadora();
        assertEquals("25",a.Calculo("23+5*"));
    }

    @org.junit.jupiter.api.Test
    public void Empty(){
        StackVector<Integer> a = new StackVector<Integer>();
        assertEquals(true, a.empty());
    }

    @org.junit.jupiter.api.Test
    public void SizePush(){
        StackVector<Integer> a = new StackVector<Integer>();
        a.push(1);
        assertEquals(1, a.size());
    }

}