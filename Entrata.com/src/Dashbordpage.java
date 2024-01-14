
public class Dashbordpage {

	public static void main(String[] args) {
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.support.FindBy;
		import org.openqa.selenium.support.PageFactory;

		import com.qa.testBase.TestBase;

		public class DashboardPage extends TestBase{
			
			public DashboardPage()
			{
				PageFactory.initElements(driver, this);
			}

			@FindBy(xpath="//input[@class='form-control']")
			private WebElement search_box;
			
			public void enterCompanyName(String company_name)
			{
				search_box.sendKeys(company_name);
			}
			
			@FindBy(linkText="https://www.entrata.com/products/marketing-and-leasing")
			private WebElement marketing-and-leasing;
			
			public void clickOnCompanyNameentrata()
			{
				click_company_name_wipro.click();
			}
			
			@FindBy(partialLinkText="marketing-and-leasing")
			private WebElement marketing-and-leasing;
			
			public void clickOnmarketing-and-leasing()
			{
				marketing-and-leasings.click();
			}
		}


	}

}
