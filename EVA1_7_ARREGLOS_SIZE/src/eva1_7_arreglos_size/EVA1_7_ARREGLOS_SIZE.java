/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_arreglos_size;

/**
 *
 * @author aldop
 */
public class EVA1_7_ARREGLOS_SIZE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] org=new int[10];
        System.out.println(org);
        for (int i = 0; i < org.length; i++) { //datos aleatorios
            org[i]=(int)(Math.random()*100);
            
            
        }
         for (int i = 0; i < org.length; i++) {     //imprimir
             System.out.println("["+ org[i] +  "]");
            
        }
         System.out.println("");
         //cambiar el tamaño no se puede
         //respaldo
         int[]copia=org;//copio la direccion del arreglo orijinal
         org=new int[5];
         System.out.print(org);
         //transferir informacion
         for (int i = 0; i < org.length; i++) {
            org[i]=copia[i];
        }
          for (int i = 0; i < org.length; i++) {     //imprimir arreglo modificado
             System.out.print("["+ org[i] +  "]");
            
        }
          
          
          }
          
    }
    

