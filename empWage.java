class empWage{

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	private final String company;
	private final int wagePerHr;
	private final int maxWorkDays;
	private final int maxWorkHrs;

	public empWage(String company, int wagePerHr, int maxWorkDays, int maxWorkHrs){
		this.company = company;
		this.wagePerHr = wagePerHr;
		this.maxWorkDays = maxWorkDays;
		this.maxWorkHrs = maxWorkHrs;
	}

	public void attendance(String company, int wage_Per_Hr, int maxWorkDays, int maxWorkHrs){
		int work_Hrs;
		int total_Wage = 0;
		int working_Days = 0;
		int total_Work_Hrs = 0;
		while (working_Days < maxWorkDays && total_Work_Hrs < maxWorkHrs){
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
		System.out.println("Total work hours of the employee in "+company+" is "+total_Work_Hrs);
		System.out.println("For "+company+" the employee has Total Wage "+total_Wage);
	}

	public static void main(String[] args){
		empWage c1 = new empWage("Company-1",20,4,24);
		c1.attendance(c1.company,c1.wagePerHr,c1.maxWorkDays,c1.maxWorkHrs);
		empWage c2 = new empWage("Company-2",15,5,30);
      c2.attendance(c2.company,c2.wagePerHr,c2.maxWorkDays,c2.maxWorkHrs);
	}
}
