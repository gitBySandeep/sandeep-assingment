// How many tiles of length 5 cm and breadth 8 cm are needed to tile the floor of a bed room 200 cm long and 400 cm wide?

class Test {
	public static void main(String[] args) {
		int length, breath, length1, breath1, area, area1, tiles;
		length = 5;
		breath = 8;
		length1 = 200;
		breath1 = 400;

		area = length * breath;
		area1 = length1 * breath1;

		tiles = area1 / area;
		System.out.println(+tiles + " tiles are required    ");

	}
}