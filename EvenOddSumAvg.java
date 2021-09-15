package com.company;
class EvenOddSumAvg
{
    public static void main(String[] args)
    {
        int evensum=0;int oddsum=0;int evenavg=0; int oddavg=0; int evencount=0; int oddcount=0;
        for(int i=0; i<args.length; i++)
        {
            int n=Integer.parseInt(args[i]);
            if(n%2==0)
            {
                evensum=evensum+n;
                evencount++;
            }
            else
            {
                oddsum=oddsum+n;
                oddcount++;
            }
        }
        evenavg=evensum/evencount;
        oddavg=oddsum/oddcount;
        System.out.println("the sum of even numbers is "+evensum+" average of even numbers "+evenavg);
        System.out.println("the sum of odd numbers is "+oddsum+" average of odd numbers "+oddavg);

    }

}

