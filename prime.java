import java.util.Scanner;
class prime{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number=sc.nextInt();
		int count=0;
		System.out.println("Prime numbers till "+number+" :");
		for(int i=2;i<=number;i++){
			count=0;
			for(int j=1;j<=i;j++){
				if(i%j==0){
					count++;
				}
			}
			if(count==2){
				System.out.print(i+" ");
			}
		}
			
			
		}
		}