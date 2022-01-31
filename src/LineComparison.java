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
		    public double getLengthOfLine()
		    {
		        double lengthofLine = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		        return lengthofLine;
		    }

		    public static void main(String[] args) {

		        //Object of LineComaprison Class for Calculating Length of Lines
		        LineComparison LC1 = new LineComparison();
		        LineComparison LC2 = new LineComparison();

		        //Getting Lines input from user
		        LC1.getLinePoint();
		        LC2.getLinePoint();

		        //Storing Length of Lines in Local Variables
		        double line1Length = LC1.getLengthOfLine();
		        double line2Length = LC2.getLengthOfLine();

		        //Displaying the Length of Lines
		        System.out.println("Length of Line1 : "+line1Length);
		        System.out.println("Length of Line2 : "+line2Length);

		        //Checking the Equality of Lines
		        if(line1Length == line2Length) {
		            System.out.println("Length of Line1 and Line2 are Equal");
		        } else {
		            System.out.println("Length of Line1 and Line2 are Not Equal");
		        }
		    }
	}
