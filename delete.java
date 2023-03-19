import java.util.Scanner;
public class delete {
    public static void main(String[] args){
        int n,i,j,t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=1;i<n;i++)
        {
            t=a[i];
            j=i-1;
            while(t<a[j] && j>=0)
            {
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=t;
        }
        
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}

