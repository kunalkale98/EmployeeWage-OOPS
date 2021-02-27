class EmpWage{

	public static String company;
	public static int wagePerHr;
	public static int maxWorkDays;
	public static int maxWorkHrs;
	private int totalWage;

	public EmpWage(String company, int wagePerHr, int maxWorkDays, int maxWorkHrs){
		this.company = company;
		this.wagePerHr = wagePerHr;
		this.maxWorkDays = maxWorkDays;
		this.maxWorkHrs = maxWorkHrs;
	}

	public void toSetEmpWage(int totalWage){
		this.totalWage = totalWage;
	}

	@Override
   public String toString(){
      return "For Company "+company+" Total Emp Wage is "+totalWage;
   }
}

class EmpWageBuilder{
	public static final int IS_FULL_TIME = 1;
   public static final int IS_PART_TIME = 2;
	private EmpWage[] companyWageArray;
	private int numOfCompany = 0;

	public EmpWageBuilder(){
		companyWageArray = new EmpWage[5];
	}

	private void addEmpWage(String company, int wagePerHr, int maxWorkDays, int maxWorkHrs){
		companyWageArray[numOfCompany] = new EmpWage(company,wagePerHr,maxWorkDays,maxWorkHrs);
		numOfCompany++;
	}

	private void computeWage(){
		for(int i=0; i<numOfCompany; i++){
			companyWageArray[i].toSetEmpWage(this.computeWage(companyWageArray[i]));
			System.out.println(companyWageArray[i]);
		}
	}

	private int computeWage(EmpWage empwage){
		int workHrs = 0;
		int workingDays = 0;
		int totalWorkHrs = 0;
		int totalWage;
		while (workingDays < empwage.maxWorkDays && totalWorkHrs < empwage.maxWorkHrs){
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
		return totalWage = totalWorkHrs * empwage.wagePerHr;
	}

	public static void main(String[] args){
		EmpWageBuilder empwagebuilder = new EmpWageBuilder();
		empwagebuilder.addEmpWage("Dmart",20,4,24);
		empwagebuilder.addEmpWage("Rmart",15,5,30);
		empwagebuilder.computeWage();
	}
}
