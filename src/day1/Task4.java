package day1;

public class Task4 {

	public static void main(String[] args) {
		int n,p,q,r;
		p = 5;
		q = 8;
		r = 4;
		if((p^q)<(10+p)) {
			p=p+q;
		}
		else {
			if((p&q&r)>(r&p)) {
				q=(1+3)^r;
			}
				
		}
		n=p+q+r;
		System.out.println(n);

	}

}
