# 생성자 this()
- 생성자에서 다른 생성자 호출할 때 사용
- 다른 생성자 호출시 첫 줄에서만 사용가능
- 생성자는 instanceVariable 을 초기화를 하는일을 한다
```java
class Car {
    String color; // 색상
    String gearType; // 변속기 종류 - auto(자동), manual(수동)
    int door; // 문의 개수

    Car() {
        this("white", "auto", 4);
    }

    Car(String color) {
        this(color, "auto", 4);
    }

    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
```
---
---
# 참조변수 this
- 인스턴스 자신을 가리키는 참조변수
- 인스턴스 메서드(생성자 포함) 에서 사용가능
- 지역변수(localVariable)와 인스턴스변수(instanceVariable)를 구별할때 사용
  