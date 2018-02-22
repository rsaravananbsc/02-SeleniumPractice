package _TestNG_ProductsUsers;

import org.testng.annotations.Test;
import org.testng.Reporter;

public class Product extends BaseTest {

	@Test(groups={"USER","SMOKETEST"})
	public static void CreateProduct()
	{
		Reporter.log("Product Created",true);
	}
	
	@Test(groups= {"USER","NEGATIVETEST"})
	public static void DeleteProduct()
	{
		Reporter.log("Product Deleted",true);
	}
}
