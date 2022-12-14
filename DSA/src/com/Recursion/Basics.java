package com.Recursion;


public class Basics {

    public static void printIncrease(int N) {
        if (N == 0) {
            return;
        }
        printIncrease(N-1);
        System.out.println(N);
    }

    public static void printDec(int N) {
        if(N == 0) {
            return ;
        }
        System.out.println(N);
        printDec(N-1);
    }

     // substring will have the start && end contineus part of an array
     //Ass: for Given character array check & return the substring is pallindrome
    public static boolean isPallindrome(char[] ch, int start, int end) {
        //Base condition 
        if (start > end) {
            return true;
        }
        //Main logic
        //start ans last character are same and the inner part has to be same as well
        if(ch[start] == ch[end] && isPallindrome(ch, ++start, --end)) { //Don't use post increament operator here
            return true;
        } else {
            return false;
        }
    }

    //Ass: Given N, the function will return the sum of digit
    public static int sumDigit(int N) {
        //Base condition
        if(N == 0) {
            return 0;
        }
        //Main logic
        //extract last digit N%10
        //added to the reminig digit N/10;
        return sumDigit(N/10) + N%10;
    }

    //Ass: Given a, n calculate the pow and return
    public static int pow(int a, int N) {
        //Base condition
        //power can be 0 
        if(N == 0) {
            return 1;
        }
        //Maint logic 
       int pow =  pow(a, N-1) * a; //power for smaller instance ans multilpy with number itself
       return pow;
    }

    public static int fpPow(int a, int N) {
        //base condition
        if(N == 0){
            return 1;
        }
        int pow = fpPow(a, N/2); // a^N/2
        //main logic - calculate pow
        if(N%2 == 0) { //even
            //return fpPow(a, N/2) * fpPow(a, N/2);
            return (pow*pow);
        } else {
            //return fpPow(a, N/2) * fpPow(a, N/2) * a;
            return (pow*pow*a);
        }
    }

    //If inside the question it is given to take the modulous
    //Fast exponentition  --> Reason Time compexity O(long2N) (log N base 2)
    public static int powMod(int a, int N, int m) {
        if(N == 0) {
            return 1;
        }
        long pow = powMod(a, N/2, m);

        if(N%2 == 0) {
            return ((int)(pow * pow) % m);
        } else {
            return  (int)(((pow * pow) % m * a) %m);
        }
    }

    public static void main(String[] args) {
        // char[] ch = {'g', 'o', 'o', 'd', 'd', 'a', 'd' };
        // if (isPallindrome(ch, 5, 6)) {
        //     System.out.println("Pallindrome");
        // } else {
        //     System.out.println("Not Pallindrome");
        // }
       //System.out.println(sumDigit(12345));
       //System.out.println(pow(3,4));
       System.out.println(fpPow(2,5));
    }    
}
