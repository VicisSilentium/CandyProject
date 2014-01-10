package candy.model;

public class MarshmallowCreature
{
	//Declaration Section
	private String name;
	private int eyeAmount;
	private int armAmount;
	private int legAmount;
	private boolean hasButton;
	
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setEyeAmount(int eyeAmount)
	{
		this.eyeAmount = eyeAmount;
	}
	
	public void setArmAmount(int armAmount)
	{
		this.armAmount = armAmount;
	}
	
	public void setLegAmount(int legAmount)
	{
		this.armAmount = legAmount;
	}
	
	public void setHasButtons(boolean hasButton)
	{
		this.hasButton = hasButton;
	}
	
	
	public String getName()
	{
		return name;
	}
	
	public int getEyeAmount()
	{
		return eyeAmount;
	}
	
	public int getArmAmount()
	{
		return armAmount;
	}
	
	public int getLegAmount()
	{
		return legAmount;
	}
	
	public boolean getHasButton()
	{
		return hasButton;
	}
	
	/**
	 * Default constructor - should not be used to make a MarshmallowCreature
	 */
	public MarshmallowCreature()
	{
		name = "Vicis Corium";
		eyeAmount = 13;
		armAmount = 3;
		legAmount = 4;
		hasButton = true;
	}
	
	
	/**
	 * Create a MarshmallowCreature
	 * @param name The name of the creature.
	 * @param eyeAmount The amount of eyes the creature has.
	 * @param armAmount The amount of arms the creature has.
	 * @param legAmount The amount of legs the creature has.
	 * @param hasButton Whether or not the creature has a button.
	 */
	public MarshmallowCreature(String name, int eyeAmount, int armAmount, int legAmount, boolean hasButton)
	{
		this.name = name;
		this.eyeAmount = eyeAmount;
		this.armAmount = armAmount;
		this.legAmount = legAmount;
		this.hasButton = hasButton;
		
	}
	
	
}
