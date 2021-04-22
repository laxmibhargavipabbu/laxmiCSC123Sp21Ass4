package laxmiCSC123Sp21Ass4;
import java.util.Random;
import java.util.Scanner;

public class InstituteDemo
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random randy = new Random(5);
		Institute inst = new Institute("BITS");
		Department dept1 = new Department("CS");
		Department dept2 = new Department("EE");
		Department other = new Department("Other");
		inst.addDepartment(dept1);
		inst.addDepartment(dept2);
		inst.addDepartment(other);
		for(int i=0; i<6; i++)
		{
			System.out.printf("Please enter the student name: ");
			String stud = keyboard.nextLine();
			System.out.printf("Please enter the Department name CS or EE: ");
			String dept = keyboard.nextLine();
			int id = randy.nextInt(99999)+1;
			Student student = new Student(stud,id,dept);
			
			if(student.getDept().equals("CS"))
			{
				dept1.addStudent(student);
			}
			else if(student.getDept().equals("EE"))
			{
				dept2.addStudent(student);
			}
			else
			{
				other.addStudent(student);
			}
			
		}
		System.out.printf("Institute Name: %s\n", inst.getinstituteName());
		for(Department dept : inst.getDepartmentsList())
		{
			for(Student stud : dept.getStudentList())
			{
				System.out.printf(stud.toString());
			}
		}
		System.out.printf("Total students in institute: %d", inst.getTotalStudentsInInstitute());
		keyboard.close();
	}
}