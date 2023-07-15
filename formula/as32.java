//. A square garden with a side length of 150 m has a square swimming pool in the very centre with a side length of 25 m . Calculate the area of the garden.
class Add {
	public static void main(String[] args) {

		int length1, length2, area1, area2, area;
		length1 = 150;
		length2 = 25;
		area1 = length1 * length1;
		area2 = length2 * length2;
		area = area1 - area2;

		System.out.println(" area=" + area);
	}
}