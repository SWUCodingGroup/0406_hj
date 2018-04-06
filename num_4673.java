//https://www.acmicpc.net/problem/4673

public class num_4673 {
	
	// �ð����⵵ O(n)
	
	public static void main(String[] args) {
		
		// ������ �迭 �ʱ�ȭ
		boolean ctor_arr[] = new boolean[10001];
			
		for(int i=0 ; i<ctor_arr.length; i++){
			ctor_arr[i]=false;
		}
				
		// ������ ���鼭 �������ִ� �������� ���� üũ
		for(int i=1; i<10000; i++){
		
			//������ ����� 10000�� �Ѿ�� ����
			if(self_num(i)>10000){
				continue;
			}
			
			// �������ִ� ���� ��° �迭�� true ǥ�� <- �̸� ���߿� �Ʒ� for������ ���͸�
			ctor_arr[self_num(i)]=true; 
		}
		
		// ������ ���� ����, �� �����ѹ��� ����
		for(int i=1; i<=10000; i++){
			if(ctor_arr[i]==false){
				System.out.println(i);
			}
		}

	}
	
	//�˻��� ���ڸ� ���ڷ� �־� �����ڰ� �ִ� ���ڸ� ��ȯ�Ѵ�.
	static int self_num(int num){ 

		// Ex) 4321
		int result = num; //4321 
		result += (num/1000)%10; //4 ����
		result += (num/100)%10 ; //3 ����
		result += (num/10)%10; //2 ����
		result += num%10; //1 ����
		
		return result;
		
	}
	
	

}
