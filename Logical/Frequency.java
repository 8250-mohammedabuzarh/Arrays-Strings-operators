package Logical;

public class Frequency {
    public static void main(String[] abc){
        int[] ar1 = {1,1,2,3};
        int[] freq = new int[ar1.length];
        int visited =-1;
        for(int i=0;i<=ar1.length-1;i++)
        {
            int count =1;
            for(int j = i+1;j<= ar1.length-1;j++)
            {
                if(ar1[i]==ar1[j])
                {
                    count++;
                    freq[j]=visited;
                }
            }
            if(freq[i]!=visited)
            {
                freq[i]=count;
            }

        }
        for(int i=0;i<=freq.length-1;i++)
        {
            if(freq[i]!=visited)
            {
                System.out.println("frequency of "+ar1[i]+" is: "+freq[i]);
            }
        }
    }
}
