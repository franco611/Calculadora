/******************************************************************
 Calculadora.java
 Autor: Diego Franco

 Clase que implementa la interfaz de calculadorageneral, la cual
 recibe del main las operaciones que debe de ejecutar ytulizando
 el stack.
 ******************************************************************/
public class Calculadora implements CalculadoraGeneral{

    StackVector<Integer> alm;
    String operadores;

    /** Metodo constructor*/
    public Calculadora()
    {
        operadores="+*-/";
    }

    @Override
    public String Calculo(String texto)
    {
        alm = new StackVector<Integer>();
        try
        {
            for(int i=0; i<=texto.length()-1; i++)
            {
                char pos = texto.charAt(i);
                if(Character.isWhitespace(pos)){

                }
                else if(Character.isDigit(pos)){
                    alm.push(Character.getNumericValue(pos));
                }
                else if(operadores.contains(Character.toString(pos)))
                {
                    if(alm.size()>1){

                        int num1= alm.pop();
                        int num2= alm.pop();
                        switch (pos){
                            case '+': alm.push(num2+num1);break;
                            case '-': alm.push(num2-num1);break;
                            case '*': alm.push(num2*num1);break;
                            case '/': alm.push(num2/num1);break;
                        }
                    }
                    else{
                        return "La operacion es invalida";
                    }
                }
            }
        }
        catch(Exception e){
            return "La operacion es invalida";
        }
        if(alm.empty()||alm.size()>1)
            return "La operacion es invalida";
        else
            return (alm.pop()).toString();
    }


}
