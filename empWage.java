class empWage{

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	public int[] attendance(int wage_Per_Hr){
		int work_Hrs;
		int total_Wage = 0;
		int working_Days = 0;
		int total_Work_Hrs = 0;
		while (working_Days < 20 && total_Work_Hrs < 80){
			working_Days++;
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
			total_Work_Hrs = total_Work_Hrs + work_Hrs;
			int emp_Wage = wage_Per_Hr * work_Hrs;
			total_Wage = total_Wage + emp_Wage;
		}
		int[] result = new int[2];
		result[0] = total_Wage;
		result[1] = total_Work_Hrs;
		return result;
	}

	public static void main(String[] args){
		empWage emp = new empWage();
		System.out.println("For Employee 1");
		int[] emp_Wage_1 = emp.attendance(20);
		System.out.println("Total Working Hrs is "+emp_Wage_1[1]);
		System.out.println("Employee_1 Total Wage is "+emp_Wage_1[0]);
		 System.out.println();
		System.out.println("For Employee 2");
		int[] emp_Wage_2 = emp.attendance(25);
		System.out.println("Total Working Hrs is "+emp_Wage_2[1]);
		System.out.println("Employee_2 Total Wage is "+emp_Wage_2[0]);
	}

}
