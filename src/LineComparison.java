import java.util.Scanner;

public class LineComparison {
    //Variables for Line Points
    int x1,x2,y1,y2;

    //Scanner Object for User Input
    Scanner sc = new Scanner(System.in);

    //Method to Get Input from User
    public void getLinePoint()
    {
        System.out.println("Enter The Value of X1 :");
        x1=sc.nextInt();

        System.out.println("Enter The Value of Y1 :");
        y1=sc.nextInt();

        System.out.println("Enter the Value of X2 :");
        x2=sc.nextInt();

        System.out.println("Enter the Value of Y2 :");
        y2=sc.nextInt();

    }

    //Method to Calculate Length of Line
    public double getLengthOfLine() {
        double lengthofLine = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        return lengthofLine;
    }

    //Checking the Equality or Smaller Length Lines
    public static String compareTo(double l1,double l2)
    {
        if(l1==l2)
        {
            return "Line1 and Line2 are Equal.";
        }
        else
        {
            if(l1>l2)
            {
                return "Line 1 is Bigger Than Line 2";
            }
            else
            {
                return "Line 1 is Smaller Than Line 2";
            }
        }
    }
    public static void main(String[] args) {

        //Object of LineComaprison Class for Calculating Length of Lines
        LineComparison LC1 = new LineComparison();
        LineComparison LC2 = new LineComparison();

        //Getting Line Point from User Input
        LC1.getLinePoint();
        LC2.getLinePoint();

        //Getting Length of Lines in Variables
        double line1Length = LC1.getLengthOfLine();
        double line2Length = LC2.getLengthOfLine();


        //Displaying the Length of Lines
        System.out.println("Length of Line1 : "+line1Length);
        System.out.println("Length of Line2 : "+line2Length);

        //Checking the Equality or Smaller Length of Lines
        System.out.println(compareTo(line1Length,line2Length));
    }
}