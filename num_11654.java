//https://www.acmicpc.net/problem/11654

import java.util.Scanner;

public class num_11654 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		while(true){
			
			System.out.print("아스키코드로 변환할 알파벳/숫자(0-9) 입력 : ");
			String put_str = stdin.next();
			
			if(put_str.equals("!")){
				System.out.print("\n프로그램을 정상 종료합니다.");
				break;				
			}
			
			System.out.println(" ==> 아스키코드 : " + (int)put_str.charAt(0) + "\n");
			System.out.println("종료를 원하시면 문자 '!'를 입력해주세요.");
			
		}

	}

}
