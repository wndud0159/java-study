# 참조변수 super
- 객체 자신을 가리키는 참조변수. 인스턴스 메서드(생성자)내에서만 존재
- 조상의 멤버를 자신의 멤버를 구별할 때 사용

```java
class Parent {
    int x = 10; // super.x
}
class Child extends Parent {
    int x = 20; // this.x

    void method() {
        System.out.println("this.x = 20");
        System.out.println("super.x = 10")
    }
}


class Parent2 {
    int x = 10; // super.x this.x 둘 다 가능
}
class Child2 extends Parent2 {
    void method() {
        System.out.println("this.x = 10");
        System.out.println("super.x = 10")
    }
}
```
---
---
# super() - 조상의 생성자
- 조상의 생성자를 호출할 때 사용
- 조상의 멤버는 조상의 생성자를 호출해서 초기화
- 생성자의 첫 줄에 반드시 생성자를 호출해야한다. 그렇지 않으면 컴파일러가 생성자의 첫 줄에 super(); 를 자동삽입
```java
class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point {
    int z;

    Point3D(int x, int y, int z) {
        // 조상클래스의 생성자 Point(int x, int y)을 호출
        super(x, y); 
        // 자신의 멤버를 초기화
        this.z = z;
    }
}
```