package entity;
public class StatisticsTest extends junit.framework.TestCase
{

	private	Statistics stats;
	
	public void testInitialiseStatistics()
	{
		stats = new Statistics();
		boolean failed = false;
		if(stats.getStr() != 1.0){failed = true;}
		if(stats.getPer() != 1.0){failed = true;}
		if(stats.getEnd() != 1.0){failed = true;}
		if(stats.getCha() != 1.0){failed = true;}
		if(stats.getInt() != 1.0){failed = true;}
		if(stats.getAgi() != 1.0){failed = true;}
		if(stats.getLuc() != 1.0){failed = true;}
		if(stats.getFit() != 1.0){failed = true;}
		if(stats.getMaximumHealth() != 10.0){failed = true;}
		if(stats.getCurrentHealth() != 10.0){failed = true;}
		
		if(failed){fail("values were incorrectly initialised");}
	}
	
	public void testSettingValues()
	{
		stats = new Statistics();
		boolean failed = false;
		stats.setStr(2.0);
		stats.setPer(3.0);
		stats.setEnd(4.0);
		stats.setCha(5.0);
		stats.setInt(6.0);
		stats.setAgi(7.0);
		stats.setLuc(8.0);
		stats.setFit(9.0);
		stats.setMaximumHealth(30.0);
		stats.setCurrentHealth(20.0);

		if(stats.getStr() != 2.0){failed = true;}
		if(stats.getPer() != 3.0){failed = true;}
		if(stats.getEnd() != 4.0){failed = true;}
		if(stats.getCha() != 5.0){failed = true;}
		if(stats.getInt() != 6.0){failed = true;}
		if(stats.getAgi() != 7.0){failed = true;}
		if(stats.getLuc() != 8.0){failed = true;}
		if(stats.getFit() != 9.0){failed = true;}
		if(stats.getMaximumHealth() != 30.0){failed = true;}
		if(stats.getCurrentHealth() != 20.0){failed = true;}

		if(failed){fail("values are setting incorrectly, or setXXX and getXXX are mismatched");}
	}
	
	public void testAddHealth()
	{
		stats = new Statistics();
		boolean failed = false;
	
		stats.setMaximumHealth(30.0);
		stats.setCurrentHealth(15.0);
		stats.addHealth(5.0);
		if(stats.getCurrentHealth() != 20.0){fail("did not add correct amount of health");}
		stats.addHealth(35.0); 
		if(stats.getCurrentHealth() != stats.getMaximumHealth()){fail("health is above maximum");}
	}
	public void testTakeHealth()
	{
		stats = new Statistics();
		boolean failed = false;
	
		stats.setMaximumHealth(30.0);
		stats.setCurrentHealth(15.0);
		stats.takeHealth(5.0);
		if(stats.getCurrentHealth() != 10.0){fail("did not take correct amount of health");}
		stats.takeHealth(35.0); 
		if(stats.getCurrentHealth() != 0){fail("health is below 0");}
	}
}
