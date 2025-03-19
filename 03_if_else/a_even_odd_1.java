public class a_even_odd_1 {
    public static void main(String[] args) {

        
// check even odd with condition

        int number=50;

        if(number%2!=0){
            System.out.println(number + " is an Odd Number.");
        }   
        else{
            if(number%2==0 && number>=2 && number<=5){
              System.out.println(number+ " is an even number and lies in Range 2 to 5");
            }
            else if(number%2==0 && 6<=number && number <=20){
                    System.out.println(number+ " is an even number and lies in Range 6 to 20");
                }
            else{
                    System.out.println(number + " is an even number and greater than 20.");
                
            }
            
        }

    }
}
