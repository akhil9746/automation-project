package jpetstore;

import java.io.IOException;
import java.net.HttpURLConnection;

import org.testng.annotations.Test;

public class Jpetstoretestinghomepage extends JpetstoreBaseclass {

	@Test
	public void jpetstoretestinghomepage() throws IOException
	{
		Jpetstorehomepage ob= new Jpetstorehomepage(driver);
		
      ob.tittle();
      ob.takescreenshot();
		ob.getlinkcount();
	ob.verifylogo();
	
			ob.searching("fish");
			ob.click();
	}

}
