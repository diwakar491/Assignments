package com.assignment4;

public class Q6Panagram {
    public static void main(String[] args)
    {
        String str="The quick brown fox jumps over the lazy dog";
        boolean[] mark=new boolean[26];
        int index=0;
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            if('A'<=str.charAt(i) && str.charAt(i)<='Z')
            {
                index=str.charAt(i)-'A';
            }
            else if('a'<=str.charAt(i) && str.charAt(i)<='z')
            {
                index=str.charAt(i)-'a';
            }
            mark[index]=true;
        }
        for(int i=0;i<26;i++)
        {
            if(mark[i]==false)
            {
                System.out.println("String is not Panagram");
                return;
            }
        }
        System.out.println("String is Panagram");
    }

}
