# Map

### Map 자료구조
- key와 value 쌍으로 이루어져 있다.
- key는 중복이 되지 않지만, value는 중복이 가능하다.
- key를 통해 value를 빠르게 찾을수 있다.
- value로 key를 찾기는 어렵다.


### Map의 메소드

|메소드명|	설명|	반환값|
|------|------|-------|
|get(키)	|키로 값을 얻어온다.|	Object: 값을 반환|
|toString()	|리스트 값을 [값, 값...]의 문자열 형태로 돌려준다.	|String
|put(키, 값)	|키와 값을 추가한다|	Object: 키가 이미 존재할 경우, 해당 키의 값을 반환
|putAll(맵)	|map을 통째로 추가한다.|	void
|containsKey(값)|	key가 있는지 확인	|boolean: 들어있는지 여부
|containsValue(값)|	value가 있는지 확인	|boolean: 들어있는지 여부
|remove(key)	|key에 해당하는 요소를 삭제한다.|	Object(제네릭 설정된 타입): 삭제된 값
|remove(key, value)|	key와 value에 해당하는 요소를 삭제한다.|	boolean: 삭제가 됐는지 여부
|clear()	|모든 요소 삭제	|void
|isEmpty()	|리스트가 비어있는지 확인|	boolean: 비었는지 여부
|keySet()	|key들을 모아서 Set 자료형으로 반환|	Set: key들의 set
|values()	|값들을 모아서 Collection 자료형으로 반환|	Collection: value들을 Collection으로 반환
|size()	|map의 크기	|int: map의 크기


## List<Map<String, Object>> 형식 출력
---

List<Map<String, Object>> resultMap = new ArrayList<Map<String, Object>>();<br>
for(Map<String, Object> map : resultMap){<br>
for(Map.Entry<String, Object> entry:map.entrySet()){<br>
        String key = entry.getKey();<br>
        Object value = entry.getValue();<br>
     System.out.println("key: " + key + " | value: " + value);<br>
}
