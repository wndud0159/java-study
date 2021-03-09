# Arrays로 배열 다루기
문자열의 비교와 출력 - equals(), toString()

```java
int[] arr = {0, 1, 2, 3, 4};
int[][] arr2D = {{11,12},{21,22}};

System.out.println(Arrays.toString(arr)); // [0,1,2,3,4]
System.out.println(Arrays.deepToString(arr2D)); // [[11,12],[21,22]]

String[][] str2D = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
String[][] str2D2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
System.out.println(Arrays.equals(str2D, str2D2)); // false
System.out.println(Arrays.deepEquals(str2D, str2D2)); // true
```

배열의 정렬 - sort()

```java
int[] arr = {3, 2, 0, 1, 4};
Arrays.sort(arr); // 배열 arr을 정렬한다.
System.out.println(Arrays.toString(arr)); // [0,1,2,3,4] 오름차순
```