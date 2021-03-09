# String 클래스
1. String클래스는 char[]와 메서드(기능)을 결합한 것

    `String클래스 = char[] + 메서드(기능)`

2. String클래스는 내용을 변경할 수 없다(read only)

```java
String a = "a";
String b = "b";
a = a+b;
a : "ab" // ab로 바뀌는게 아닌 새로운 ab가 생성되는 것
```

3. String클래스의 주요 메서드

    `char charAt(int index) - 문자열에서 해당 위치(index)에 있는 문자를 반환한다`

    ```java
    String str = "ABCDE";
    char ch = str.charAt(3);
    char : "D" // 문자열 str의 4번째 문자 'D'를 ch에 저장
    ```
    
    `int length - 문자열의 길이를 반환한다.`

    ```java
    String str = "ABCDE";
    int i = str.length;
    i : 5
    ```

    `String substring(int from, int to) - 문자열에서 해당 범위(from~to) 의 문자열을 반환한다.(to는 포함안됨)`

    ```java
    String str = "ABCDE";
    String tmp = str.substring(1,4);
    tmp : "BCD" 
    ```

    `boolean equals(Object obj) - 문자열의 내용이 같은지 확인한다. 같으면 결과는 true, 다르면 false`

    `char[] toCharArray() - 문자열을 문자배열(char[])로 변환해서 반환한다.`
