package comepam.epamass4;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class constructioncost
{
		private static final Logger LOGGER=LogManager.getLogger(constructioncost.class);
		int cost(String standardofmaterial,int totalarea,char automated) {

		if(standardofmaterial=="standard"&& automated=='N') {
		LOGGER.info("If standard of material is 'standard' and not an automated house");
		return totalarea*1200;
		}
		else if(standardofmaterial=="above standard"&& automated=='N') {
		LOGGER.info("If standard of material is 'above standard' and not an automated house");
		return totalarea*1500;
		}
		else if(standardofmaterial=="high standard" && automated=='N') {
		LOGGER.info("If standard of material is 'high standard' and is not an automated house");
		return totalarea*1800;
		}
		else {
		LOGGER.info("If standard of material is an automated house");
		return totalarea*2500;
		}

		}
		    public static void main( String[] args )
		    {
		        //System.out.println( "Hello World!" );
		    constructioncost a1=new constructioncost();
		    LOGGER.info(a1.cost("high standard", 150, 'N'));
		   
		   
		    }
}
