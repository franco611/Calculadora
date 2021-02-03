public class Calculadora implements CalculadoraGeneral{

    StackVector<Integer> alm = new StackVector<Integer>();

    public Calculadora()
    {

    }

    @Override
    public String Calculo(String texto)
    {
        for(int i=0; i<=texto.length()-1; i++)
        {
            Character pos = texto.charAt(i);
            if(Character.isDigit(pos)){
                alm.push(Character.getNumericValue(pos));
            }
            else
            {
                int num1= alm.pop();
                int num2= alm.pop();
                switch (pos){
                    case '+': alm.push(num1+num2);
                    case '-': alm.push(num2-num1);
                    case '*': alm.push(num1*num2);
                    case '/': alm.push(num2/num1);
                }
            }
        }
        if(alm.empty())
            return "La operacion es invalida";
        else
            return (alm.pop()).toString();
    }


}
