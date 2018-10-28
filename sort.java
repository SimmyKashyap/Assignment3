class sort{
	public static void main(String[] args){
	int	A[] = {1,1,1,1,0,0,1,0};
	int temp=0;
	for(int i=0;i<A.length;i++){
		for(int j=i+1;j<A.length;j++){
			if(A[i]>A[j]){
				temp=A[i];
				A[i]=A[j];
				A[j]=temp;
			}
		}
	}
	for(int i=0;i<A.length;i++){
		System.out.print(A[i]+" ");
	}
	}
}