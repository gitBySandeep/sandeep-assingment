/*33. A rectangular garden has dimensions of 30 m by 20 m and is divided in to 4 parts by two pathways that run perpendicular from its sides. 
One pathway has a width of 3m and the other, 4 m. Calculate the total usable area of the garden.*/

class Add {
	public static void main(String[] args) {

		int length1, length2, side1, side2, area1, area2, area, b;
		length1 = 30;
		length2 = 20;
		side1 = 3;
		side2 = 4;
		area1 = length1 * length2;
		b = area1 * 4;
		area2 = side1 * side2;
		area = b / area2;

		System.out.println(" area=" + area);
	}
}