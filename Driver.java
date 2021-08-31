class superDepartment{
	public String departmentName()
	{
		return "Super Department";
	}

	public String getTodaysWork()
	{
		return " No work as of now";
	}

	public String getWorkDeadline()
	{
		return "Nil";
	}

	public String isTodayAHoliday()
	{
		return "Today is not a holiday";
	}
}

class AdminDepartment extends superDepartment{
	public String departmentName()
	{
		return "Welcome to Admin Department";
	}

	public String getTodaysWork()
	{
		return "Complete your documents Submission";
	}

	public String getWorkDeadline()
	{
		return "Complete by EOD";
	}
}

class HrDepartment extends superDepartment{

	public String departmentName()
	{
		return "Welcome to Hr Department";
	}

	public String getTodaysWork()
	{
		return "Fill today's worksheet and mark your attendance";
	}

	public String getWorkDeadline()
	{
		return "Complete by EOD";
	}

	public String doActivity()
	{
		return "team Lauch";
	}
}

class Techdepartment extends superDepartment{
	public String departmentName()
	{
		return "Welcome to Tech Department";
	}

	public String getTodaysWork()
	{
		return "Complete coding of module 1";
	}

	public String getWorkDeadline(){
		return "Complete by EOD";
	}

	public String getTechStackInformation()
	{
		return "core Java";
	}

}

public class Driver{
	public static void main(String args[])
	{
		HrDepartment obj2 = new HrDepartment();
		Techdepartment obj3 = new Techdepartment();
		AdminDepartment obj1 = new AdminDepartment();

		System.out.println(obj1.departmentName());
		System.out.println(obj1.getTodaysWork());
		System.out.println(obj1.getWorkDeadline());
		System.out.println(obj1.isTodayAHoliday());
		System.out.println("   ");

		System.out.println(obj2.departmentName());
		System.out.println(obj2.doActivity());
		System.out.println(obj2.getTodaysWork());
		System.out.println(obj2.getWorkDeadline());
		System.out.println(obj2.isTodayAHoliday());
		System.out.println("   ");

		System.out.println(obj3.departmentName());
		System.out.println(obj3.getTodaysWork());
		System.out.println(obj3.getWorkDeadline());
		System.out.println(obj3.getTechStackInformation());
		System.out.println(obj3.isTodayAHoliday());
		System.out.println("   ");
	}
}