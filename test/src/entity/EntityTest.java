package entity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)

public class EntityTest
{
	Entity man;
	Entity men[];
	double delta = 0.0001;

	@Test
	public void initialiseEntity()
	{
		man = new Entity();
		org.junit.Assert.assertEquals("X Co-ord initialised incorrectly", 0.0, man.getHorizontalPosition(), delta);
		org.junit.Assert.assertEquals("Y Co-ord initialised incorrectly", 0.0, man.getVerticalPosition(), delta);
		org.junit.Assert.assertNotNull("Entity did not initialise with statistics", man.stats);
	}
	@Test
	public void initialiseEntities()
	{
		men = new Entity[2];
		for(int i=0; i < men.length; i++)
		{
			men[i] = new Entity();
		}
		org.junit.Assert.assertEquals("X Co-ord initialised incorrectly for first entity", 0.0, men[0].getHorizontalPosition(), delta);
		org.junit.Assert.assertEquals("Y Co-ord initialised incorrectly for first entity", 0.0, men[0].getVerticalPosition(), delta);
		org.junit.Assert.assertNotNull("Entity did not initialise with statistics for first entity", men[0].stats);

		org.junit.Assert.assertEquals("X Co-ord initialised incorrectly for first entity", 0.0, men[1].getHorizontalPosition(), delta);
		org.junit.Assert.assertEquals("Y Co-ord initialised incorrectly for first entity", 0.0, men[1].getVerticalPosition(), delta);
		org.junit.Assert.assertNotNull("Entity did not initialise with statistics for first entity", men[1].stats);
	}

}
