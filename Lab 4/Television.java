/** 
*The purpose of this class is to model a television
* Frank Choukouali 9/26/2020
* @author FRANK
*
*/


public class Television {
	private final String MANUFACTURER;
	private final int SCREEN_SIZE;
	private boolean powerOn;
	private int channel;
	private int volume;
	
	/**
	 * Constructor Television that has two parameters 
	 * @param brand
	 * @param size
	 * Initialize the powerOn field to false (power is off), 
	 * the volume to 20, and the channel to 2
	 */
	public Television(String brand,int size) {
		this.MANUFACTURER = brand;
		this.SCREEN_SIZE = size;
		powerOn= false;
		channel = 2;
		volume = 20;
	}
	
	
	/**
	 * @param station
	 */
	public void setChannel(int station) {
		this.channel = station;
	}
	
	/**
	 * Switch the value of powerOn
	 */
	
	public void power() {
		this.powerOn = !this.powerOn;
	}
	

	/**
	 * increase the volume by 1
	 */
	public void increaseVolume() {
		this.volume++;
	}
	
	/**
	 * decrease the volume by 1
	 */
	public void decreaseVolume() {
		this.volume--;
	}
	/**
	 * @return an integer, the current value of channel
	 */
	public int getChannel() {
		return channel;
	}
	
	/**
	 * @return an integer, the current value of volume
	 */
	public int getVolume() {
		return volume;
	}
	
	/**
	 * @return an String, the current value of MANUFACTURER
	 */
	public String getManufacturer() {
		return MANUFACTURER;
	}
	
	/**
	 * @return an integer, the current value of SCREEN_SIZE
	 */
	public int getScreenSize() {
		return SCREEN_SIZE;
	}

	
	
	
}
