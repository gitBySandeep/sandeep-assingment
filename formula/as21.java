//A brick measures 15 cm in length, 8 cm in breadth and 5 cm in height. How many bricks will be used to make a wall of length 15 m, breadth 10 m and height 8 metres?

class Test {
	public static void main(String[] args) {
		int length, breath, height, length1, breath1, height1, a1, a2, a, b;
		length = 15;
		breath = 8;
		height = 5;
		length1 = 15;
		breath1 = 10;
		height1 = 8;
		a1 = length * breath * height;
		a2 = length1 * breath1 * height1;
		a = (a2 / a1);
		b = a * 100;
		System.out.println(+b + " of brick are used to make wall ");

	}
}