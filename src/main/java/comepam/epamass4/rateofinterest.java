package comepam.epamass4;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class rateofinterest
{
	private static final Logger LOGGER=LogManager.getLogger(rateofinterest.class);
	double simpleInterest(double principalamount,int rateofintrest,int timeperiod) {
	LOGGER.info("Calculation of SimpleInterest");
	    return (principalamount*rateofintrest*timeperiod)/100;
	    }
	    double compoundInterest(double principalamount,int rateofintrest,int timeperiod,int numOftimes) {
	    LOGGER.info("Calculation of CompoundInterest");
	        double compoundInterest = principalamount * Math.pow(1 + (rateofintrest /numOftimes), numOftimes * timeperiod);
	        double cinterest = compoundInterest - principalamount;
	        return cinterest;
	    }
	    public static void main(String args[]) {
	    rateofinterest ap1=new rateofinterest();
	    LOGGER.info(ap1.simpleInterest(1000, 5, 5));
	    LOGGER.info(ap1.compoundInterest(1000, 4, 2, 1));
	    }
}
