public class Calculadora implements CalculadoraGeneral{

    StackVector<Integer> alm;

    public Calculadora()
    {
        alm = new StackVector<Integer>();
    }

    @Override
    public String Calculo(String texto)
    {
        for(int i=0; i<=texto.length()-1; i++)
        {
            char pos = texto.charAt(i);
            if(Character.isDigit(pos)){
                alm.push(Character.getNumericValue(pos));
            }
            else
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
        if(alm.empty())
            return "La operacion es invalida";
        else
            return (alm.pop()).toString();
    }


}
