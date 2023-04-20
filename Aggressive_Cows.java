import java.util.*;   
public class Aggressive_Cows {
    public static void main(String[] args) {
        Scanner yashu= new Scanner(System.in);
		int t=yashu.nextInt();
		while(t-->0) {       // spoj website question aggressive cows
			int n=yashu.nextInt();  // 5
			int c=yashu.nextInt();  //3
			int[] arr=new int[n];  //[2,4,1,8,9]
			for(int i=0;i<n;i++) {
				arr[i]=yashu.nextInt();
			}
			Arrays.sort(arr);
			System.out.println(MaxDistance(arr,c));  // ans---3
		}
	
	}
	public static int MaxDistance(int[] arr,int c) {
		int low=arr[0];
		int high=arr[arr.length-1];
		int ans=0;
		while(low<=high) {
			int mid=(low+high)/2;
			if(ispossible(arr,c,mid)) {
				ans=mid;
				low=mid+1;
				
			}
			else {
				high=mid-1;
			}
			
		}
		return ans;
		
	}
	public static boolean ispossible(int[] arr,int c,int mid) {
        int pos=arr[0];
		int count=1;
		for(int i=1;i<arr.length;i++) {	
			if(arr[i]-pos>=mid) {
				count++;
				pos=arr[i];
			}
			if(count>=c) return true;
		}
		
		return false;

    }
}
