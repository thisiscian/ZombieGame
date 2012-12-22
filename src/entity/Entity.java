package entity;

public class Entity
{
	private Position pos;
	public Statistics stats;
	public Entity()
	{
		pos = new Position(0.0,0.0);
		stats = new Statistics();
	}
	public double getHorizontalPosition()
	{
		return pos.getHorizontalPosition();
	}
	public double getVerticalPosition()
	{
		return pos.getVerticalPosition();
	}
}
