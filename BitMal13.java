class BitMal13{
static int minimumBitFlipToConvertBinaryNumber(int start,int goal){
	int x=start^goal;
	int count=0;
	while(x!=0){
		x=x & (x-1);
		count++;
	}
	return count;
}
public static void main(String[] args){
	System.out.println(minimumBitFlipToConvertBinaryNumber(10,7));
	System.out.println(minimumBitFlipToConvertBinaryNumber(3,4));
}	
}