/*Luci is making a display board for the school exhibition. The display board is a 3 m by 2 m rectangle. He needs to add a ribbon border around the entire 
display board. What is the length of ribbon that he needs?*/

class Test {
	public static void main(String[] args) {
		int length, breath, a, area;
		length = 3;
		breath = 2;
		area = (length * breath);
		a = area * 2;

		System.out.println(+a + " m length of ribbon");
	}
}