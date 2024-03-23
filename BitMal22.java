class BitMal22{
	static int [] SingleIII(int nums[]){
		int x[]=new int[2];
		long xor=0;
		for(int i=0;i<nums.length;i++){
			xor=xor^nums[i];
		}
		long rightmost=(xor & (xor-1)) ^ xor;
		int b1=0,b2=0;         //two bucket 
		for(int i=0;i<nums.length;i++){
			if((nums[i] & rightmost) != 0){
				b1=b1^nums[i];
			}
			else b2=b2^nums[i];
		}
		x[0]=b1;
		x[1]=b2;
		return x;
	} 
	
	public static void main(String[] args){
		int arr[]={1,5,2,4,6,2,5,4};
		int ans[]=SingleIII(arr);
		for(int i:ans){
			System.out.println(i);
		}
	}
}