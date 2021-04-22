package laxmiCSC123Sp21Ass4;
import java.util.ArrayList;

public class Institute
{
	private String instituteName;
	private ArrayList<Department> departmentsList = new ArrayList<Department>();
	
	public Institute()
	{
		this.instituteName = "";
	}
	
	public Institute(String inst)
	{
		setinstituteName(inst);
	}
	
	public void setinstituteName(String inst)
	{
		this.instituteName = inst;
	}
	
	public String getinstituteName()
	{
		return this.instituteName;
	}
	
	public void addDepartment(Department dept)
	{
		departmentsList.add(dept);
	}
	
	public ArrayList<Department> getDepartmentsList()
	{
		return this.departmentsList;
	}
	
	public int getTotalStudentsInInstitute()
	{
		int noOfStudents = 0;
		for(Department dept : departmentsList)
		{
			for(Student stud : dept.getStudentList())
			{
				noOfStudents = noOfStudents +1;
			}
		}
		return noOfStudents;
	}
}
