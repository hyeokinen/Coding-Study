# 추상 클래스

자바에서 프로그래밍적으로 추상화는 공통된 행동, 필드를 묶어 하나의 클래스를 만드는 것을 의미합니다. 



## 추상 메소드
- 상속기반
- 부모 클래스에서는 구현하지 않고, 자식 클래스에서 반드시 구현해야 하는 메소드이다.

## 추상 클래스
- 추상 메소드가 하나라도 존재하는 클래스
- 일반 메소드도 존재할 수 있다.
- 추상 클래스로는 객체를 생성할 수 없다.
- 추상 클래스를 물려받은 자식 클래스만 객체 생성 가능(상속 문법은 클래스 상속과 동일함)<br>


*** 추상클래스는 객체화 할수 없다***

[ class 의 경우 ]

public     : 모든 패키지에서 이 클래스를 참조할 수 있다.
<br>
private    : 자신을 포함한 클래스에서만 참조가능
<br>
protected : 자신을 포함하는 클래스에서 상속받은 클래스에서도 참조가능
<br>
default    : 동일 패키지 내에서 이 클래스를 참조할 수 있다. 
<br>

<br>
[ 메소드의 경우 ]

public     : 이 클래스밖에서도 이 메소드를 참조할 수 있다.<br>
private    : 이 클래스내에서만 참조가능<br>
protected : 상속받은 클래스와 이 클래스내에서만 참조할 수 있다.<br>
default    : 동일 패키지 내에서만 참조할 수 있다.
