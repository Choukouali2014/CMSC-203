
public class Function3 extends Function {

	@Override
	public String answerString(double optVal, double x, double y, double z) {
		return "Minimum cost is "+String.format("%.2f", optVal) +" with height = "+String.format("%.2f", x)+"cm and raduis = "+String.format("%.2f", y);
	}

	@Override
	public double fnValue(double x) {
		return Math.sqrt(Math.pow(x, 4)- Math.pow(x, 2) + 1);
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
		return "Find the minimum distance between the function f(x)=x^2 and the point (0,1) \n"+
					"This distance is described by the function d(x)= sqrt(x^4 - x^2 + 1)";
	}

}
