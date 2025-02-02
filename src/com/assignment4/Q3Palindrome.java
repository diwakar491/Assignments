package com.assignment4;

public class Q3Palindrome {
    public static void main(String[] args)
    {
        int r,temp;
        int sum=0;
        int n=2552;
        System.out.println("Given palindrome number is::"  +n);
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("number is not Palindrome");
        }
    }
}
