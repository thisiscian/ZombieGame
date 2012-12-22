package monster;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)

public class MonsterGeneratorTest
{
	MonsterGenerator pool;
	MonsterEntity zombie;
	MonsterEntity boss;
	double delta = 0.000001;

	@Test
	public void setPoolSize()
	{
		pool = new MonsterGenerator(100);
		int size = pool.length();
		org.junit.Assert.assertEquals("Poolsize did not set correctly", 100, pool.length());
	}

	@Test
	public void testReturnRandomMonster()
	{
		pool = new MonsterGenerator(100);
		zombie = pool.getMonster();
		org.junit.Assert.assertNotNull("Did not return random monster", zombie);
	}
	
	@Test
	public void testReturnSpecificMonster()
	{
		pool = new MonsterGenerator(100);
		zombie = pool.getMonster(10);
		org.junit.Assert.assertNotNull("Did not return any monster", zombie);
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testFailSpecificMonsterLargerThanPoolSize()
	{
		pool = new MonsterGenerator(100);
		zombie = pool.getMonster(1001);
	}

	@Test
	public void testReturnBoss()
	{
		pool = new MonsterGenerator(100);
		boss = pool.getBossMonster();
		org.junit.Assert.assertNotNull("Did not return boss monster", boss);
	}

	@Test
	public void testBossStatistics()
	{
		pool = new MonsterGenerator(100);
		boss = pool.getBossMonster();
		org.junit.Assert.assertEquals("Boss Stat did not set correctly", 255, boss.stats.getStat(boss.stats.getMaxStat()), delta);
	}

	@Test
	public void testGenerateNewMonster()
	{
		pool = new MonsterGenerator(100);
		zombie = pool.generateMonster();
	}

	@Test
	public void testWorstMonster()
	{
		pool = new MonsterGenerator(100);
		pool = new MonsterGenerator(100);
	}
}
