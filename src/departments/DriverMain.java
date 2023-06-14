package departments;

public class DriverMain {

	public static void main(String[] args) {
	  SuperDepartment superDept = new SuperDepartment();
      AdminDepartment admindept = new  AdminDepartment();
      Hrdepartment hrdept = new  Hrdepartment();
      TechDepartment techdept = new  TechDepartment();
	  
      System.out.println(admindept.departmentName());
      System.out.println(admindept.getTodaysWork());
      System.out.println(admindept.getWorkDeadline());
      
      System.out.println(hrdept.departmentName());
      System.out.println(hrdept.getTodaysWork());
      System.out.println(hrdept.getWorkDeadline());
      System.out.println(hrdept.doActivity());

      System.out.println(techdept.departmentName());
      System.out.println(techdept.getTodaysWork());
      System.out.println(techdept.getWorkDeadline());
      System.out.println(techdept.getTechStackInformation());
      
     
      System.out.println(superDept.isTodayAHoliday());
      System.out.println(admindept.isTodayAHoliday());
      System.out.println(hrdept.isTodayAHoliday());
      System.out.println(techdept.isTodayAHoliday());
	}

}
