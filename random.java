package math;
import java.util.Scanner;
public class random{

	
	public static void main(String[] args){
		//TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
//		System.out.println(a);
		while(true){
			Scanner sc=new Scanner(System.in);
			System.out.println("���ɱ�����һ��һ�ٲ¸����֣�");
			
			int guess= sc.nextInt();
			if(guess>a){
				System.out.println("����һ�㣬�ٽ�����Ŷ");
			}else if(guess==a){
				System.out.println("�������Ȼ����");
				break;
			}else if(guess<a){
				System.out.println("С��һ�㣬����Ŭ����");
			}
		}
	
	}
	}