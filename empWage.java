class empWage{

	public static final int isPresent = 1;

	public void attendance(){
		int check = (int)Math.floor((Math.random()*10)%2);
		if(check == isPresent){
			System.out.println("Employee is Present");
		}
		else{
			System.out.println("Employee is Absent");
		}
	}


	public static void main(String[] args){
		empWage emp = new empWage();
		emp.attendance();
	}
}
