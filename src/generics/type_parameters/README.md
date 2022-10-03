# 타입 매개변수의 제한
제네릭은 T와 같은 타입 변수를 사용해 타입을 제한한다.  
이때 **extends** 키워드를 사용하면, 타입 변수에 특정 타입만을 사용하도록 제한을 걸 수 있다.
```
public <E extends Character, N extends Number> void display(E element, N number) {
    ...
}
```