# Comparable
- Comparable 인터페이스는 객체를 정렬할 때 사용되는 메서드인 compareTo() 메서드를 정의한다.
- 자바에서 같은 타입인 객체들을 서로 비교해야만 하는 클래스들은 모두 Comparable 인터페이스를 구현하고 있다.
- 따라서 Boolean을 제외한 래퍼 클래스와 String, Time, Date와 같은 클래스들의 객체들은 모두 정렬이 가능하다.
- 기본 정렬 순서는 오름차순이다.
- **즉, sort 및 reverse 메서드의 동작 기준은 커스터마이징한 compareTo 메서드의 값이며, 이를 베이스로 동작한다.**  
ex) -1, 0, 1