package entity;
public class Position
{
	private double horizontalPosition;
	private double verticalPosition;
	
	public Position(double x, double y)
	{
		horizontalPosition = x;
		verticalPosition = y;
	}
		public double getHorizontalPosition()
	{
		return horizontalPosition;
	}
	public double getVerticalPosition()
	{
		return verticalPosition;
	}
	public void setHorizontalPosition(double x)
	{
		horizontalPosition = x;
	}
	public void setVerticalPosition(double y)
	{
		verticalPosition = y;
	}
}


