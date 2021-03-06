
/**
 * @author Frank Choukouali
 *
 */
public class HolidayBonus {

	
	
	public HolidayBonus() {
		
	}

	/**
	 * Calculates the holiday bonus for each store
	 * @param data
	 * @param high
	 * @param low
	 * @param other
	 * @return an array of the bonus for each store
	 */
	public static double[] calculateHolidayBonus(double[][] data, double high, double low,double other) {
		double[] bonus = new double[data.length];
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				if(data[row][col] > 0 ) {
					if (data[row][col] == TwoDimRaggedArrayUtility.getHighestInColumn(data,col) )
						bonus[row] += high;
					else if (data[row][col] == TwoDimRaggedArrayUtility.getLowestInColumn(data, col))
						bonus[row] += low;
					else 
						bonus[row] += other;
				}
			}
		}
		return bonus;
	}
	
	/**
	 * Calculates the total holiday bonuses
	 * @param data
	 * @param high
	 * @param low
	 * @param other
	 * @return the total of all holiday bonuses
	 */
	public static double calculateTotalHolidayBonus(double[][] data,double high, double low,double other) {
		double total = 0;
		double[] bonus = calculateHolidayBonus(data, high, low, other);
		for (int i = 0; i < bonus.length; i++) {
			total += bonus[i];
		}
		return total;
	}
}
