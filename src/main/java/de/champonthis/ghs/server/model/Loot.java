/**
 * 
 */
package de.champonthis.ghs.server.model;

import de.champonthis.ghs.server.util.Required;

/**
 * The Class Loot.
 */
public class Loot {

	@Required
	private LootType type;
	@Required
	private String value;
	@Required
	private int enhancements = 0;

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public LootType getType() {
		return type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(LootType type) {
		this.type = type;
	}

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value.
	 *
	 * @param value the new value
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Gets the enhancements.
	 *
	 * @return the enhancements
	 */
	public int getEnhancements() {
		return enhancements;
	}

	/**
	 * Sets the enhancements.
	 *
	 * @param enhancements the new enhancements
	 */
	public void setEnhancements(int enhancements) {
		this.enhancements = enhancements;
	}

}
