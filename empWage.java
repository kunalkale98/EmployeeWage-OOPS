class empWage{

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	public int attendance(int wage_Per_Hr){
		int check = (int)Math.floor(Math.random() * 10) % 3;
		int work_Hrs;
		switch (check){

		case 1:
			System.out.println("Employee is Present Full Time");
			work_Hrs = 8;
			break;

		case 2:
			System.out.println("Employee is Present Part Time");
			work_Hrs = 4;
			break;

		default:
			System.out.println("Employee is Absent");
			work_Hrs = 0;
		}

		int emp_Wage = wage_Per_Hr * work_Hrs;
		return emp_Wage;
      //System.out.println("Employee Wage is "+emp_Wage);
	}


	public static void main(String[] args){
		empWage emp = new empWage();
		int emp_Wage_1 = emp.attendance(20);
		System.out.println("Employee 1 Wage is "+emp_Wage_1);
		int emp_Wage_2 = emp.attendance(25);
		System.out.println("Employee 2 Wage is "+emp_Wage_2);
	}

}
