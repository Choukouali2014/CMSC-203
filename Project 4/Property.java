
/**
 * @author Frank Choukouali
 *
 */
public class Property {

	private String city;
	private String owner;
	private String propertyName;
	private double rentAmount;
	private Plot plot;
	
	
	/**
	 * No-arg Constructor, creates a new object with default values of empty strings, 
	 * 0 for rent amount, and default Plot (sets the x, y values to zero, depth and width to 1)
	 */
	public Property() {
		
		this("","",0,"",0,0,1,1);
		/*this.city="";
		this.owner ="";
		this.propertyName="";
		this.rentAmount=0;
		this.plot = new Plot();*/
		
	}
	/**
	 *  Copy Constructor, creates a new object using the information of the object passed to it.
	 * @param p
	 */
	public Property(Property p) {
		this.city=p.city;
		this.owner =p.owner;
		this.propertyName=p.propertyName;
		this.rentAmount=p.rentAmount;
		this.plot =new Plot(p.plot);
	}
	/**
	 * Parameterized Constructor, no Plot information provided
	 * @param propertyName
	 * @param city
	 * @param rentAmount
	 * @param owner
	 */
	public Property(String  propertyName,String city, double rentAmount,String owner) {
		this.city=city;
		this.owner =owner;
		this.propertyName=propertyName;
		this.rentAmount=rentAmount;
		this.plot = new Plot();
		
	}
	/**
	 * Constructor, Parameterized constructor
	 * @param propertyName
	 * @param city
	 * @param rentAmount
	 * @param owner
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	public Property(String propertyName,String city, double rentAmount,String owner,int x ,int y,int width,int depth) {
		this.city=city;
		this.owner =owner;
		this.propertyName=propertyName;
		this.rentAmount=rentAmount;
		this.plot = new Plot(x,y,width,depth);
	}
	
	/**
	 * @return the property Name
	 */
	public String getPropertyName() {
		return propertyName;
	}
	/**
	 * Set the property name
	 * @param propertyName
	 */
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * set the Plot values
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	public void setPlot(int x, int y, int width, int depth) {
		this.plot = new Plot(x,y,width,depth);
	}
	/**
	 * set the city
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the rent Amount
	 */
	public double getRentAmount() {
		return rentAmount;
	}
	/**
	 * set the rent amount
	 * @param rentAmount
	 */
	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
	/**
	 * @return the owner name
	 */
	public String getOwner() {
		return owner;
	}
	/**
	 * set the owner name
	 * @param owner
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
	/**
	 * @return plot
	 */
	public Plot getPlot() {
		return plot;
	}
	
	 
	/**
	 *Prints out the name, city, owner and rent amount for a property
	 */
	@Override
	public String toString() {
		String result="";
		result+="Property Name: "+this.getPropertyName()+"\n";
		result+=" Located in "+this.getCity()+"\n";	
		result+=" Belonging to: "+this.getOwner()+"\n";
		result+=" Rent Amount : "+this.getRentAmount()+"\n";
		return  result;
	}
	
	
}
