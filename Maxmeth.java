import java.util.Scanner;

//     public void myMax(int a , int b) {
//    	 int c=a+b;
//    	 System.out.println("Sum of a and b is"+ c); }


public class Maxmeth {

	static void myMax(int a, int b) {
		int c=a+b;
		System.out.println("Sum of a and b is "+c);		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first Number :");
		
		int a = sc.nextInt();
		
//        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Second Number:");
		
		int b = sc.nextInt();
		
		sc.close();
		
		myMax(a,b);
		
		
	}

}
