import java.util.*;
import java.util.logging.Logger; 

class Computation {
	double principal_amount, rate_of_int, time_Period;
	
	Computation(double principal_amount, double rate_of_int, double time_Period){
		this.principal_amount= principal_amount;
		this.rate_of_int= rate_of_int;
		this.time_Period = time_Period;
	}
	
	double calCI() {
		return (principal_amount * (Math.pow(1 + rate_of_int / 100, time_Period)));
	}

	double CalSI() {
		return (principal_amount * rate_of_int * time_Period) / 100;
	}

}

public class Interest {

	static {
		Scanner sc = new Scanner(System.in);
		Logger logger=Logger.getLogger(Interest.class.getName());
		
		System.out.format("%s", "Enter the principle amount");
		double principal_amount = sc.nextDouble();
		System.out.format("%s", "Enter the rate of interest");
		double rate_of_int = sc.nextDouble();
		System.out.format("%s", "Enter the tenure");
		double time_Period = sc.nextDouble();
		
		Compute com = new Compute(principal_amount, rate_of_int, time_Period);
		
		logger.info("Select The appropriate option for Calculating 1)Simple Interest 2)Compound Interest");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			logger.info(String.valueOf(com.CalculateSI()));
			break;
		case 2:			
			logger.info(String.valueOf(com.calculateCI()));
			break;
		}
		sc.close();
	}

	public static void main(String[] args) {

	}

}