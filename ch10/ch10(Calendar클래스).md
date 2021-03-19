# Calendar클래스
- 추상클래스 이므로 getInstance()통해 구현된 객체를 얻어야 한다
```java
Calendar cal = new Calendar(); // 에러. 추상클래스는 객체를 생성할 수 없다

Calendar cal = Calendar.getInstance(); // 가능 getInstance()메서드는 Calendar클래스를 구현한 클래스의 인스턴스를 반환한다. 
```