//https://www.acmicpc.net/problem/11654

import java.util.Scanner;

public class num_11654 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		while(true){
			
			System.out.print("�ƽ�Ű�ڵ�� ��ȯ�� ���ĺ�/����(0-9) �Է� : ");
			String put_str = stdin.next();
			
			if(put_str.equals("!")){
				System.out.print("\n���α׷��� ���� �����մϴ�.");
				break;				
			}
			
			System.out.println(" ==> �ƽ�Ű�ڵ� : " + (int)put_str.charAt(0) + "\n");
			System.out.println("���Ḧ ���Ͻø� ���� '!'�� �Է����ּ���.");
			
		}

	}

}
