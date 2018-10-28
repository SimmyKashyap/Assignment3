import java.util.Scanner;
class even{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number=sc.nextInt();
		System.out.println("Even numbers till "+number+" :");
		for(int i=1;i<=number;i++){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
		}
}