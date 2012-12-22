package entity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)

public class PositionTest
{
	Position pos;
	double delta;

	@Test
	public void initialisePosition()
	{
		pos = new Position(0.0, 1.0);
		org.junit.Assert.assertEquals("X Coord did not initialise correctly", 0.0, pos.getHorizontalPosition(), delta);
		org.junit.Assert.assertEquals("Y Coord did not initialise correctly", 1.0, pos.getVerticalPosition(), delta);
	}
	
	@Test
	public void setPosition()
	{
		pos = new Position(0.0, 1.0);
		pos.setHorizontalPosition(2.0);
		pos.setVerticalPosition(3.0);
		org.junit.Assert.assertEquals("Poolsize did not set correctly", 2.0, pos.getHorizontalPosition(), delta);
		org.junit.Assert.assertEquals("Poolsize did not set correctly", 3.0, pos.getVerticalPosition(), delta);
	}
}
