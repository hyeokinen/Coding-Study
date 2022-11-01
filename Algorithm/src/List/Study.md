# 콜렉션 자료구조와 리스트

## 리스트 자료구조

- 배열처럼 같은 자료형의 묶음 자료구조
- 기본 자료형 타입은 저장할 수 없고, 객체만 담을 수 있다.
- 크기가 고정되어 있지 않고, 동적으로 할당된다.
- 중간에 있는 값을 빼내면 앞으로 당겨진다.
- 타입 안정성을 보장하는 generic을 쓸 수 있다.
  - List<Integer> numbers = new ArrayList<>();
  - 위의 코드는 List에 Integer 타입의 값들만 넣을수 있다.

## 자주 사용하는 리스트의 종류

1. ArrayList
    - 배열과 유사하다.
    - 내부적으로는 데이터를 배열에서 관리한다.
    - 많은 양의 데이터를 추가/삭제 하는 경우 느리다.
    - index로 접근하므로 검색 속도는 빠르다.
    - 순차적 데이터에 좋다.

2. LinkedList
    - 기차처럼 Node로 연결되어 있으며 각 노드는 다음 노드가 무엇인지 가리킨다.
    - 검색시 속도가 느리다.(모든 요소를 탐색해야 하기 때문)
    - 비순차적 데이터에 좋다.


|메소드명|설명|반환값|
|------|----|-----|
|toString()|리스트 값을 [값, 값...]의 문자열 형태로 돌려준다.|	String|
|add(값)	|값을 추가한다	|boolean: add가 성공했는지 여부|
|addAll(콜렉션)|	Collection을 통째로 추가한다.|	boolean: add가 성공했는지 여부|
|contains(값)|	리스트에 값이 들어있는지 확인	|boolean: 들어있는지 여부|
|remove(index)	|index 위치의 요소를 삭제한다.	|Object(제네릭 설정된 타입): 삭제된 값|
|remove(값)	|(값이 숫자가 아닌 경우)값으로 삭제한다.|	boolean: 삭제가 됐는지 여부|
|clear()	|모든 요소 삭제|	void|
|set(index, 값)	|index 위치의 값을 변경한다.|	Object(제네릭 설정된 타입)기존에 있던 값|
|sort(Comparator.naturalOrder())|오름차순으로 정렬	|void|
|sort(Comparator.reverseOrder())|	내림차순으로 정렬|	void|
|isEmpty()	|리스트가 비어있는지 확인	|boolean: 비었는지 여부|
|size()	|리스트의 크기	|int: 리스트의 크기|