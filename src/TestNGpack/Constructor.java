package TestNGpack;

public class Constructor {
	int id;
	String name;
	int salary;
public Constructor(int id,String name,int salary)//same as class name
{
	this.id=id;
	this.name=name;
	this.salary=salary;
}
	
	public void display()
	{
		System.out.println("id"+id);
		System.out.println("empname"+name);
		System.out.println("salary"+salary);
	}

	public static void main(String[] args) {
		Constructor emp=new Constructor(01,"akhil",23000);
		emp.display();
	}

}
