public class EmpWageUC6 {

   public static void main(String[] args) {
		final int IS_FULL_TIME=1;
      final int IS_PART_TIME=2;
      int EMP_RATE_PER_HOUR=20;
      int empHours=0;
      int empWage=0;
		int workingDays=5;
		int monthlyWage=0;
		int maxHours=100;
		int hoursCompleted=0;
		while(hoursCompleted<maxHours) {
      	int empCheck= (int) Math.floor(Math.random()*10)%3;
      	switch (empCheck) {
				case IS_FULL_TIME:
            	empHours=8;
					break;
      		case IS_PART_TIME:
            	empHours=4;
					break;
         	default:
            	empHours=0;
           	}
			hoursCompleted+=empHours;
			}
			System.out.println(hoursCompleted);
			monthlyWage=hoursCompleted*EMP_RATE_PER_HOUR;
      	System.out.println("monthly wage:"+monthlyWage);
       }
}
