//31. What will be the area of a square with perimeter 200 m?

class Add {
	public static void main(String[] args) {

		int perimeter, side, area;
		perimeter = 200;

		side = perimeter / 4;
		area = side * side;
		System.out.println(" area=" + area);
	}
}