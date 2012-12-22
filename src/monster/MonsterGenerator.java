package monster;

import java.util.Random;
public class MonsterGenerator
{
	Random randomNumber = new Random();
	private MonsterEntity[] MonsterPool;
	public MonsterGenerator(int poolsize)
	{
		MonsterPool = new MonsterEntity[poolsize];
		for(int i=0; i < poolsize; ++i)
		{
			MonsterPool[i] = new MonsterEntity();
		}
	}

	public int length()
	{
		return MonsterPool.length;
	}

	public MonsterEntity getMonster(int number) throws ArrayIndexOutOfBoundsException
	{
		if(number >= MonsterPool.length)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		return MonsterPool[number];
	}

	public MonsterEntity getMonster()
	{
		return MonsterPool[randomNumber.nextInt(length())];
	}
	
	public MonsterEntity getBossMonster()
	{
		MonsterEntity boss = MonsterPool[randomNumber.nextInt(length())];
		boss.stats.setBossStat();
		return boss;		
	}
	private MonsterEntity breedMonster()
	{
		MonsterEntity zombie = new MonsterEntity();
		return zombie;
	}
	public MonsterEntity generateMonster()
	{
		return breedMonster();
	}
}
