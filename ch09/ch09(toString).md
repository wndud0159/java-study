# toString()의 오버라이딩
- 객체를 문자열(Stirng) 으로 바꾸기 위한 메서드
```java
class Object {
  public String toString() {
    return getClass().getName()+"@"+integer.toHexString(hashCode());
  }
  // 보통 오버라이딩 해서 사용한다
} 
```