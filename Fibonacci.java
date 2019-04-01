/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicprograming;

/**
 *
 * @author shivam
 */
public class Fibonacci {
    public void fibo(){
         int n=9;
        int f[]= new int[n+2];
        f[0]=0;
        f[1]=1;
        
        for(int i=2;i<=n;i++){
            f[i]=f[i-1]+f[i-2];
        }
        System.out.println(f[n] );
    }
}
