
public class Ex2_2 {
	public static void main(String[] args) {
		
		//overflow
		int num = 2_147_483_647;
		System.out.println((int)num+1);
		char cMin = 0;
		System.out.println((int)--cMin);
		//문자열과 숫자간의 변환
		String str = "3";
		int num3 = Integer.parseInt(str);
		System.out.println(str);
	
		int num2 = 2;
		String emptystr = "";
		emptystr += num2;
		System.out.println(emptystr);
		
		//문자와 문자열의 변환
		String strA = "A";
		char ch = strA.charAt(0);
		System.out.println(ch);
		
		//문자와 숫자간의 변환
		char charChange = '9';
		int num9 = Character.getNumericValue(charChange);
		System.out.println(num9);
		
		int num8 = 12;
		char ch8 = '0';
		ch8 = (char) (ch8+num8);
		System.out.println(ch8); //?;;;
		
		System.out.println(3 + '0'); // 0은 숫자로 48 결과 51
		
	}
}
