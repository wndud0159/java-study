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
---
---
## 문자열의 비교
```java
String str1 = "abc"; //문자열 리터럴 "abc"의 주소가 str1에 저장됨
String str2 = "abc"; // 문자열 리터럴 "abc"의 주소가 str2에 저장됨
Stirng str3 = new String("abc"); // 새로운 String 인스턴스를 생성
String str4 = new String("abc"); // 새로운 String 인스턴스를 생성

// 여기서 문자열 리터럴 주소로 저장할 경우 참조변수가 똑같은 값을 바라보고 있지만 
// 인스턴스화 시켜서 사용하면 새로운 문자열이 만들어지는것이기 때문에 equals()로 비교가 불가능하다 ...
```
---
---
## 문자열 리터럴
- 문자열 리터럴은 프로그램이 실행 시 자동으로 생성된다.(constant pool에 저장(상수저장소)
- 같은 내용의 문자열은 하나만 만들어 진다.
---
---
## 빈 문자열("", empty String)
- 내용이 없는 문자열 크기가 0인 char형 배열을 저장하는 문자열
- 크기가 0인 배열을 생성하는 것은 어느 타입이나 가능하다
```java
char[] characterArray = new char[0]; // 길이가 0인 char배열
int[] integetArray = {}; // 길이가 0인 int배열
```
- 문자(char), 문자열(String)의 초기화
```java
// 기본값
String s = null;
char c = \u0000; // 유니코드의 첫 번째 문자
///////////////////////////////////////
// 사용자 정의 초기화
Stirng s = "";
char c = ''
```

