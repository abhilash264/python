import java.util.*;
public class Solution {
    static long maxPower(int []a, int []b) {
        int sum=0;
        Arrays.sort(a);
        int start=0;
        int stop=a.length-1;
        while(start<stop)
        {
            int temp=a[start];
            a[start]=a[stop];
            a[stop]=temp;
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<=i;j++)
            {
                sum+=a[i]*b[j];
            }
        }
       return sum;
    }
}