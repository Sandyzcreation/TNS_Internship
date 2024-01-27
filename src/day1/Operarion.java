package day1;

public class Operarion {

	public static void main(String[] args) {
		int M, N, p;
		M = 30;
		N = 248;
		p = 1;
		if(N!=0) {
			p = N % 10;
			M = M + N % p;
			N = N / 10;
		}
		else {
		System.out.println("The value of M is" + M );
		}
		System.out.println("M, N, p = " + M +","+N +","+p );

	}

}
