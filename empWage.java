class empWage{

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	public int total_Wage = 0;

	public int getWorkHrs(){
		int work_Hrs;
		int check = (int)Math.floor(Math.random() * 10) % 3;
      switch (check){

      case IS_FULL_TIME:
  	    	System.out.println("Employee is Present Full Time");
       	work_Hrs = 8;
         	break;

      case IS_PART_TIME:
      	System.out.println("Employee is Present Part Time");
         work_Hrs = 4;
            break;

      default:
      	System.out.println("Employee is Absent");
         work_Hrs = 0;
      }
		return work_Hrs;
	}

	public int attendance(int wage_Per_Hr, int work_Hrs, int total_Work_Hrs){
   	total_Work_Hrs = total_Work_Hrs + work_Hrs;
      int emp_Wage = wage_Per_Hr * work_Hrs;
      total_Wage = total_Wage + emp_Wage;
      System.out.println("Total Wage is "+total_Wage);
      return total_Work_Hrs;
   }

	public static void main(String[] args){
   	int working_Days = 0;
      int total_Work_Hrs = 0;
      empWage emp = new empWage();
      while(working_Days < 20 && total_Work_Hrs < 80){
         int workHr = emp.getWorkHrs();
         total_Work_Hrs = emp.attendance(20,workHr,total_Work_Hrs);
         working_Days++;
      }
      System.out.println("Total Working Hrs is "+total_Work_Hrs);
   }
}
