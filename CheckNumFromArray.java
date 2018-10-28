import java.util.Scanner;
class CheckNumFromArray{
	public static void main(String[] args){
		System.out.println("Enter the number you want to check: ");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		boolean ans=false;
		int A[] = {1,4,6,7,8,9,10};
		for(int i=0;i<A.length;i++){
			if(number==A[i]){
				System.out.println("it is present in the array ");
				ans=true;
				break;
			}
		}
		if(ans==false){
			System.out.println("it is not present in the array" );
			
		}
	}
}