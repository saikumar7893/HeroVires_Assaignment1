import java.util.*;
public class UniqueNumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++);
        {
            a[i]=sc.nextInt();
        }
        Set<Integer>hs=new HashSet<>();
        for(int ele:a)
        {
            hs.add(ele);
        }
        System.out.println(hs);
    }
    
}
