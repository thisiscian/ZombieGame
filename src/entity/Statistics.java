package entity;
public class Statistics
{
	private double stats[];
/*
	private double strength; => stats[0]
	private double perception; => stats[1]
	private double endurance; => stats[2]
	private double charisma; => stats[3]
	private double intelligence; => stats[4]
	private double agility; => stats[5]
	private double luck; => stats[6]
	private double fitness; => stats[7]
	private double maximumHealth; => stats[8]
	private double currentHealth; => stats[9]
	private double timeBorn; => stats[10]
*/

	public Statistics()
	{
		stats = new double[11];
		initialiseStatistics();
	}
	
	private void initialiseStatistics()
	{
		setStr(1.0);
		setPer(1.0);
		setEnd(1.0);
		setCha(1.0);
		setInt(1.0);
		setAgi(1.0);
		setLuc(1.0);
		setFit(1.0);
		setMaximumHealth(10.0);
		setCurrentHealth(10.0);
	}
	public void setStat(int n, double value)
	{
		stats[n] = value;
	}
	public void setStr(double value){ stats[0] = value;}
	public void setPer(double value){ stats[1] = value;}
	public void setEnd(double value){ stats[2] = value;}
	public void setCha(double value){ stats[3] = value;}
	public void setInt(double value){ stats[4] = value;}
	public void setAgi(double value){ stats[5] = value;}
	public void setLuc(double value){ stats[6] = value;}
	public void setFit(double value){ stats[7] = value;}
	
	public double getStat(int n)
	{
		return stats[n];
	}
	public double getStr(){ return stats[0];}
	public double getPer(){ return stats[1];}
	public double getEnd(){ return stats[2];}
	public double getCha(){ return stats[3];}
	public double getInt(){ return stats[4];}
	public double getAgi(){ return stats[5];}
	public double getLuc(){ return stats[6];}
	public double getFit(){ return stats[7];}

	public double getMaximumHealth(){ return stats[8];}
	public double getCurrentHealth(){ return stats[9];}
	public void setMaximumHealth(double value){stats[8] = value;}
	public void setCurrentHealth(double value){stats[9] = value;}
	public void takeHealth(double value)
	{
		if(value < 0){return;}
		setCurrentHealth(getCurrentHealth()-value<0 ? 0 : getCurrentHealth()-value);
	}
	public void addHealth(double value)
	{
		if(value < 0){return;}
		setCurrentHealth(getCurrentHealth()+value>getMaximumHealth() ? getMaximumHealth() : getCurrentHealth()+value);
	}
	public int getMaxStat()
	{
		int i;
		int max = 0;
		for(i=1; i<stats.length; i++)
		{
			if(getStat(i) > getStat(max))
			{
				max = i;
			}	
		}
		return max;
	}
	private int getBossStat()
	{
		int i;
		int max = 0;
		for(i=1; i<stats.length; i++)
		{
			if(getStat(i) > getStat(max) && getStat(i) < 255.0)
			{
				max = i;
			}	
		}
		return max;
	}
	public void setBossStat()
	{
		setStat(getBossStat(), 255.0);	
	}
}

