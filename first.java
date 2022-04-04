
import java.util.Scanner;

class HelloWorld{ //class declaration, followed by block

    //main = where java programs start execution
    //must have this method
    public static void main(String args[]){
        System.out.println("Hello World!!!"); //statement termination required!
        float aa = 7.42f;
        char bb = 57;
        String tt = null;
        System.out.println(tt);

        int age = 10, height = 5;
        System.out.println("age: "+ age + height);


        // Scanner scanner_1 = new Scanner(System.in);
        // System.out.println("enter your name:");
        // String name = scanner_1.nextLine();
        // System.out.println("Howdy "+ name);


        //MATH
        //++ -- , post and pre increment/decrement
        
        //Math.<xxx>
        // .pow .exp .sqrt. cbrt (cuberoot)
        //log (natural log), .log10
        //.abs, min, max

        System.out.println(Math.pow(2,3));

        //Logic
        //! not
        //&& and
        //|| or
        // ^XOR (true = one expression T, other F)

        //STRING
        //class in java.lang
        //immutable

        //+ concatenation
        String one = "Hello";
        String two = " World";
        int number = 10;
        String new_string = one + two + " " + number;
        System.out.println(new_string);

        //comparing strings
        System.out.println(one.equals(two));

        //split based on regex
        String greet = "Hello World,My name is Waldo,How are you?";
        String[] greetings = greet.split(",");
        System.out.println(greetings[0]);
        System.out.println(greetings[1]);
        System.out.println(greetings[2]);

        //substrings
        String choice = "CoffeeOrTea";
        //First: Only one argument
        System.out.println(choice.substring(8)); //till the end

        //Second: Two arguments
        System.out.println(choice.substring(0, 6)); //non inclusive


        System.out.println(choice.toUpperCase());
        System.out.println(choice.toLowerCase());

        //length
        String greeting = "Hello World";
        System.out.println("The length of greeting is: " + greeting.length());

        //cosmetic
        //.trim(), removes leading and trailing spaces
    }
}

/*
Why Java?
1. Simple and portable (pointers allowed)
2. Object-oriented
3. independent on host platform
4. secure and dynamic
5. networking libraries
6. just-in-time compilers
7. memory management system
8. multi-threaded

banned bad practices
1. pointers
2. operator overloading
3. multiple inheritance
4. friend calsses (access another object's private members)
5. Restrictions of explicit type casing (memory management)

coimpile by Java compiler
= translator, programmer -> CPU
1. compiled into bytecode (saaved as .class)
2. JVM converts this with Just-in-time compiler = machine code

*/


///VARIABLES
/*
Strongly-typed
a-z0-9 $_
(numbers cannot come first)

INTEGERS
short: 16bit signed
int: 32 bit signed
long: 64bit signed

FLOAT / DOUBLE

char
- refers to specific characters if numbers
- use single quotes, if literal
String

boolean
true/false

Null
unintialized state of var
*/


//USER INPUT

