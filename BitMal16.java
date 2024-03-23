//Single I

//Single number find out between pairs of two number 
import java.util.*;

class BitMal16{
	static int singleInDoubleElement(int nums[]){
		int xor=0;
		for(int i=0;i<nums.length;i++){
			xor=xor^nums[i];
			}
		return xor;
	}
	public static void main(String[] args){
	int arr[]={1,3,1,5,3,6,6};
	System.out.println(singleInDoubleElement(arr));
	}
}