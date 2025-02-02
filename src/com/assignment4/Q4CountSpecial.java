package com.assignment4;

public class Q4CountSpecial {
    public static void main(String[] args)
    {
        int vCount=0,cCount=0,splChar=0;
        String str="Hello World! @2023 #Java";
        str=str.toLowerCase();
        int i;
        for(i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vCount++;
            }
            else if(ch>='a'&& ch<='z')
            {
                cCount++;
                //add special characters...
            } else if(ch == '#' || ch == ' ' || ch == '@') {
                splChar++;
            }
        }
        System.out.println("Number of vowels::"  +vCount);
        System.out.println("Number of consonants::"  +cCount);
        System.out.println("Number of special characters::"  +splChar);
    }
}
