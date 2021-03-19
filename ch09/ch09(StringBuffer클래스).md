# StirngBuffer클래스(문자열을 저장&다루기)
- String처럼 문자형 배열(char[])을 가지고 있다
- 그러나, String과 달리 내용을 바꿀 수 있다(mutable)
- append()는 지정된 내용을 Stringbuffer에 추가 후, StringBuffer의 참조를 반환
- StringBuffer는 equals()가 오버라이딩 되어있지 않다(주소비교)
  - StringBuffer를 Stirng타입으로 변환 한 다음에 equals()로 비교
    - String str = stringBuffer.toString();
- 그 외에도 insert(), delete() 등 다양한 메소드 존재
```java
StringBuffer sb = new StringBuffer("abc");
sb.append("123");
//sb의 내용 뒤에 "123"을 추가한다 
sb.append("abc").append("이런식으로도 가능");
```