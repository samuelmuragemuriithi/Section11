package com.awesam;

public class Series {
    static int sum(int n){
        return ((n*n)+n)/2;
    }
    static int factorial(int n){
        int product= 1;
        for (int i = 1; i <=n ; i++) {
            product*=i;
        }
        return product;
    }
    static int fibonacchi(int n){
       if (n==0)return 0;
       if (n==1)return 1;
       int nMinus1=1;
       int nMinus2=0;
       int fib=0;
        for (int i = 0; i < n; i++) {
           fib=nMinus1+nMinus2;
           nMinus2=nMinus1;
           nMinus1=fib;
       }
       return fib;

    }


}
