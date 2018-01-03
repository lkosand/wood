package math;
import java.util.Scanner;
public class random{

	
	public static void main(String[] args){
		//TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
//		System.out.println(a);
		while(true){
			Scanner sc=new Scanner(System.in);
			System.out.println("来吧宝贝，一到一百猜个数字：");
			
			int guess= sc.nextInt();
			if(guess>a){
				System.out.println("大了一点，再接再厉哦");
			}else if(guess==a){
				System.out.println("不错嘛，居然对了");
				break;
			}else if(guess<a){
				System.out.println("小了一点，继续努力哈");
			}
		}
	
	}
	}