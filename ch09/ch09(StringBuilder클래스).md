# StringBuilder클래스
- StirngBuffer클래스와 동일
- StringBuffer는 동기화 되어 있다 StringBuilder는 동기화 되어있지 않다
- 동기화가 되어있다는건 멀티쓰레드에 안전(thread-safe)
- 멀티 쓰레드 프로그램이 아닌 경우, 동기화 불필요(성능저하)
- 이럴땐 StringBuffer를 사용하는것보다 StirngBuilder를 사용 적절(성능향상)