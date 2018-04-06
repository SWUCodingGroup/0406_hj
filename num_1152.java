//https://www.acmicpc.net/problem/1152

import java.util.Scanner;

public class num_1152 {

	
	public static void main(String args[]){
		
		Scanner stdin = new Scanner(System.in);
		System.out.println("검사하실 문장을 입력해주세요 : ");
		
		//stdin.next()를 하게되면 공백을 기준으로 앞에 문자열만 받아오기 때문에 nextLine()으로 받아와야 한다.
		String put_str = stdin.nextLine();
		
		//글자 수 체크
		if(put_str.length()>1000000){
			System.out.println("<경고> 1,000,000 글자를 초과할 수 없습니다.");
			return;
		}
		
		System.out.println("\n ==> 단어의 개수는 ["+ word_counter(put_str) + "]개 입니다.");
		
	}
	
	
	//단어 카운트 메소드 (공백 + 1 이 단어 개수)
	private static int word_counter(String put_str){
		
		char arr[] = new char[put_str.length()];
		arr = put_str.toCharArray();
		
		int blanks = 0;
		for(int i=1; i<arr.length; i++){
			if(arr[i]==' '){
				blanks++;
			}
		}
		
		return blanks+1;
	}
}
