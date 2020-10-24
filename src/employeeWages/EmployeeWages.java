package employeeWages;


public class EmployeeWages {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	private final String company;
	private final int empRateHours;
	private final int numofWorkDays;
	private final int maxHoursperMonth;

	public EmployeeWages(String company, int empRateHours, int numofWorkDays, int maxHoursperMonth) {
		this.company = company;
		this.empRateHours = empRateHours;
		this.maxHoursperMonth = maxHoursperMonth;
		this.numofWorkDays = numofWorkDays;
	}

	private int calEmpWage() {
		int empHrs = 0, totalEmpHours = 0, totalWorkDays = 0;

		while (totalEmpHours <= maxHoursperMonth && totalWorkDays < numofWorkDays) {
			totalWorkDays++;
			int empCheck = (int) (Math.random() * 10 % 3);
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHours += empHrs;
			System.out.println("Day: " + totalWorkDays + " Emp Hrs: " + empHrs);
		}
		System.out.println("Total Employee work Hours: " + totalEmpHours);
		return totalEmpHours * empRateHours;
	}

	public static void main(String[] args) {
		System.out.println("*WELCOME TO EMPLOYEE WAGE ");
		EmployeeWages infosys = new EmployeeWages("infosys", 50, 50, 80);
		EmployeeWages google = new EmployeeWages("google", 40, 40, 100);
		System.out.println("Total Employee Wage for " + infosys.company + ": " + infosys.calEmpWage());
		System.out.println("Total Employee Wage for " + google.company + ": " + google.calEmpWage());
	}
}
