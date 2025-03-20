public class whileloop {
    public static void main(String[] args) {
        System.out.println("While Loop");
//=======================
        int a=1;
        while (a<=10) { 
            System.out.println("This is " + a);
            a++;
        }
//=========================
        int b=1;
        int sum;
        while (b<=5) { 
            sum= b*b;
            System.out.println("Sum is "+sum + " when b is "+ b);
            b++;
        }
//========================
     int num1=1; //which table
     int num2=1; 
     int mult;
     while (num2<=10) {
        mult= num1 * num2;
        System.out.println((num1)+ " X " +(num2) +" = " + (mult));
        num2++;
     }
//==========>
    }
}
