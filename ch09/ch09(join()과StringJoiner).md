# join()과 StringJoiner
- join()은 여러 문자열 사이에 구분자를 넣어 결합한다.
```java
String animals = "dog,cat,bear";
// 문자열 ","를 구분자로 나누어서 배열에 저장
String[] stringArray = animals.split(",");
// 배열의 문자열을 "-"로 구분해서 결합
String str = String.join("-",stirngArray);
// dog-cat-bear
System.out.println(str);
```
---
---
## 문자열과 기본형 간의 변환
- 숫자를 문자열로 변환하는 방법
```java
int i = 100;
String str1 = i + ""; // 정수 100 을 문자열 "100"으로 변환
Stirng str2 = String.valueOf(i) // 정수 100을 문자열 "100"으로 변환
```
- 문자를 숫자로 변환하는 방법
```java
String s = "100";
int i1 = Integer.parseInt(s) // 문자열 "100"을 정수 100으로 변환
int i2 = Integer.valueOf(s) // 문자열 "100"을 정수 100으로 변환
Integer i2 = Integer.valueOf(s) // 원래는 반환타입이 Integer
```