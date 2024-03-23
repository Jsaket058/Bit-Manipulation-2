import java.util.*;

class BitMal19{
	static int singleFromSetOfThree(int nums[]){
		int ans=0;
		for(int bitIndex=0;bitIndex<32;bitIndex++){
			int curr=0;
		    for(int num:nums){
				curr+=num>>bitIndex & 1;
			}
		curr=curr%3;
		ans = ans | curr<<bitIndex;
	}	
	return ans;	
	}
	public static void main(String[] args){
	int arr[]={1,3,1,5,1,3,6,3,6,6};
	System.out.println(singleFromSetOfThree(arr));
	}
}