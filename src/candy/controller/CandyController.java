package candy.controller;

import candy.model.MarshmallowCreature;

public class CandyController
{
	private MarshmallowCreature myCreature;
	
	public CandyController()
	{
		
	}
	
	public void start()
	{
		promptForInfo();
		makeMonster();
		
	}
	
	private void promptForInfo()
	{
		//decide what to put on the MarshmallowCreature
		//Do not code this
	}
	
	private void makeMonster()
	{
		//make a marshmallow creature that does not use the default constructor
		//Code this!
		myCreature = new MarshmallowCreature("Vicis Corium", 13, 3, 4, true);
	}
	
	
	
	
	
	
	
}
