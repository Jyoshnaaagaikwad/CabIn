import org.example.Invoice;
import org.junit.Test;

public class InvoiceTest
{
	Invoice i=new Invoice();
	
	@Test
	public void Testfair()
	{
		double distance=2;
		int time=5;
		double result=i.calcualtorFare(2, 5);
	}
	@Test
	public void TestRide()
	{
	double result1=i.InvoiceSummary(12, 4);	
	}
}
