//19. A cube with an edge of 7 cm and a cuboid measuring 7 cm × 4 cm × 8 am are kept on a table. Which shape has more volume?

class Test {
	public static void main(String[] args) {
		int length, breath, height, a, cube, cuboid, diff;
		length = 7;
		breath = 4;
		height = 8;
		a = 7;
		cube = a * a * a;
		cuboid = (length * breath * height);
		diff = cube - cuboid;

		System.out.println(+cube + " m area of cube");
		System.out.println(+cuboid + " m area of cuboid");
		System.out.println(+diff + " m of difference");
		System.out.println(" cube are covered more ");
	}
}