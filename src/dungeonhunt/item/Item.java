package dungeonhunt.item;

import dungeonhunt.entity.Entity;

public interface Item {
	
	//Usage
	
	/**
	 * Empty method. Should be overridden by subclasses where appropriate. \n
	 * The no arguments method should inflict the effects upon the entity which owns the item
	 */
	void use();
	
	/**
	 * Empty method. Should be overridden by subclasses where appropriate. \n
	 * The 1 argument method should be used to inflict the effects upon another entity: 'Entity target'
	 * @param target
	 */
	void use(Entity target);
	
	//Inventory
	
	/**
	 * Places the item in the inventory of 'Entity target'
	 * @param target
	 */
	void placeInInventory(Entity target);
	
	/**
	 * Removes the item completely from 'Entity target'
	 * Useful for when a item (such as a sword) breaks.
	 * This is the preferred method of removing an item, setDurability(0) should NOT be used explicitly. 
	 * @param target
	 */
	void takeFromInventory(Entity target);
	
	/**
	 * Removes item from 'Entity origin' and gives it to 'Entity target'
	 * This is intended for use upon killing a monster with loot
	 * @param orgin
	 * @param target
	 */
	void tranferItem(Entity orgin, Entity target);
	
	/**
	 * Gives the entity that has the instance in inventory
	 * @return
	 */
	Entity owner();
	
	//Durability
	
	/**
	 * Sets the durability of an item.
	 * @param durability
	 */
	void setDurability(int durability);
	
	/**
	 * Decreases durability of the item by specified amount.
	 * Setting durability to 0 WILL destroy a item but is NOT recommended, use takeFromInventory() instead.
	 * @param decrement
	 */
	void decreaseDurability(int decrement);
	
	
	/**
	 * Increase durability of the item by specified amount.
	 * This item will break if the durability reaches 0 or less. Calls takeFromInventory() to do so
	 * @param increment
	 */
	void increaseDurability(int increment);
	
	//Name
	
	/**
	 * Sets the user viewable name of the item.
	 * @param name
	 */
	void setViewableName(String name);
	
	//Description
	

	/**
	 * Sets the user viewable description of the item.
	 * @param description
	 */
	void setViewableDescription(String description);
	
}
