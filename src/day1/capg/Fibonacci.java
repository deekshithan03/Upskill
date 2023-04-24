package day1.capg;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=128;
		int first=0;
		int second=1;
		for(int i=1;i<=n;i++) {
			System.out.println(first);
			int next= first+ second;
			first=second;
			second=next;
			if(first > 128) {
				break;
			}
		}

	}

}
