import java.util.ArrayList;
class Company
{
	public static void main (String[]args)
	{
		ArrayList emp=new ArrayList();
		emp.add(new MTE("dinga",10000));
		emp.add(new ATE("dingi",10500));
		emp.add(new FED("punga",11000));
		emp.add(new BED("sunga",12000));
		emp.add(new SHR("timma",15000));
		emp.add(new JHR("dumma",18000));
		System.out.println("emp");
		for(int i=0;i<emp.size();i++)
		{
		System.out.println(emp.get(i));
        }
}
}