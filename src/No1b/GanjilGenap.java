/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package No1b;
import java.util.Scanner;
/**
 *
 * @author dafae
 */
public class GanjilGenap {
    int pil,a,hasil;
    
    Scanner input = new Scanner(System.in);
    
    void bilangan(){
        System.out.println("=== MENU ===");
        System.out.println("[1].GENAP");
        System.out.println("[2].GANJIL");
        System.out.print("Pilih : ");
        pil = input.nextInt();
        System.out.println("============");
        System.out.println("");
        
        
        
        for(int i = 0; i <= 20; i++){
            if(pil == 1 && i%2 == 0){
                
                hasil += i;
                System.out.print(" "+i);
                
            }else if (pil == 2 && i%2 != 0){
                
                hasil += i;
                System.out.print(" " + i);
            }
            
        }
        System.out.println("");
        System.out.println("Hasilnya : " + hasil);
    }
    

}
