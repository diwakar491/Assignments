package com.assignment4;

public class Q1RemoveStringDups {
    public static void main(String[] args)
    {
        String str="RemoveDuplicates";
        System.out.println("String:"  +str);
        String str1=" ";

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(str1.indexOf(ch)==-1)
            {
                str1=str1+ch;

            }
        }
        System.out.println("NewString:"  +str1);
    }
}
