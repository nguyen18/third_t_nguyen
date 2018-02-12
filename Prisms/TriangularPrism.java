/* Write this concrete (non-abstract) class called TriangularPrism.  
 * It has 3 private fields (sideA, sideB, and sideC).
 * It inherits its height from its superclass, Prism (because all prisms have a height).
 * Provide a constructor and the methods required by its abstract superclass.  
 * 
 * Math Note:
 * Perimeter refers to the perimeter of the base - the sum of all the sides.
 * To find the area of a triangle given 3 side lengths, look up Heron's formula.  
 * It uses half the perimeter.  (Why might you want to use 0.5 instead of 1/2?)
 */


public class TriangularPrism extends Prism
{
	private double sideA = 0;
	private double sideB = 0;
	private double sideC = 0;
	
	public TriangularPrism(double sideA, double sideB, double sideC, double height) {
		super(height);
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	
	public double calcAreaOfBase() {
		return super.getHeight() * sideC;
	}
	
	public double calcVolume() {
		double semiPerimeter = (sideA + sideB + sideC) / 2;
		return (Math.sqrt(semiPerimeter*(semiPerimeter-sideA)*(semiPerimeter-sideB)*(semiPerimeter-sideC)))*super.getHeight();
	}
	
	public double calcSA() {
		double semiPerimeter = (sideA + sideB + sideC) / 2;
		return (2*(Math.sqrt(semiPerimeter*(semiPerimeter-sideA)*(semiPerimeter-sideB)*(semiPerimeter-sideC))))+(super.getHeight()*sideA)+(super.getHeight()*sideB)+(super.getHeight()*sideC);
	}
	
}
