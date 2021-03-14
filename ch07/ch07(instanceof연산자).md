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
```