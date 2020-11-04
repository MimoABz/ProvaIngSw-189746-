package ProvaINGSW189746.ProvaLab;

import junit.framework.TestCase;
import org.junit.*;


public class MyListUtilTest extends TestCase {
	private static MyListUtil app;

	
	@Before
	public void prepare() {
		 app= new MyListUtil();
		 
	}
	@test
	public void testordina() {
		int[] arr= {1,6,3};
		int [] arrOrdCrescente= {1,3,6};
		int [] arrOrdDecrescente= {6,3,1};
		assertEquals(arrOrdCrescente, MyListUtil.ordina(arr, true));
		assertEquals(arrOrdDecrescente, MyListUtil.ordina(arr, false));

	}
		
	
}
