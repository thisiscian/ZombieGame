package entity;
public class Statistics
{
		private double strength;
		private double perception;
		private double endurance;
		private double charisma;
		private double intelligence;
		private double agility;
		private double luck;
		private double fitness;
		private double maximumHealth;
		private double currentHealth;
		private double timeBorn;

		public Statistics()
		{
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
		public void setStr(double value){ strength = value;}
		public void setPer(double value){ perception = value;}
		public void setEnd(double value){ endurance = value;}
		public void setCha(double value){ charisma = value;}
		public void setInt(double value){ intelligence = value;}
		public void setAgi(double value){ agility = value;}
		public void setLuc(double value){ luck = value;}
		public void setFit(double value){ fitness = value;}
		
		public double getStr(){ return strength;}
		public double getPer(){ return perception;}
		public double getEnd(){ return endurance;}
		public double getCha(){ return charisma;}
		public double getInt(){ return intelligence;}
		public double getAgi(){ return agility;}
		public double getLuc(){ return luck;}
		public double getFit(){ return fitness;}

		public double getCurrentHealth(){ return currentHealth;}
		public double getMaximumHealth(){ return maximumHealth;}
		public void setMaximumHealth(double value){maximumHealth = value;}
		public void setCurrentHealth(double value){currentHealth = value;}
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
	}
	
