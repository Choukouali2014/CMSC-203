
public class Function2 extends Function {

	@Override
	public String answerString(double optVal, double x, double y, double z) {
		
		return "Minimum cost is "+String.format("%.2f", optVal) +" with height = "+String.format("%.2f", x)+"cm and raduis = "+String.format("%.2f", y);
	}

	@Override
	public double fnValue(double x) {
		
		return (x/3)+2*Math.sqrt(Math.pow(x, 2) - 8*x + 25);
	}

	@Override
	public double getXVal(double x) {
		
		return x;
	}

	@Override
	public double getYVal(double x) {
		
		return x;
	}

	@Override
	public double getZVal(double x) {
		return x;
	}
	public String toString() {
		return "Minimize the distance a dog will run and swim to retrieve a ball in the ocen";
	}
}
