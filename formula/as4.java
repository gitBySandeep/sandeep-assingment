//Find the cost of tiling a rectangular plot of land 300 m long and 150 m wide at the rate of $6 per hundred square m. 

class Test {
	public static void main(String[] args) {
		int length, breath, area, d, cost;
		length = 300;
		breath = 150;
		area = length * breath;
		d = area / 100;
		cost = d * 6;

		System.out.println("total cost=" + cost);
	}
}
