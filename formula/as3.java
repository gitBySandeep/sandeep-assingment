//How many tiles whose length and breadth are 13 cm and 7 cm respectively are needed to cover a rectangular region whose length and breadth are 520 cm and 140 cm? 
class Test {
	public static void main(String args[]) {

		int length, breath, r1, r2, a1, a2, totaltiles;
		length = 13;
		breath = 7;
		r1 = 520;
		r2 = 140;
		a1 = length * breath;
		a2 = r1 * r2;
		totaltiles = (a2 / a1);
		System.out.println("total tiles=" + totaltiles);
	}
}