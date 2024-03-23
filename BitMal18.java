//Single II

//Get Single element from a set of three element present in the array
import java.util.*;

class BitMal18{
    static int singleFromSetOfThree(int nums[]){
		Arrays.sort(nums);
		for(int i=1;i<nums.length;i+=3){
			if(nums[i]!=nums[i-1])return nums[i-1];
		}
		return nums[nums.length-1];
	}
	public static void main(String[] args){
	int arr[]={1,3,1,5,1,3,6,3,6,6};
	System.out.println(singleFromSetOfThree(arr));	
	}
}