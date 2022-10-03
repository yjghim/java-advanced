# 제네릭(Generic)
제네릭이란 데이터 타입을 일반화(generalize)하는 것을 의미한다.  
클래스나 메서드 내에서 사용할 데이터 타입을 **컴파일 시**에 지정하도록 하여, 특정 타입에 얽매이지 않고 개발을 할 수 있도록 도와준다.  
**즉, 특정 클래스 내부에서 사용할 데이터 타입을 객체가 생성될 시점에 확정짓는다.**

## 제네릭의 장점
- **타입 안정성**  
컴파일 타임에 타입을 체크하므로, 개발자가 의도하지 않은 타입의 객체가 저장되는 것을 방지하며 객체를 가져올 때의 캐스팅 오류 또한 줄일 수 있다.
- **형 변환의 번거로움 감소**  
타입 캐스팅을 할 필요 없이, 사용할 객체의 타입을 사전에 명시하기만 하면 된다.  
[Object 클래스를 사용한 경우](https://github.com/yjghim/java-advanced/blob/master/src/generics/basic_concept/no_use/App.java)

## 사용시 주의할 점
- **클래스와 인터페이스만 적용**  
기본 타입(Primitive Type)은 제네릭을 적용할 수 없다.

## 타입 매개변수의 Naming Convention
- **E(Element)**  
요소 `List<E>`
- **K(Key)**  
키 `Map<K, V>`
- **N(Number)**  
숫자
- **T(Type)**  
타입
- **V(Value)**  
리턴 값 or 매핑된 값
- **S, U, V**  
2번째, 3번째, 4번째에 선언된 타입

## 제네릭의 제거 시기  
코드에서 선언되고 사용된 제네릭 타입은 컴파일 시 컴파일러에 의해 자동으로 검사되어 타입 변환된다.  
이후 코드 내의 모든 제네릭 타입은 제거되어, 컴파일된 class 파일에는 어떠한 제네릭 타입도 포함되지 않는다.

## advanced
- [타입 매개변수의 제한](https://github.com/yjghim/java-advanced/tree/master/src/generics/type_parameters)
- [와일드 카드](https://github.com/yjghim/java-advanced/tree/master/src/generics/wild_card)