//https://www.acmicpc.net/problem/4673

public class num_4673 {
	
	// 시간복잡도 O(n)
	
	public static void main(String[] args) {
		
		// 생성자 배열 초기화
		boolean ctor_arr[] = new boolean[10001];
			
		for(int i=0 ; i<ctor_arr.length; i++){
			ctor_arr[i]=false;
		}
				
		// 루프를 돌면서 생성자있는 숫자인지 여부 체크
		for(int i=1; i<10000; i++){
		
			//생성자 결과가 10000이 넘어가면 점프
			if(self_num(i)>10000){
				continue;
			}
			
			// 생성자있는 숫자 번째 배열에 true 표시 <- 이를 나중에 아래 for문에서 필터링
			ctor_arr[self_num(i)]=true; 
		}
		
		// 생성자 없는 숫자, 즉 셀프넘버를 추출
		for(int i=1; i<=10000; i++){
			if(ctor_arr[i]==false){
				System.out.println(i);
			}
		}

	}
	
	//검사할 숫자를 인자로 넣어 생성자가 있는 숫자를 반환한다.
	static int self_num(int num){ 

		// Ex) 4321
		int result = num; //4321 
		result += (num/1000)%10; //4 추출
		result += (num/100)%10 ; //3 추출
		result += (num/10)%10; //2 추출
		result += num%10; //1 추출
		
		return result;
		
	}
	
	

}
