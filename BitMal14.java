//Important !!!!!!!!!!!!!!!!!!!!!!!

//PowerSet !!!
import java.util.*;
class BitMal14{
	static ArrayList<ArrayList<Integer>> powerSet(int nums[],int n){
		ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
		for(int num=0;num<=Math.pow(2,n)-1;num++){
			ArrayList<Integer> list=new ArrayList<>();
			for(int i=0;i<=n-1;i++){
				if((num & (1<<i))>0){
					list.add(nums[i]);
				}
				}
				ans.add(list);
		}
		return ans;
	}
	public static void main(String[] args){
		int nums[]={1,2,3};
		ArrayList<ArrayList<Integer>> ans=powerSet(nums,nums.length);
		for(ArrayList a:ans){
			System.out.println(a);
		}
	}
}