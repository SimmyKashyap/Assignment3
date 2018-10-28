import java.util.Scanner;
class armstrong{  
  public static void main(String[] args)  {  
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number you want to check: ");
  int number=sc.nextInt();
    int c=0,reminder,temp;  
    temp=number;  
    while(number>0)  
    {  
    reminder=number%10;  
    number=number/10;  
    c=c+(reminder*reminder*reminder);  
    }  
    if(temp==c)  
    System.out.println("armstrong number");   
    else  
        System.out.println("Not armstrong number");   
   }  
} 