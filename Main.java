public class Main {
    int a;
    int b;
    int c;
    int d;

    public Main(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public static double LengthOfALine(int a, int b, int c, int d) {
        int x = (int)Math.pow((c - a), 2.0);
        int y = (int)Math.pow((d - b), 2.0);
        double LengthOfALine= Math.sqrt((x + y));
        lengthOfTheLine(a,b,c,d,LengthOfALine);
        return LengthOfALine;
    }

    public static void lengthOfTheLine(int a, int b, int c, int d, double LengthOfALine) {
        System.out.printf("Length of the line for point(%d,%d),point(%d,%d) is: %.2f\n", a, b, c, d, LengthOfALine);
    }
    public static void main(String[] args) {
        int a1 = 3;
        int b1 = 4;
        int c1 = 5;
        int d1 = 6;
        int a2 = 7;
        int b2 = 8;
        int c2 = 9;
        int d2 = 12;
        String Line1 = String.valueOf(Main.LengthOfALine(a1, b1, c1, d1));
        String Line2 = String.valueOf(Main.LengthOfALine(a2, b2, c2, d2));
        if (!Line1.equals(Line2)) {
            System.out.println("The Given points for Line1 is not equals to Line2");
        } else {
            System.out.println("The Given points for Line1 is equals to Line2");
        }
        if ( ( Main.LengthOfALine(a1, b1, c1, d1)) > (Main.LengthOfALine(a2, b2, c2, d2))) {
            System.out.println("Line1 is greater than Line2");
            System.out.println(Line1.compareTo(Line2));
        } else {
            System.out.println("Line1 is less than Line2");
            System.out.println(Line2.compareTo(Line1));
        }
    }
}