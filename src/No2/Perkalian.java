/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package No2;

/**
 *
 * @author dafae
 */
public class Perkalian {
    
    void perhitungan(){
        System.out.print("  ");
        for(int i = 1; i <= 4; i++){
            System.out.print(" " + i);
        }
            System.out.print("\n");
        for(int j = 1; j <= 4; j++ ){
          System.out.print("\n");
            System.out.print(" " + j);
            for(int k = j; k <= 4*j; k++){
                if(k % j ==0){
                    System.out.print(" " + k);
                    
                }
            }
            
        }
    }
}
