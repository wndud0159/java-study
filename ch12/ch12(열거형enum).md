## 열거형(enum)
- 관련된 상수들을 같이 묶어 놓은것. 자바는 타입에 안전한 열거형을 제공
---
---
## 열거형을 정의와 사용
- 열거형을 정의하는 방법
```java
enum 열거형이름 {상수명1, 상수명2, 상수명n,.....}
```
- 열거형을 사용하는 방법
```java
enum Direction { EAST, SOUTH, WEST, NORTH}
class Unit {
    int x, y; // 유닛의 위치
    Direction dir; // 열거형 인스턴스 변수 선언

    void init() {
        dir = Direction.EAST //유닛의 방향을 EAST로 초기화
    }
}
```
- 열거형 상수의 비교는 -- 와 comparaTo() 사용가능
---
---
## 열거형의 조상 - java.lang.Enum
- 모든 열거형은 Enum이 자손이며, 아래의 메서드를 상속받는다
- values() valueOf()는 컴파일러가 자동으로 추가
```java
class<E> getDeclaringClass(); //열거형의 Class객체를 반환
String name(); // 열거형 상수의 이름을 문자열로 반환
int ordinal(); // 열거형 상수가 정의된 순서를 반환(0부터 시작)
T vlaueOf(Class<T> enumType, String Name); // 지정된 열거형에서 name과 일치하는 열거형 상수를 반환
```
---
---
## 열거형에 멤버 추가하기
```java
// 불연속적인 열거형 상수의 경우, 원하는 값을 괄호()안에 적는다.
enum Direction {EAST(1), SOUTH(5), WEST(-1), NORTH(10)}
// 괄호()를 사용하려면, 인스턴스 변수와 생성자를 새로 추가해 줘야 한다
enum Direction {
    EAST(1), SOUTH(5), WEST(-1), NORTH(10); // 끝에 ';'를 추가해야 한다.

    private final int value; // 정수를 저장할 필드(인스턴스 변수)를 추가

    Direction(int value) { this.value = value; } //생성자 추가

    public int getValue() { return value; }
}
// 열거형의 생성자는 묵시적으로 private이므로, 외부에서 객체생성 불가
Direction d = new Direction(1); // 에러. 열거형의 생성자는 외부에서 호출불가
```
