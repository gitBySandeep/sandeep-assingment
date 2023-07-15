/*14. The length of one of the diagonals of a field in the form of a quadrilateral is 46 m. The perpendicular distance of the other two vertices from the diagonal are 13 m and 10 m,
 find the area of the field.*/
//area of quadriletral=1/2*d*(h1*h2);

class Test {
	public static void main(String[] args) {
		int diagonal, h1, h2, area;
		diagonal = 46;
		h1 = 13;
		h2 = 10;
		area = (46 * (h1 + h2) / 2);
		System.out.println("area of field=" + area);
	}
}