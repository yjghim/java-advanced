# 타입 매개변수의 제한
제네릭은 T와 같은 타입 변수를 사용해 타입을 제한한다.  
이때 **extends** 키워드를 사용하면, 타입 변수에 특정 타입만을 사용하도록 제한을 걸 수 있다.
```
public <E extends Character, N extends Number> void display(E element, N number) {
    ...
}
```
- **E extends Character**  
Character 타입과 Character 타입을 상속받는 자손 클래스 타입만을 사용할 수 있음
- **N extends Number**  
Number 타입과 Number 타입을 상속받는 자손 클래스 타입만을 사용할 수 있음
