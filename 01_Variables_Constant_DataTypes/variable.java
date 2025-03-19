// DataTypes:

//      There are two types of datatypes in java. 
//             1. Primitive/Intrinsic
//             2. Non-Primitive/ Derived

// 1. Primitive -----> 2 types 
//        a) Numeric-----> 2 types (Integer, Floating Point (Float, double))
//        b) Non-Numeric-----> 2 types (Character, Boolean)

// 2. Non-Primitive -----> 3 types
//        a)Class
//        b)Interface
//        c)Arrays

//==============================================================================================
//Scope Of Class
// There are 3 types of scope of Class--> Instances Variable, Class Variable, Local Variable
//Instances Variable and Class Variable are declared inside the class.
//Local Variable can be declared and used inside methods. This cannot be used ouside the methods.



// variables
class variable{
    public static void main(String[] args) {
        System.out.println("Welcome, Let's Learn Variable");
        
        // this is a comment
// integers
        int num1=3;
        int num2=2;
        System.out.println("Num1 is "+ num1 + ". " +"Num2 is " + num2 + ".");

//float point types
 
      float x = 23.4f;
      System.out.println("This is a floating point number " + x);

// booleans
      
boolean isRain= true;
System.out.println("Is it raining today "+ isRain);

//characters
        char a = 'a';
        char b ='b';
        System.out.println("Two characters are : "+ a + " " + b);


// for extra space 
System.out.println("    ");

// Type-casting: Converting one dataType to another dataType of a Variable
//syntax-> type variableName1= (type) VariableName2
System.out.println("This is Type-Casting:");

// int to float
int mynum1=100;
float mytypecast1= (float) mynum1;
System.out.println("Integer to Float " + mytypecast1);

// float to int
float float1= 20.534f;
int floattypecast1= (int) float1;
System.out.println("Float to Integer" + floattypecast1);

    }

}