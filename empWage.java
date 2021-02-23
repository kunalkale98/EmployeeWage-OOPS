class empWage{

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	public void attendance(int wage_Per_Hr, int full_Day_Hrs, int part_Time_Hrs){
		int check = (int)Math.floor(Math.random() * 10) % 3;
		if(check==IS_FULL_TIME){
			System.out.println("Employee is Present Full Time");
			int emp_Wage = wage_Per_Hr * full_Day_Hrs;
			System.out.println("Full Time Employee Wage is "+emp_Wage);
		}
		else if(check==IS_PART_TIME){
			System.out.println("Employee is Part Time");
			int emp_Wage = wage_Per_Hr * part_Time_Hrs;
			System.out.println("Part Time Employee Wage is "+emp_Wage);
		}
		else{
			System.out.println("Employee is Absent");
		}
	}

	public static void main(String[] args){
		empWage emp = new empWage();
		emp.attendance(20,8,4);
	}

}
