package Strings;

import java.util.Arrays;

public class AnagramString {

    public static void main(String[] args){
        String str = "abcdefgh";
        String str1 = "bcdfegha";
        char s1[]= new char[256];
        char s2[] = new char[256];
        s1=str.toCharArray();
        s2=str1.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(Arrays.equals(s1, s2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }

    }
}
