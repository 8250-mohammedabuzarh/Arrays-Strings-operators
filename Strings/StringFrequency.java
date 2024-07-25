package Strings;

public class StringFrequency {
    public static void main(String[] abc){
        String str = "abuzar";
        char[] ch = new char[str.length()];
        ch = str.toCharArray();
        int freq[] = new int[str.length()];
        int visited =-1;
        for(int i=0;i<=ch.length-1;i++)
        {
            int count =1;
            for(int j = i+1;j<= ch.length-1;j++)
            {
                if(ch[i]==ch[j])
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
                System.out.println("frequency of "+ch[i]+" is: "+freq[i]);
            }
        }

    }
}
