/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicprograming;

/**pos>   1,2,3,4,5,6,7,8
 *values  1,2,3,4,5,6,8,9
 * @author shivam
 */
public class UglyNumber {
     int maxDivide(int a, int b) 
    { 
        while(a % b == 0) 
            a = a/b; 
        
        return a; 
    } 
      
     int isUgly(int no) 
    { 
        no = maxDivide(no, 2); 
        System.out.println("from isugly 2-> "+no);
        no = maxDivide(no, 3); 
        System.out.println("from isugly 3-> "+no);
        no = maxDivide(no, 5); 
        System.out.println("from isugly 5-> "+no);  
        return (no == 1)? 1 : 0; 
    } 
      
     int getNthUglyNo(int n) 
    { 
        int i = 1; 
          
        int count = 1;  
          
        while(n > count) 
        {
            
            i++;
            System.out.println("from getNthUglyNO i-> "+i);
            if(isUgly(i) == 1){
                
                count++;
                System.out.println("from getNthUglyNO count-> "+count);
            }
        } 
        return i; 
    } 
      
    public void controller() 
    { 
        int no = getNthUglyNo(7); 
        System.out.println("150th ugly "
                       + "no. is "+ no); 
    }
    
    

}
