# Equals and Hash code

## 판단 순서
1. **HashCode() 값 비교**  
- 다르면, 두 객체는 서로 다른 객체
- 같으면, 두 객체는 서로 다르거나 같은 객체
2. **Equals() 확인**  
- 다르면, 두 객체는 서로 다른 객체
- 같으면, 두 객체는 서로 같은 객체

## Tip
단, 서로 다른 객체의 경우에 Hash code 값을 다르게 설정하는 것이 HashMap 등에서 성능 향상 효과가 있다.