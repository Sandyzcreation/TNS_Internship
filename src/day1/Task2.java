package day1;

public class Task2 {

	public static void main(String[] args) {
		int A, B, D, Q;
		A = 62;
		B = 7;
		if(B!=0) {
			D = A % 10;
			Q = A / 10;
			D = D * 10;
			A = D + Q;
			A = A + 1;
			B = B - 1;
			
		}
		else {
			System.out.println("The value of A is" + A );
		}

		System.out.println("The value of A and B are " + A +","+ B );
	}

}
