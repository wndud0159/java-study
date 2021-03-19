# wrapper클래스
- 8개의 기본형을 객체로 다뤄야할 때 사용하는 클래스
- 문자타입 말고는 전부 문자열로 생성 가능

기본형 | 래퍼클래스 | 활용 예
:---:|:---:|:---:
boolean | Boolean | Boolean b = new Boolean(true);
char | Character | Character c = new Character('A');
byte | Byte | Byte b = new Byte(1);
short | Short | Short s = new Short(2);
int | Integer | Integer i = new Integer(4);
long | Long | Long l = new Long(8);
float | Float | Float f = new Float(3.4f);//f빼면 double값
double | Double | Double d = new Double(3.4);

