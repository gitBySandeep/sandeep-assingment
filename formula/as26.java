//26. How many bricks will be required to lay a path 120 m long and 2.4 m breadth if a brick is 24 cm long and 15 cm wide?
//1m2=10000cm2;

class Test {
	public static void main(String[] args) {
		int length;
		length = 120;
		float breath = 2.4f;
		float a = length * breath;
		float area = a * 10000;
		float length1 = 24;
		float wide = 15;
		float area1 = 24 * 15;
		float bricks = area / area1;

		System.out.println(+bricks + " bricks will be required  ");
	}
}