// 27. Find the cost of tiling a dining room 20 m long and 15 m wide at the rate of $ 5 per square m.

class Test {
	public static void main(String[] args) {
		int length, breath, area, cost;
		length = 20;
		breath = 15;
		area = length * breath;
		cost = area * 5;
		System.out.println(+cost + " are cost of tiling a dining room  ");
	}
}