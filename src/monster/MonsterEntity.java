package monster;

import entity.*;

public class MonsterEntity extends Entity
{
	private String name;
	private double strengthWeight;
	private double perceptionWeight;
	private double enduranceWeight;
	private double charismaWeight;
	private double intelligenceWeight;
	private double agilityWeight;
	private double luckWeight;
	private double fitnessWeight;
	private double maximumHealthWeight;
	private double currentHealthWeight;
	private double timeBornWeight;

 	public MonsterEntity()
	{
		name = "basic zombie";
		stats = new Statistics();
	}
	public double Fitness()
	{
		strengthWeight=1.0;
		perceptionWeight=1.0;
		enduranceWeight=1.0;
		charismaWeight=1.0;
		intelligenceWeight=1.0;
		agilityWeight=1.0;
		luckWeight=1.0;
		fitnessWeight=1.0;
		maximumHealthWeight=1.0;
		currentHealthWeight=1.0;
		timeBornWeight=1.0;
		
		return 0;
	}
}
