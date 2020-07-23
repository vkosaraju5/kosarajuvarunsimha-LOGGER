package logger;
import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger; 
public class CostOfConstructionLogger {
	static
	{
		Logger logger=Logger.getLogger(CostOfConstructionLogger.class.getName());
		Scanner sc=new Scanner(System.in);
		int stndrd,area;
		String message;
		logger.info("Enter Material Standard\n1.standard\n2.above standard\n3.high standard\n4.high standard and fully automated home");
		stndrd=sc.nextInt();
		if(stndrd==1||stndrd==2||stndrd==3||stndrd==4)
		{
			logger.info("Enter the total area of the house in sq.ft");
			area=sc.nextInt();
			Construction con=new Construction(stndrd,area);
			message=con.calculateCost();
			logger.info(message);
		}
		else
		{
			logger.info("invalid selection");
			java.lang.System.exit(0); 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}