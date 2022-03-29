/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prime.number;
import java.util.*;
/**
 *
 * @author alexandrosaristeridis
 */
public class PrimeNumber {
    public Boolean isPrime(Integer n) {
     Boolean b=false;
     double nb=n;
            if ((nb%nb==0 && nb%1==0)&&((nb/2)%1!=0)){
            b = true;
        }else if (n==2){
            b=true;
        }else{
        b=false;}
        
 
 return b;}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
         System.out.println("dose int");
          int n=s.nextInt();
          PrimeNumber pm =new PrimeNumber();
        System.out.println(pm.isPrime(n));
    }
    
}
