### 큐
큐란?
사전적 의미로는 줄을 서서 기다리는것을 의미한다. 은행에서 먼저 온 사람의 업무를 창구에서 처리하는 것과 같다.

스택과 마찬가지로 데이터를 일시적으로 쌓아 놓은 자료구조 이다.
스택은 FIFO 선입선출 즉 가장 먼저 넣은 데이터를 가장 먼저 꺼내는 점이 스택과 다르다.

데이터를 넣는 작업으르 인큐, 꺼내는 작업을 디큐라고 한다.
데이터가 나가는 쪽을 프론트 넣는 쪽을 리어라고 한다.

큐에 인큐후에 디큐를 하면 앞에 저장된 값을 삭제하고 뒤에 값들을 앞으로 가져와야하는 처리 복잡도가 O(n)으로 비효율적입니다.
그래서 링 버퍼를 통해서 배열 요소를 앞쪽으로 옮기지 않는 큐를 구현할수 있습니다.


###switch문법

***문법***
switch(변수){
    case 값1 : 
        실행문; 
        break;
    case 값2 : 
        실행문; 
        break;  
    default :
        실행문;    
}

***예제***
#include
int main(){
 int score = 80;
 
 switch(score/10){
 	case 9 :
 		printf("A등급입니다.");
 		break;
 	case 8 :
 		printf("B등급입니다.");
 		break;
 	case 7 :
 		printf("C등급입니다.");
 		break;
 	case 6 :
 		printf("D등급입니다.");
 		break;
 	default :
 		printf("F등급입니다."); 
 }
}


### try-catch

***문법***
try {

//예외발생할 가능성이 있는 문장 
    
}catch(Exception1 e1) {

 //Exception1이 발생했을 경우, 이를 처리하지 위한 문장적는다.
 //보통 이곳에 예외메세지를 출력하고 로그로 남김.
 
}catch(Exception2 e2) {

 //Exception2이 발생했을 경우, 이를 처리하지 위한 문장적는다.
 
}catch(ExceptionN eN) {

 //ExceptionN이 발생했을 경우, 이를 처리하지 위한 문장적는다.
 
}finally{

//예외발생여부에 관계없이 상항 수행되어야 하는 문장적는다.

}
출처: https://cheershennah.tistory.com/147 [Today I Learned. @cheers_hena 치얼스헤나:티스토리]