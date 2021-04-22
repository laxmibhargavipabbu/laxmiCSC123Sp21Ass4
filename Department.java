package laxmiCSC123Sp21Ass4;
import java.util.ArrayList;

public class Department
{
	private String deptName;
	ArrayList<Student> studentList = new ArrayList<Student>();
	
	public Department()
	{
		this.deptName = "";
	}
	
	public Department(String deptName)
	{
		setDept(deptName);
	}
	
	public void addStudent(Student stud)
	{
		studentList.add(stud);
	}
	
	public ArrayList<Student> getStudentList()
	{
		return this.studentList;
	}
	
	public void setDept(String dept)
	{
		this.deptName = dept;
	}
	
	public String getDept()
	{
		return this.deptName;
	}
}
