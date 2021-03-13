# static메서드와 instance메서드
>인스턴스 메서드<br>
-인스턴스 생성 후, 참조변수.메서드이름() 으로 호출<br>
-인스턴스 멤버(iv, im)와 관련된 작업을 하는 메서드<br>
-메서드 내에서 인스턴스 변수(iv) 사용가능

>스태틱메서드(클래스메서드)<br>
-객체생성 없이 클래스이름.메서드이름()으로 호출<br>
-인스턴스 멤버(iv,im)와 관련없는 작업을 하는 메서드<br>
-메서드 내에서 인스턴스 변수(iv) 사용불가
---
---
# 메서드 간의 호출과 참조
```java
class TestClass {
    int instanceVariable; // 인스턴스 변수
    static int classVariable;

    void intanceMethod() { // 인스턴스 메서드
        System.out.println(instanceVariable); // 인스턴스변수 사용가능
        System.out.println(ClassVariable); // 클래스변수 사용 가능
    }
    
    void staticMethod() { // 스태틱 메서드
        System.out.println(intanceVariable); // !!인스턴스변수 사용불가xxxxxxxx
        System.out.println(classVariable); // 클래스변수 사용 가능
    }

    // 차이 인스턴스변수를 사용하는가 안하는가의 차이가 있다
    /* 
    왜 스태틱 메서드는 인스턴스 변수를 사용 못하는가
    - 스태틱이 붙은 것들은 class 파일이 메모리에 올라갈 때 생성되기 때문에 인스턴스 변수를 읽을 수 없다? 맞나? 맞는거 같은데
    */
}
```


