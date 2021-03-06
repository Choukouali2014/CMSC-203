

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * @author Frank Choukouali
 *
 */
public class ManagementCompanyTestSTUDENT {
	
	ManagementCompany managementCompany; 
	Property plot_1, plot_2, plot_3, plot_4, plot_5, plot_6;
	@Before
	public void setUp() throws Exception {
		//student create a management company
		managementCompany = new ManagementCompany("Frank Cooperate", "1234679",5);
		//student add three properties, with plots, to mgmt co
		plot_1 = new Property ("RoofTop", "Bethesda", 1500, "Jo-Wilfried",1,1,3,3);
		plot_2 = new Property ("Penthouse", "River Road", 2600.5, "Alexana Maelys",6,1,2,2);
		plot_3 = new Property ("No Name", "FrienshipHeight", 1000, "Theresine",3,5,2,2);
		managementCompany.addProperty(plot_1);
		managementCompany.addProperty(plot_2);
		managementCompany.addProperty(plot_3);
		
	}

	@After
	public void tearDown() {
		//student set mgmt co to null  
		managementCompany=null;
		plot_1=plot_2=plot_3=plot_4=plot_5=plot_6=null;
	}

	@Test
	public void testAddPropertyDefaultPlot() {
		//student should add property with 4 args & default plot (0,0,1,1)
		plot_4 = new Property ("WestWood", "Bethesda", 1500, "Kammo");
		//student should add property with 8 args
		plot_5 = new Property ("Mc Donalds", "Betville", 900, "Guy Arnold",1,5,2,3);
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1	
		plot_6 = new Property ("Gas station", "Hyssaville", 1000, "Mayo Ornella",6,5,3,2);
		assertEquals(managementCompany.addProperty(plot_4),3,0);
		assertEquals(managementCompany.addProperty(plot_5),4,0);
		assertEquals(managementCompany.addProperty(plot_6),-1,0); 
	}
 
	@Test
	public void testMaxRentProp() {
		
		assertEquals(managementCompany.maxRentProp(),2600.5,0);
	}

	@Test
	public void testTotalRent() {
		//student should test if totalRent returns the total rent of properties
		assertEquals(managementCompany.totalRent(),5100.5,0);
	}

 }