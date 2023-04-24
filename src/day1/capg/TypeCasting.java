package day1.capg;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =257;
		byte k=(byte)a;       //explicit type conversion
		System.out.println(k);
		
		float f =5.6f;
		int t = (int)f;
		System.out.println(t);

		byte n = 2;
		byte m= 4;
		int result = n*m;    //type promotion
		System.out.println(result);

	}

}
