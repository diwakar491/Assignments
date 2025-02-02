package com.assignment4;

public class Q8MaxOccuring {
    public static void main(String[] args)
    {
        String str="example string with duplicates";
        int count;
        char[] ch=str.toCharArray();
        System.out.println("Maximum Occuring Characters in the String are:");
        for(int i=0;i<str.length();i++)
        {
            count=0;
            for(int j=i+1;j<str.length();j++)
            {
                if((ch[i]==ch[j])&&(ch[i]!=' '))
                {
                    count++;
                    ch[j]='0';
                }
            }
            if(count>1 && ch[i]!='0')
                System.out.print(ch[i] + " ");
        }
    }
}
