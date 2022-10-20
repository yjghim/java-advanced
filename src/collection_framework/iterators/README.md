## Iterator
- **컬렉션에 저장된 요소 데이터를 읽어오는 방법을 표준화한 인터페이스이다.**
- Iterator 인터페이스는 컬렉션의 요소에 접근할 때 한 방향으로만 이동할 수 있다.

## ListIterator
- ListIterator 인터페이스는 Iterator 인터페이스를 상속받아 여러 기능을 추가한 인터페이스이다.
- ListIterator 인터페이스는 컬렉션 요소의 대체, 추가 그리고 인덱스 검색 등을 위한 작업에서 **양방향으로** 이동하는 것을 지원한다.
- 단, ListIterator 인터페이스는 List 인터페이스를 구현한 List 컬렉션 클래스에서만 listIterator() 메소드를 통해 사용할 수 있다.

## 그렇다면, Map은 어떻게 Iterator를 사용해야할까?
List와 Set은 Iterator를 통해 value를 순회할 수 있다. 그렇다면, Key와 Value를 쌍으로 가지는 Map은 어떻게 Iterator를 사용할 수 있을까?
- Map은 Iterator를 바로 사용할 수는 없다.
- 대신, keySet(), values(), entrySet() 메서드를 통해 키와 값, 혹은 엔트리 인터페이스타입 및 Set 형태로 컬렉션을 받아온 후, 여기서 iterator() 호출로 Iterator를 얻을 수 있다.