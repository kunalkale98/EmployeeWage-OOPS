class empWage{

	public static final int IS_FULL_TIME = 1;

	public void attendance(int wage_Per_Hr, int full_Day_Hrs){
		int check = (int)Math.floor(Math.random() * 10) % 2;

		if(check==IS_FULL_TIME){
			System.out.println("Employee is Present");
			int emp_Wage = wage_Per_Hr * full_Day_Hrs;
			System.out.println("Daily Employee Wage is "+emp_Wage);
		}
		else{
			System.out.println("Employee is Absent");
		}
	}



	public static void main(String[] args){
		empWage emp = new empWage();
		emp.attendance(20,8);
	}
}
