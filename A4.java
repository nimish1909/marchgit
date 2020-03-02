import java.util.ArrayList;
class A4
{
	public static void main(String[] args) 
	{
		ArrayList obj1=new ArrayList();
		obj1.add(new Emp("dinga",19));
        obj1.add(new Emp("dingi",17));
		obj1.add(new Emp("pengi",37));
		obj1.add(new Emp("sundra",25));
		obj1.add(new Emp("sundri",21));
		System.out.println(obj1);
		for(int i=0;i<obj1.size();i++)
		{
          System.out.println(obj1.get(i));
		}
		obj1.remove(0);
		System.out.println(obj1);
	}
}