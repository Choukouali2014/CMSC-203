import java.util.Scanner;
public class SphereVolume {

	public static void main(String[] args) {
		double diam;//variable to hold the diameter of a sphere;
		double radius; //variable to hold the raduis of a sphere;
		double volume;//variable to hold the volume of a sphere;
		Scanner stdin = new Scanner(System.in);
		System.out.println("Create a  program that calculates the result of a mathematical formula. ");
		System.out.print("Please, provide the diameter of a sphere : ");
		diam  =stdin.nextDouble();
		radius =diam/2;
		System.out.println("The raduis of a sphere is : "+ radius+" "+Math.PI+" "+Math.pow(radius, 3));
		volume =(double)4/3 * (Math.PI * Math.pow(radius, 3));
		
		System.out.println("The volume of a sphere is : "+ volume);
	}

}
