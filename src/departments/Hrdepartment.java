package departments;

public class Hrdepartment extends SuperDepartment {
	public String departmentName() {
		return "Hr Department";
	}
	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendence";
	}
   public String getWorkDeadline() {
	   return "Complete by EOD";
   }
   public String doActivity() {
	   return "team Lunch";
   }
}
