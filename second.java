public class second {
    public static void main(String[] args) {

        //Conditional Statement

        int x = 10;

        if (x>4) {
            System.out.println("x is greater than 4");
        } else if (x<4) {
            System.out.println("x is smaller than 4");
            
        }else {
            System.out.println("x is meh");
        }
        
        //SWITCH
        int temp;
        switch (x){
            case 1:
            case 4:
                temp = 1;
                break;
            case 2:
                temp = 2;
                break;
            default:    //else statement
                temp = 3;
                break;
        }


        //Conditional Expression = compact
        // ( condition ) ? expressionIfTrue : expressionIfFalse;
        int q = 10;
        int y = 5;
        int answer;

        answer = (q>y) ? q : y;
        System.out.println("Answer using conditional: " + answer);


    }
    
}
