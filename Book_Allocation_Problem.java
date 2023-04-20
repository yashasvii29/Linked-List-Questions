import java.util.*;
public class Book_Allocation_Problem {
    public static void main(String[] args) {
        Scanner yashu=new Scanner(System.in);
        int t=yashu.nextInt();
        while(t-->0) {
            int nob = yashu.nextInt(); //no.of books
            int nos = yashu.nextInt(); //no.of students
            int[] book = new int[nob];
            for (int i = 0; i < book.length; i++) {
                book[i] = yashu.nextInt();
            }
            // input-1
            // 4 2
            //12 34 67 90

            System.out.println(minimumpage(book, nos));
        }
    }
    public static int minimumpage(int[] book,int nos){
        int lo=0;
        int hi=0;
        for(int val:book){
            hi=hi+val;
        }
        int ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(isitpossible(book,nos,mid)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public static boolean isitpossible(int[] book,int nos,int mid){
        int student=1;
        int readpage=0;
        int i=0;
        while(i< book.length){
            if(readpage+book[i]<=mid){
                readpage+=book[i];
                i++;
            }
            else{
                student++;
                readpage=0;
            }
            if(student>nos){
                return false;
            }
        }
        return true;
    }
}
