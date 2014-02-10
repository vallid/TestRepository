
public class Bulb
{
	private final static int DEFAULT_POWER=100;
	
	private final int power;

	private boolean isLit;

	public Bulb()
	{
		this.power=DEFAULT_POWER;
		this.isLit=false;
	}
	
	public Bulb(int power0)
	{
		this.power=power0;
		this.isLit=true;
	}
	
	public void switchOn()
	{
		this.isLit=true;
	}
	public void switchOff()
	{
		this.isLit=false;
	}
	
	public int getPower()
	{
		return this.power;
	}
}
