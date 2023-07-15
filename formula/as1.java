//The perimeter of a rectangle is 230 cm. If the length of the rectangle is 70 cm, find its breadth and area.
//area of perameter area=2(l+b);

class Test {
	public static void main(String args[]) {

		int perimeter, length, breath, area;
		perimeter = 230;
		length = 70;
		breath = 0;
		breath = (perimeter - 2 * length) / 2;

		System.out.println("breath=" + breath);

		area = (length * breath);
		System.out.println("area=" + area);
	}
}