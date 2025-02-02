package com.assignment4;

public class Q5Anagram {
    public static void main(String[] args)
    {
        String str1="listen";
        String str2="silent";
        int len1=str1.length();
        int len2=str2.length();
        if(len1!=len2)
        {
            System.out.println("Strings are not Anagram");
        }
        else
        {
            char[] ch1=str1.toCharArray();
            char[] ch2=str2.toCharArray();
            for(int i=0;i<len1;i++)
            {
                for(int j=0;j<len2;j++)
                {
                    if(ch1[i]>ch1[j])
                    {
                        char temp=ch1[i];
                        ch1[i]=ch1[j];
                        ch1[j]=temp;
                    }
                    if(ch2[i]>ch2[j])
                    {
                        char temp=ch2[i];
                        ch2[i]=ch2[j];
                        ch2[j]=temp;
                    }
                }
            }
            String str3=new String(ch1);
            String str4=new String(ch2);
            if(str3.equals(str4))
            {
                System.out.println("Strings are Anagram");
            }
            else
            {
                System.out.println("Strings are not Anagram");
            }
        }
    }
}
