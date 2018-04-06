//https://www.acmicpc.net/problem/1152

import java.util.Scanner;

public class num_1152 {

	
	public static void main(String args[]){
		
		Scanner stdin = new Scanner(System.in);
		System.out.println("�˻��Ͻ� ������ �Է����ּ��� : ");
		
		//stdin.next()�� �ϰԵǸ� ������ �������� �տ� ���ڿ��� �޾ƿ��� ������ nextLine()���� �޾ƿ;� �Ѵ�.
		String put_str = stdin.nextLine();
		
		//���� �� üũ
		if(put_str.length()>1000000){
			System.out.println("<���> 1,000,000 ���ڸ� �ʰ��� �� �����ϴ�.");
			return;
		}
		
		System.out.println("\n ==> �ܾ��� ������ ["+ word_counter(put_str) + "]�� �Դϴ�.");
		
	}
	
	
	//�ܾ� ī��Ʈ �޼ҵ� (���� + 1 �� �ܾ� ����)
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
