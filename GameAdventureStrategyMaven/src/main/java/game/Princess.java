package game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Princess extends Character {
	final Logger logger = LoggerFactory.getLogger(Princess.class);
	
	/**
	* Constructor of Princess thar receives as argument a WeaponBehaviour.
	*
	* @param w Weapon with which the Princess will fight
	*/
	public Princess(WeaponBehaviour w) {
		super(w);
	}
	
	@Override
	public void display() {
	// TODO Auto-generated method stub
		logger.info("You are a strong, hulky Princess!!!.");
	}
}
