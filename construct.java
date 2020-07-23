package logger;
import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger; 
public class Construction
{
	int standard,Area;
	Construction(int std,int area)
	{
		standard=std;
		Area=area;
	}
	String calculateCost()
	{
		if(standard==1)
			return("Construction Cost: "+Area*12000);
		else if(standard==2)
			return("Construction Cost: "+Area*15000);
		else if(standard==3)
			return("Construction Cost:"+Area*18000);
		else if(standard==4)
			return("Construction Cost:"+Area*25000);
		else
			return("invalid");
	}
}
