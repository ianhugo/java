public class third_loops {
    
    public static void main(String[] args){

        //while
        int x = 0;
        int y = 0;
        while (x != 4) { // the while loop will run as long as x==4 condition is being met             
            y += x;
            x += 1;
        } 
        System.out.println("Value of y = " + y);
        System.out.println("Value of x = " + x);    
    
        //do . . .while
        //executes at least once
        int number = 5;
        do {
            System.out.println("Value of number is: " + number);
            number++;
        } while (number <= 9); // the contition is being checked after the first run
    }
}
