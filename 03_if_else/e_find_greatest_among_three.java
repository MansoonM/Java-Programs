public class e_find_greatest_among_three {
    public static void main(String[] args) {
        
        // Find Greatest Among Three Numbers
        int num1=10;
        int num2=20;
        int num3=9;

        if(num1>num2 && num1>num3){
            System.out.println("num1 is greatest among three.");
        }else if(num2> num1 && num2 > num3){
            System.out.println("num2 is greatest among three.");
        }
        else{
            System.out.println("num3 is greatest among three.");
        }
    }


}
