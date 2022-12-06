public class Main {
    public static void main(String[] args) {
       int FirstPointX = 10;
       int FirstPointY = 20;
       int SecondPointX = 13;
       int SecondPointY = 28;
       int a = (int) Math.pow((SecondPointX-FirstPointX), 2 );
       int b = (int) Math.pow((SecondPointY-FirstPointY), 2 );
       double LengthOfALine =  Math.sqrt(a+b);
       System.out.println("Length of the line is:"+LengthOfALine);
    }
 }

