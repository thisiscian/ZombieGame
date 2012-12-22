package entity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)

public class StatisticsTest
{
	private	Statistics stats;
	double delta = 0.0001;
	@Test	
	public void initialiseStatistics()
	{
		stats = new Statistics();
		org.junit.Assert.assertEquals("Strength did not set correctly", 1.0, stats.getStr(), delta);
		org.junit.Assert.assertEquals("Perception did not set correctly", 1.0, stats.getPer(), delta);
		org.junit.Assert.assertEquals("Endurance did not set correctly", 1.0, stats.getEnd(), delta);
		org.junit.Assert.assertEquals("Charisma did not set correctly", 1.0, stats.getCha(), delta);
		org.junit.Assert.assertEquals("Intelligence did not set correctly", 1.0, stats.getInt(), delta);
		org.junit.Assert.assertEquals("Agility did not set correctly", 1.0, stats.getAgi(), delta);
		org.junit.Assert.assertEquals("Lucky did not set correctly", 1.0, stats.getLuc(), delta);
		org.junit.Assert.assertEquals("Fitness did not set correctly", 1.0, stats.getFit(), delta);
		org.junit.Assert.assertEquals("Max Health did not set correctly", 10.0, stats.getMaximumHealth(), delta);
		org.junit.Assert.assertEquals("Current Health did not set correctly", 10.0, stats.getCurrentHealth(), delta);
	}

	@Test
	public void settingValues()
	{
		stats = new Statistics();

		stats.setStr(2.0);
		org.junit.Assert.assertEquals("Strength did not modify correctly", 2.0, stats.getStr(), delta);
		stats.setPer(3.0);
		org.junit.Assert.assertEquals("Perception did not modify correctly", 3.0, stats.getPer(), delta);
		stats.setEnd(4.0);
		org.junit.Assert.assertEquals("Endurance did not modify correctly", 4.0, stats.getEnd(), delta);
		stats.setCha(5.0);
		org.junit.Assert.assertEquals("Charisma did not modify correctly", 5.0, stats.getCha(), delta);
		stats.setInt(6.0);
		org.junit.Assert.assertEquals("Intelligence did not modify correctly", 6.0, stats.getInt(), delta);
		stats.setAgi(7.0);
		org.junit.Assert.assertEquals("Agility did not modify correctly", 7.0, stats.getAgi(), delta);
		stats.setLuc(8.0);
		org.junit.Assert.assertEquals("Lucky did not modify correctly", 8.0, stats.getLuc(), delta);
		stats.setFit(9.0);
		org.junit.Assert.assertEquals("Fitness did not modify correctly", 9.0, stats.getFit(), delta);
		stats.setMaximumHealth(30.0);
		org.junit.Assert.assertEquals("Max Health did not modify correctly", 30.0, stats.getMaximumHealth(), delta);
		stats.setCurrentHealth(20.0);
		org.junit.Assert.assertEquals("Current Health did not modify correctly", 20.0, stats.getCurrentHealth(), delta);
	}
	
	@Test
	public void addHealth()
	{
		stats = new Statistics();
	
		stats.setMaximumHealth(30.0);
		stats.setCurrentHealth(15.0);
		stats.addHealth(5.0);
		org.junit.Assert.assertEquals("Adding health did not work correctly", 20.0, stats.getCurrentHealth(), delta);
		stats.addHealth(35.0); 
		org.junit.Assert.assertEquals("Health went over the maximum", stats.getMaximumHealth(), stats.getCurrentHealth(), delta);
	}

	@Test
	public void takeHealth()
	{
		stats = new Statistics();
	
		stats.setMaximumHealth(30.0);
		stats.setCurrentHealth(15.0);
		stats.takeHealth(5.0);
		org.junit.Assert.assertEquals("Taking health did not work correctly", 10.0, stats.getCurrentHealth(), delta);
		stats.takeHealth(35.0); 
		org.junit.Assert.assertEquals("Health went below 0", 0, stats.getCurrentHealth(), delta);
	}
	
	@Test
	public void getMaxStat()
	{
		stats = new Statistics();
			
		stats.setLuc(90.0);
		org.junit.Assert.assertEquals("Did not get correct MaxStat", 6, stats.getMaxStat());
	}

	@Test
	public void setBossStat()
	{
		stats = new Statistics();
			
		stats.setLuc(90.0);
		stats.setStr(70.0);
		stats.setBossStat();
		org.junit.Assert.assertEquals("Did not get correct MaxStat", 255.0, stats.getLuc(), delta);
		stats.setBossStat();
		org.junit.Assert.assertEquals("Did not get correct MaxStat", 255.0, stats.getStr(), delta);
	}
}
