//2. The area of a rectangle is 96 cm². If the breadth of the rectangle is 8 cm, find its length and perimeter. 
class Test {
	public static void main(String args[]) {

		int area, length, breath, perimeter;
		perimeter = 230;
		breath = 8;
		area = 96;

		length = (area / breath);
		perimeter = (2 * length + 2 * breath);

		System.out.println("length=" + length);
		System.out.println("perimeter=" + perimeter);
	}
}
