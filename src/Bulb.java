
/**
 * @author vallid
 * crée la classe bulb caractérisé par:
 * sa puissance
 * son état: allumée ou éteint 
 */
public class Bulb
{
	/**
	 * Puissance par defaut à 100 W
	 */
	private final static int DEFAULT_POWER=100;
	
	/**
	 * la puissance de la lampe (W)
	 */
	private final int power;

	/**
	 * état de la lampe :
	 */
	private boolean isLit;

	/**
	 * Retourne une nouvelle lampe de puissance par défaut et éteinte
	 */
	public Bulb()
	{
		this.power=DEFAULT_POWER;
		this.isLit=false;
	}
	
	/**
	 * Retourne une nouvelle lampe de puissance donnée et allumée
	 * @param power0 puissance initial de la lampe
	 */
	public Bulb(int power0)
	{
		this.power=power0;
		this.isLit=true;
	}
	
	/**
	 * allume la lampe
	 */
	public void switchOn()
	{
		this.isLit=true;
	}
	/**
	 * éteint la lampe
	 */
	public void switchOff()
	{
		this.isLit=false;
	}
	
	/**
	 * retourne la puissance de la lampe
	 * @return la puissance de la lampe
	 */
	public int getPower()
	{
		return this.power;
	}
}
