import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HolidayBonusSTUDENTTest {
	private double[][] dataSet1 = {{3,4,5},{6,7},{8,9,10}};
	private double[][] dataSet2 = {{2,4,7,9},{5},{1,3,8},{2,6,7,11}};
	@Before
	public void setUp() throws Exception {
	}
	
	@After
	public void tearDown() throws Exception {
	}


	/**
	 * Test calculateHolidayBonus method with a high of 5000, low of 1000 and 2000 as other
	 */

	@Test
	public void testCalculateHolidayBonusSTUDENTA() {
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(dataSet1,5000,1000,2000);
			assertEquals(3000.0,result[0],.001);
			assertEquals(4000.0,result[1],.001);
			assertEquals(15000.0,result[2],.001);
			
			result = HolidayBonus.calculateHolidayBonus(dataSet2,5000,1000,2000);
			assertEquals(6000.0,result[0],.001);
			assertEquals(5000.0,result[1],.001);
			assertEquals(7000.0,result[2],.001);
			assertEquals(13000.0,result[3],.001);
			
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		} 
	}
	

	/**
	 * Test calculateHolidayBonus method with a high of 1000, low of 250 and 500 as other
	 */

	@Test
	public void testCalculateHolidayBonusSTUDENTB() {
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(dataSet1,1000, 250, 500);
			assertEquals(750.0, result[0], .001);
			assertEquals(1000.0,result[1],.001);
			assertEquals(3000.0,result[2],.001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		} 	
	}

	/**
	 * Test calculateTotalHolidayBonus method with a high of 5000, low of 1000 and 2000 as other
	 */
	@Test
	public void testCalculateTotalHolidayBonusA() {
		assertEquals(22000.0, HolidayBonus.calculateTotalHolidayBonus(dataSet1, 5000, 1000, 2000), .001);
	}
	
	/** 
	 * Test calculateTotalHolidayBonus method with a high of 1000, low of 250 and 500 as other
	 */
	@Test
	public void testCalculateTotalHolidayBonusB() {
		assertEquals(4750.0, HolidayBonus.calculateTotalHolidayBonus(dataSet1, 1000, 250, 500), .001);
	}

}