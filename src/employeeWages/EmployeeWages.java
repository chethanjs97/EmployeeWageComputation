package employeeWages;


public class EmployeeWages {
	
		public static final int IS_FULL_TIME = 1;
		public static final int IS_PART_TIME = 2;

		private final int empRatePerHour;
		private final int numOfWorkingDays;
		private final int maxhoursPerMonth;
		private final String company;
		private int totalEmpWage;
		public EmployeeWages(String company, int empRatePerHour, int numOfWorkingDays, int maxhoursPerMonth)
		{
			this.company=company;
			this.empRatePerHour=empRatePerHour;
			this.numOfWorkingDays=numOfWorkingDays;
			this.maxhoursPerMonth=maxhoursPerMonth;
		}
		public void computeEmpWage() {
			int emphrs = 0, totalworkingdays = 0, totalEmphrs = 0;
			while (totalEmphrs < maxhoursPerMonth && totalworkingdays < numOfWorkingDays) {
				totalworkingdays++;
				int random = (int) Math.floor(Math.random() * 10) % 3;
				switch (random) {

				case 1:
					emphrs = 8;
					break;

				case 2:
					emphrs = 4;
					break;

				default:
					emphrs = 0;// not present

				}
				totalEmphrs += emphrs;
				System.out.println("days" +totalworkingdays+ "Emphrs" +emphrs);
			}
			totalEmpWage = totalEmphrs * empRatePerHour;
			
		}
		//@override
		public String toString(){
		return "Total Emp wages for company " +company+ "is" +totalEmpWage;
		}

		public static void main(String[] args) {
			EmployeeWages info = new EmployeeWages("infosys" ,20,2,10);
			EmployeeWages cogni = new EmployeeWages("cognizath" ,40,4,20);
			info.computeEmpWage();
			System.out.println(info);
			cogni.computeEmpWage();
			System.out.println(cogni);
			
		}
}