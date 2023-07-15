//Shelly has a rectangular garden of length 22 m and breath 15 m. Her friend Rachel has a square garden of side 21 m. Whose garden is bigger and by how much?

class Test {
	public static void main(String[] args) {
		int length, breath, side, area1, area2, diff;
		length = 22;
		breath = 15;
		side = 21;
		area1 = (length * breath);
		area2 = (side * side);
		diff = (area2 - area1);
		System.out.println(" area of rectangle=" + area1);
		System.out.println(" area of square garden=" + area2);
		System.out.println("difference =" + diff);
		System.out.println("rachel garden is big");
	}
}