
public class Student {
	public static void main(String[] args) {
		

	Student student1 = new Student(); 
	System.out.println(student1.hashCode());//Object
	Student student2 = new Student(); 
	System.out.println(student2.hashCode());
	Student student3 = student2;
	System.out.println(student3.hashCode());
	System.out.println(student1.equals(student2));//Object

}
	public int hashCode()
	{
		return 1; 
	}
}
