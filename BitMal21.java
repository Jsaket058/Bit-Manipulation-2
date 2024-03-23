import java.util.*;

class BitMal21{
    static ArrayList<Integer> singleOccurence(int nums[]){
	ArrayList<Integer> ans=new ArrayList<>();
	HashMap<Integer,Integer> mpp=new HashMap<>();
	for(int i=0;i<nums.length;i++){
		mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
	}
	for(Integer it:mpp.keySet()){
			if(mpp.get(it)==1)ans.add(it.intValue());
		}
	return ans;	
    }
public static void main(String[] args){
	int arr[]={2,5,4,3,2,9,5,6,9,4};
	ArrayList<Integer> ans=singleOccurence(arr);
    System.out.println(ans);
}	
}