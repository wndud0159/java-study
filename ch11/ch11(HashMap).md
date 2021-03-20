# HashMap & Hashtable - 순서x 중복(키x값o)
- Map인터페이스를 구현 데이터를 키와 값 쌍으로 저장
- HashMap(동기화x) 은 Hashtable(동기화o)의 신버전
- 순서를 유지하려면 LinkedHashMap 사용
- TreeMap도 있는데 TreeSet과 같은 특성을 가지고 있음 
  - 범위검색, 정렬에 유리한 컬렉션 클래스
  - HashMap보다 데이터 삭제, 추가 시간이 더 걸림
- 해싱(Hashing) 기법으로 데이터를 저장. 데이터가 많아도 검색이 빠르다.
  - 해싱(Hashing)이랑 함수(Hash function)를 이용해서 해시테이블(hashtable)에 데이터를 저장하고 읽어 오는것
  - 해시테이블은 배열+링크드리스트 조합된 형태