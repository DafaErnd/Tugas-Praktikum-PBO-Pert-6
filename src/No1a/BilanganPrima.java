/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package No1a;



/**
 *
 * @author dafae
 */
public class BilanganPrima {
    int hasil = 0;
    int bil;
    
   
    
    void bilangan(){
       
        
        for (int i = 0; i <= 20; i++){
            bil = 0;
            for (int j=1; j <= i; j++){
                if( i%j==0){
                    bil = bil+1;
                    
                }
               
            }
            if( bil == 2){
                
                hasil += i;
                System.out.print(i+" ");
            }
            
           
        }
        System.out.println("");
        System.out.println("Hasilnya : " + hasil);
    }
    
   
}
