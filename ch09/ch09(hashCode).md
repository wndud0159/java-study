# hashCode()
- 객체의 해시코드(hashcode)를 반환하는 메서드
- Object클래스의 hashCode()는 객체의 주소를 int로 변환해서 반환
- equals()를 오버라이딩 하면 hashCode()도 오버라이딩 해야한다
- equals()의 결과가 true인 두 객체의 해시코드는 같아야 하기 때문
```java
public class Object {
  public native int hashCode(); // 네이티브메서드 : os의 메서드(c언어) 이 메서드를 구현한 클래스가 존재함??
}

String str1 = new String("abc");
String str2 = new String("abc");
System.out.println(str1.equals(str2)); // true
System.out.println(str1.hashCode()); // 96354
System.out.println(str2.hashCode()); // 96354

//System.identityHashCode(Object obj)는 Object클래스의 hashCode()와 동일
//객체마다 다른 해시코드 반환
System.out.println(System.identityHashCode(str1)); // 3526198
System.out.println(System.identityHashCode(str2)); // 7699183
