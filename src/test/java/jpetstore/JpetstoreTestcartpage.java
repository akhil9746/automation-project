package jpetstore;

import org.testng.annotations.Test;

public class JpetstoreTestcartpage  extends JpetstoreBaseclass{
	
	
	@Test 
    public void jpetstoretestcartpage() throws Exception {
        
		JpetstoreCartpage ob= new JpetstoreCartpage(driver);
		
	
	ob.dropdownmethord();
	
	ob.details("Akhilsanthosh", "pss");
	
	ob.addresss();
ob.ending();
	}}
