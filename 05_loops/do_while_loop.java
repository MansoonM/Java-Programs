public class do_while_loop {
    public static void main(String[] args) {
        System.out.println("Do While Loop");

//==============================================
int a=1;
do{
System.out.println("a is " + a);
a++;
}while(a<=10);
//===============================================
        int num1=11;
        int num2=1;
        int mult;

        do { 
            mult= num1 * num2;
            System.out.println(num1 + " X " + num2 + " = " + mult);
            num2++;
        } while (num2<=10);
    }
}
