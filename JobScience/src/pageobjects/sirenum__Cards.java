package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Sirenum__ Cards"                                
               , summary=""
               , page="Cards"
               , namespacePrefix="sirenum"
               , object=""
               , connection="AndrewMoran"
     )             
public class sirenum__Cards {

	@LinkType()
	@FindBy(xpath = "//*[@id=\"sirenumNavigation\"]//a[2]")
	public WebElement shiftScheduling;

	
	
}
