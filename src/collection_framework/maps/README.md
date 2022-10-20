# Map
Key와 Value의 쌍으로 이루어진 데이터 집합으로, 순서가 없음  
Key는 중복을 허용하지 않으며, Value는 중복을 허용한다.  
`HashMap` `TreeMap`

## 1. HashMap
- Map 컬렉션 클래스 중 가장 많이 사용되는 클래스  
  해시 알고리즘을 사용하여 매우 빠른 검색 작업이 가능하다.
- 중복된 Key로는 값을 저장할 수 없다.
- 같은 값을 다른 키로 저장하는 것은 가능

## 2. TreeMap
- TreeMap 클래스는 키와 값을 한 쌍으로 하는 데이터를 이진 검색 트리(Binary Search Tree) 형태로 저장한다.  
- 데이터가 Key를 기준으로 정렬된 상태로 저장된다.
- 마찬가지로, 중복된 Key로는 값을 저장할 수 없다.