//Find the area of a triangle, sides of which are 10 cm and 9 cm and the perimeter 36 cm.
//perimeter=a+b+c;
class Test {
	public static void main(String[] args) {
		int side1, side2, side3, perimeter, area;
		side1 = 10;
		side2 = 9;
		perimeter = 36;
		side3 = perimeter - (side1 + side2);

		area = (side1 * side2) / 2;
		System.out.println("side3=" + side3);
		System.out.println("area" + area);

	}
}