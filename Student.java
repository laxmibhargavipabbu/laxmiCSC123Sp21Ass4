package laxmiCSC123Sp21Ass4;
public class Student
{
	private String name;
	private String dept;
	private int	id;
	
	public Student()
	{
		this.name = "";
		this.dept = "";
		this.id = 0;
	}
	
	public Student(String name, int id, String dept ) 
	{
		setName(name);
		setId(id);
		setDept(dept);
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setDept(String dept)
	{
		this.dept = dept;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getDept()
	{
		return dept;
	}
	
	public String toString()
	{
		return String.format("%s %d %s \n", getName(),getId(), getDept());
	}
	
}
