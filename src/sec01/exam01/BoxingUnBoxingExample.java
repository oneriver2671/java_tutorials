// Wrapper Å¬·¡½º ¿¹Á¦. (È¥°øÀÚ p.500)

package sec01.exam01;
public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		// ¹Ú½Ì
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");
		
		// ¾ð¹Ú½Ì
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		
		
	}
}
