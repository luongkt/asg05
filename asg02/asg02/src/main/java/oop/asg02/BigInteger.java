/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.asg02;

/**
 *
 * @author Luong
 */
public class BigInteger {
    
     public BigInteger(int init) {
      // BigInteger a=new BigInteger("2");
         System.out.println(init);
     }
 
     public BigInteger(String init) {
         BigInteger s=new BigInteger("");
        s.toString();
    }
 
     public String toString() {
   
         return "lyly";
     }
 
    public boolean equals(Object other) {
         return toString().equals(other.toString());
     }
 
     public long toLong() {
         return 0;  
     }
 
     public BigInteger add(BigInteger other) {
         return null; 
     }
 
     public BigInteger subtract(BigInteger other) {
         return null;  
     }
     public static void main(String[]args){
         BigInteger e=new BigInteger(2);
        
          BigInteger s=new BigInteger("nana");
     
     
     }
 }
    

