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
	        LineComparison LC = new LineComparison();
	        LC.getLinePoint();
	        System.out.println("Length of Lines : "+LC.getLengthOfLine());
	    }
	}
