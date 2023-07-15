//12. Find the area of a right angled triangle whose hypotenuse is 13 cm and one of its sides containing the right angle is 12 cm. Find the length of the other side.

class Test {
	public static void main(String[] args) {
		int side1, side2, length;
		side1 = 13;
		side2 = 12;
		length = (side1 * side1) - (side2 * side2);
		System.out.println("length of other side=" + length);
	}
}