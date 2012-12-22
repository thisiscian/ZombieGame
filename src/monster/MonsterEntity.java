package monster;

import entity.*;

public class MonsterEntity extends Entity
{
	private String name;
 	public MonsterEntity()
	{
		name = "basic zombie";
		stats = new Statistics();
	}
}
