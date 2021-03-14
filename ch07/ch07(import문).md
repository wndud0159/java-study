# import문
- 클래스를 사용할 때 패키지이름을 생략할 수 있다.
- 컴파일러에게 클래스가 속한 패키지를 알려준다.
- java.lang패키지(기본패키지)의 클래스는 import하지 않고도 사용할 수 있다.
```java
class ImportTest {
    java.util.Date today = new java.util.Date();
}

import java.util.Date;
class ImportTest {
    Date today = new Date();
}
```
---
---
# import문의 선언
- import문을 선언하는 방법은 다음과 같다.
```
import 패키지명.클래스명;
    또는
import 패키지먕.*; // 모든 클래스
```

순서

1. 패키지선언
2. import
3. class 정의


---
---
# static import ans
- static멤버를 사용할 때 클래스 이름을 생략할 수 있게 해준다
```java
import static java.lang.integer.*;
import static java.lang.Math.random;
import static java.lang.System.out;

System.out.println(Math.random());
>>>
out.println(random());
```