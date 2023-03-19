import java.util.Scanner;
class insert
{
    public static void main(String[] args){
    int n,i,j,loc,t;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size");
    n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter elements");
    for(i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    for(i=0;i<n-1;i++)
    {
        loc=i;
        for(j=i+1;j<n;j++)
        {
            if(a[j]<a[loc])
            {
                loc=j;
            }
        }
        t=a[i];
        a[i]=a[loc];
        a[loc]=t;
    }
    for(i=0;i<n;i++)
    {
        System.out.print(a[i]+" ");
    }
}

}