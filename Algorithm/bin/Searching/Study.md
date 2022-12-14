# 검색
## 1. 검색 알고리즘
*********

**검색과 키**
데이터 집합에서 원하는 값을 가진 요소를 찾아내는 검색 알고리즘에 대해 살표보겠다.

어떤 검색을 하게 되면 특정 항목에 주목한다는 점은 '검색하기'의 공통점이다.
여기서 주목하는 항목을 키(key)라고 한다.
국적을 검색하는 경우 국적이 키이고, 나이를 검색하는 경우 나이가 키이다.
즉, 키는 데이터의 일부이다.

***배열에서 검색하기***
검색에는 다양한 방법이 있다.
1. 배열검색
2. 선형 리스트 검색
3. 이진검색트리 검색

지금은 배열검색에 대해 공부를 하겠다.

배열검색은 **선형 검색, 이진 검색, 해시법** 의 알고리즘은 사용한다.
1. 선형검색: 무작위로 늘어놓은 데이터 모임에서 검색을 수행한다.
2. 이진검색: 일정한 규칙으로 늘어놓은 데이터 모임에서 아주 빠른 검색을 수행한다.
3. 추가, 삭제가 자주 일어나는 데이터 모임에서 아주 빠른 검색을 수행한다.
   > 체인법: 같은 해시 값의 데이터를 선형 리스트로 연결하는 방법
   > 오픈 주소법: 데이터를 위한 해시 값이 충돌할 때 재해시하는 방법

검색 알고리즘을 선택 하는 이유는 데이터의 추가 비용이 많이 들어가기 때문에 본인에게 맞는 알고리즘을 선택해야 한다.

## 2. 선형 검색

요소가 직선 모양으로 늘어선 배열에서의 검색은 원하는 키 값을 갖는 요소를 만날 때까지 맨 앞부터 순서대로 요소를 검색한다.
배열을 선언했을때 각각 인덱스 마다 값이 들어가고 그 값을 순차적으로 열차의 칸을 들여본다고 생각하면 된다.

