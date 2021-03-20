# Comparator & Comparable
- Comparator
  - 기본 정렬 기준을 구현하는데 사용
- Comparable
  - 기본 정렬 기준 외 다른 기준으로 정렬하고자할 때 사용
```java
interface Comparator {
    int compare(Object o1, Object o2); // 두 객체를 비교
    boolean equals(Object obj); //이퀄스를 오버라이딩 하라는뜻(무시)
}

interface Comparable {
    int CompareTo(Object o); // 주어진 객체(o)를 자신(this)과 비교
}
```