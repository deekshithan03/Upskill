package day2.capg;

class Students{
	
	String name;
	int marks;
}

public class ArrayOfObjects {

	public static void main(String[] args) {
		Students s1= new Students();
		s1.name="ABC";
		s1.marks=89;
		Students s2= new Students();
		s2.name="DEF";
		s2.marks=71;
		Students s3= new Students();
		s3.name="GHI";
		s3.marks=65;
		
		Students student[]=new Students[3];
		student[0]=s1;
		student[1]=s2;
		student[2]=s3;
		
		for(int i=0;i<student.length;i++) {
			System.out.println(student[i].name +":"+ student[i].marks);
		}
		//enhanced for loop
		for(Students stu:student) {
			System.out.println(stu.name+":"+stu.marks);
		}
	}

}
