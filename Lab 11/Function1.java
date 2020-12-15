
public class Function1 extends Function {

	@Override
	public String answerString(double optVal, double x, double y, double z) {
		return "Minimum cost is "+String.format("%.2f", optVal) +" with height = "+String.format("%.2f", x)+"cm and raduis = "+String.format("%.2f", y);
	}

	@Override
	public double fnValue(double x) {
		return 0.8*Math.PI*Math.pow(x, 2) + (800/x);
	}

	@Override
	public double getXVal(double x) {
		return x;
	}

	@Override
	public double getYVal(double x) {
		return 2000/(Math.PI*Math.pow(x, 2));
	}

	@Override
	public double getZVal(double x) {
		return -1.0;
	}
	
	public String toString() {
		return "Minimize the cost of a can that will hold 2 liters of liquid";
	}

}
