package day1;

public class Fact {
	int fact(int n)
	{
		int r=1;
		for(int i=n;i>=1;i--) {
			r=r*i;
		}
		return r;
	}
}
