
// class for operation
class Calculator
{
// method
          public int add(int n1,int n2){
            int r =n1+n2;
            return r;
          }
}


public class first{
    public static void main(String args[]){
        //instances variable

// create object using class name
// className objName = new className();
Calculator calc = new Calculator();

//call object
//objName.methodName();
    int result=  calc.add(4,5);

System.out.println("Result "+result);

    }
}