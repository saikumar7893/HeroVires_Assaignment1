import java.util.*;
class MissingNumbers {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
           a[i]=sc.nextInt(); 
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            hm.put(a[i],1);
        }
        Arrays.sort(a);
        int max=a[a.length-1];
        for(int i=1;i<=max;i++)
        {
            if(hm.get(i)==null)
            System.out.println(i+" ");
        }


    }
}