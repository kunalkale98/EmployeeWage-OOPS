class EmpWage{

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	private final String company;
	private final int wagePerHr;
	private final int maxWorkDays;
	private final int maxWorkHrs;
	private int totalWage;

	public EmpWage(String company, int wagePerHr, int maxWorkDays, int maxWorkHrs){
		this.company = company;
		this.wagePerHr = wagePerHr;
		this.maxWorkDays = maxWorkDays;
		this.maxWorkHrs = maxWorkHrs;
	}

	public void computeWage(){
		int workHrs = 0;
		int workingDays = 0;
		int totalWorkHrs = 0;
		while (workingDays < maxWorkDays && totalWorkHrs < maxWorkHrs){
			workingDays++;
			int check = (int)Math.floor(Math.random() * 10) % 3;
			switch (check){

			case IS_FULL_TIME:
				workHrs = 8;
				break;

			case IS_PART_TIME:
				workHrs = 4;
				break;

			default:
				workHrs = 0;
			}
			totalWorkHrs = totalWorkHrs + workHrs;
			System.out.println("Day "+workingDays+": Work hours "+workHrs);
		}
		totalWage = totalWorkHrs * wagePerHr;
	}

	@Override
	public String toString(){
		return "For Company "+company+" Total Emp Wage is "+totalWage;
	}

	public static void main(String[] args){
		EmpWage dmart = new EmpWage("Dmart",20,4,24);
		dmart.computeWage();
		System.out.println(dmart);
		EmpWage rmart = new EmpWage("Rmart",15,5,30);
		rmart.computeWage();
		System.out.println(rmart);
	}
}
