package jpetstore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilittyclass.utility2;

public class JpetstoreTestingpage extends JpetstoreBaseclass {
  
    
    

    @Test (priority=1)
    public void jpetstoretestingpage() throws Exception {
        String xl = "C:\\New folder\\Book2.xlsx";
        String sheet = "Sheet1";

        
        int rowCount = utility2.getRowCount(xl, sheet);

        JpetstoreLoginpage ob= new  JpetstoreLoginpage(driver);
       

        for (int i = 1; i <= rowCount; i++) {
            String username = utility2.getCellValue(xl, sheet, i, 0);
            System.out.println("username--->" + username);
            String pwd = utility2.getCellValue(xl, sheet, i, 1);
            System.out.println("password--->" + pwd);
            

          
            ob.test(username, pwd);
            
            
            ob.submitloginbutton();
          
            Thread.sleep(3000);
            
          //  driver.navigate().refresh();
            
            
        }
    }
    
    
    
    
}
