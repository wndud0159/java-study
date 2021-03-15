# instanceof 연산자
- 참조변수의 형변환 가능여부 확인에 사용. 가능하면 true반환
- 형변환 전에 반스시 instanceof로 확인해야함
```java
void dowork(Car car) {
    if(car instanceof FireEngine) {
        FireEngine fireEngine = (FireEngine)car;
        fireEngine.water();
    }
}
// 형변환을 하는 이유는 인스턴스의 원래 기능을 모두 사용하려고 Car타입의 리모콘인 car로는 water()를 호출할 수 없으니까. 리모콘을 FireEngine타입으로 바꿔서 water()를 호출
```