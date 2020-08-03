public class EmpWageUC5 {
	   public static final int IS_FULL_TIME=1;
      public static final int IS_PART_TIME=2;
      public static final int EMP_RATE_PER_HOUR=20;

   public static void main(String[] args) {
      int empHours=0;
      int empWage=0;
		int monthlyWage=0;
		for(int i=1;i<=5;i++) {
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
      	empWage=empHours*EMP_RATE_PER_HOUR;
			System.out.println("empWage:"+empWage);
			monthlyWage+=empWage;
			}
      	System.out.println("monthly wage:"+monthlyWage);
       }
}
