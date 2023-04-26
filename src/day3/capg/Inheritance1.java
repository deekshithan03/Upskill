package day3.capg;
//Multi level inheritance

class Add{
	public int add(int a,int b) {
		return a+b;
	}
}

class Sub extends Add{
	public int sub(int a,int b) {
		return a-b;
	}
}
 
class Multi extends Sub{
	public int multi(int a,int b) {
		return a*b;
	}
}
public class Inheritance1 {

	public static void main(String[] args) {
 
		Multi calc = new Multi();
		int r1=calc.multi(10, 2);
		int r2=calc.sub(10,5);
		int r3=calc.add(2,5);
		System.out.println(r1+" "+r2+" "+r3);
	}

}
