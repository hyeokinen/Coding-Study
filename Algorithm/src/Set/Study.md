# Set

Set이란 데이터 자료구조 중에 하나로 특정한 값들을 저장하는 추상자료형 이다.
이때 값들은 순서가 존재하지 않으며 중복되지 않는다.

### Set 자료구조
- 수학에서의 집합과 같다.
- 중복이 되지 않는다.
- 순서가 없다.
- 따라서 index가 없다.

----------

### 자주 사용하는 Set의 종류

***HashSet***
- 일반적으로는 HashSet을 사용한다.(Iterator에 hashnex의 경우 리스트안에 값의 유무 판단하는것)
- 집합 연산과 같다.


***TreeSet***
- 값을 정렬한다.
- 그래서 HashSet보다 상대적으로 느리다.


### Set의 메소드

|메소드명|설명|반환값|
|-----|------|------|
|toString()|	리스트 값을 [값, 값...]의 문자열 형태로 돌려준다.|	String|
|add(값)|	값을 추가한다	|boolean: add가 성공했는지 여부|
|addAll(콜렉션)|	Collection을 통째로 추가한다.|	boolean: add가 성공했는지 여부|
|contains(값)|	리스트에 값이 들어있는지 확인	|boolean: 들어있는지 여부|
|remove(값)	|(값이 숫자가 아닌 경우)값으로 삭제한다.|	boolean: 삭제가 됐는지 여부|
|clear()|	모든 요소 삭제	|void|
|isEmpty()|	리스트가 비어있는지 확인	|boolean: 비었는지 여부|
|size()|	Set의 크기|	int: set의 크기
|retainAll(콜렉션)|	두 콜렉션에서 같은 것만 남긴다.|	boolean: 성공한지 여부

<br>

![collection이란?](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2Ft8sQk%2Fbtq6WifU6ly%2FdGiXkfOlXPmkZkIkIgueI0%2Fimg.png "collection설명")

자바에서 Iterator는 컬렉션 프레임워크(Collection Framework)에서 값을 가져오거나 삭제할 때 사용하는데

먼저 컬렉션 프레임워크는 List, Set, Map, Queue 등을 말한다.
 

다음으로 컬렉션 프레임워크를 생성한 뒤

Iterator<데이터타입> iterator명 = 컬렉션.iterator();

이렇게 사용하게 된다.

list.get(값); 이런 식으로 가져올 수 있는데 직접 꺼내올 수 없는 Set이 아니라면야
사용 이유가 있나? 뭣하러 쓰나 싶겠지만

Iterator를 사용할 시 얻는 장점은 다음과 같다

Iterator는 모든 컬렉션 프레임워크에 공통으로 사용 가능 컬렉션 프레임워크에서 쉽게 값을 가져오고 제거할 수 있음

3개의 메소드만 알면 되어서 사용하기 매우 쉽다


<code>
Iterator<String> iterList = list.iterator();<br>
Iterator<String> iterSet = set.iterator();<br>
Iterator<String> iterMap = map.keySet().iterator();
</code>