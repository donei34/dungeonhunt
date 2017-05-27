package dungeonhunt.entity;

import dungeonhunt.item.*;

public interface Entity {

	//HP
	
	/**
	 * Sets the health of the instance
	 * @param health
	 */
	void setHealth(int health);
	
	/**
	 * Removes health from the instance
	 * @param damage
	 */
	void damage(int damage);
	
	/**
	 * Adds health to the instance
	 * @param heal
	 */
	void heal(int heal);

	/*
	 * Inventory
	 * 
	 * Inventory should be stored as an array of items size 5
	 * Special care should be taken to ensure this array does not go out of bound and behaves properly
	 * 
	 * Unused array elements should be set to the special 'null item' which is created through the no argument
	 *    constructor 'item()' @ dungeonhunt.item.Item
	 */
	
	/**
	 * Empties the inventory of the instance by setting all indexes to the null item
	 */
	void emptyInventory();
	
	/**
	 * Checks if inventory is full
	 * @return true if inventory is full
	 */
	boolean checkInvenotryFull();
	

	/**
	 * Adds a item to the inventory.
	 * If the inventory is full and this method is called a 'ArrayIndexOutOfBoundsException' will be thrown.
	 * It is recommended that checkInventoryFull() and Item.takeItemFromInventory() are used prior to calling this method
	 * 
	 * @param item
	 * @throws ArrayIndexOutOfBoundsException
	 */
	void addToInvenotry(Item item) throws ArrayIndexOutOfBoundsException; 
	
	/**
	 * Removes item from inventory by setting it to the null item
	 * @param item
	 */
	void removeFromInventory(Item item);
	
	/**
	 * Looks through the inventory to find armor
	 * @return
	 */
	int getDefenceValue();
	
	/*
	 * Score
	 * 
	 * Used to help determine the 'treasure' or score at the end
	 * Upon defeating a entity all of the score is transfered 
	 */
	
	
	/**
	 * Sets the score of an entity
	 * @param score
	 */
	void setScore(int score);
		
}
