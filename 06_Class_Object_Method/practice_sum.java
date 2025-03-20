

public class practice_sum {
    public static void main(String[] args) {
        // create object named "obj" of class "sum"
        sum obj= new sum();
        int res = obj.add(10,20);
        System.out.println("Result "+ res);
    }
}


class sum{

    //method name "add"
    public int add(int num1,int num2){
        //instance of method
    int result= num1+num2;
    return result;
    }
}