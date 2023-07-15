//How many square tiles of side 10 cm will be required to tile a floor measuring 800 cm by 900 cm?

class Test {
	public static void main(String[] args) {
		int length, breath, side, area, area1, tiles;
		length = 800;
		breath = 900;
		side = 10;
		area = length * breath;
		area1 = side * side;

		tiles = area / area1;
		System.out.println(+tiles + " tiles of 10cm required    ");
	}
}