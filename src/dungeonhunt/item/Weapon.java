package dungeonhunt.item;

import dungeonhunt.entity.*;

public interface Weapon extends Item {

	//Damage
	
	/**
	 * Invokes Entity.damage() on 'Entity target' after considering armor.
	 * @param target
	 */
	void use(Entity target); //Make sure to override
	
}
