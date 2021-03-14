# Object클래스 - 모든 클래스의 조상
- 부모가 없는 클래스는 자동적으로 Object클래스를 상속받게 된다.
- 모든 클래스는 Object클래스에 정의된 11개의 메서드를 상속받는다.
    - toString()
    - equals(Object obj)
    - hashcode()
    - ,,,
    - ,,,
```java
class Tv { //상속받은게 없기에 자동적으로 extends Object

}
class smartTv extends Tv {

}
```