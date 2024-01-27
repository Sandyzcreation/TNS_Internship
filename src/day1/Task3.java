package day1;

public class Task3 {

	public static void main(String[] args) {
		int a, b;
		a = 6;
		b = 7;
		funn(int a, int b) {
			if( b>a && a>3 ) {
				a = (b + 1) + a;
				b = 1 + 3 + a;
				return a-funn(b,b);
			}
				return b -1;
				funn f = new funn(2,4);
			}
		}
}



