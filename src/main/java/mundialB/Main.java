/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundialB;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class Main {

    
    public static void main(String[] args) {
       
        
     int tam=4;
     int[][] entrada= new int[tam][7];
     
     entrada[0][0]=4;
     entrada[1][0]=32;
     entrada[1][1]=11;
     entrada[1][2]=6;
     entrada[1][3]=4;
     entrada[1][4]=4;
     entrada[1][5]=3;
     entrada[1][6]=1;
     entrada[2][0]=32;
     entrada[2][1]=28;
     entrada[2][2]=0;
     entrada[2][3]=0;
     entrada[2][4]=0;
     entrada[2][5]=0;
     entrada[2][6]=0;
    
        escribirFichero(calcularRepesca(entrada), "pruebamunidal.txt");
        mostrarArray(calcularRepesca(entrada));
    }
    
    
    public static int calcularRepescalinea(int[] lista){                
        int repesca= lista[0] - lista[1] -lista[2] - lista[3] - lista[4] - lista[5] - lista[6];
        return repesca;                      
    }
    
    public static int[] calcularRepesca(int[][] entrada){
        int[] devolver= new int[entrada.length];
        for(int i =0; i<entrada.length;i++){
            devolver[i]=calcularRepescalinea(entrada[i]);                                
        }
        return devolver;
    }
    public static void mostrarArray(int[] array){
        for(int i =0; i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    
    public static void escribirFichero(int[] array,String idFichero){
        String tmp;
        try(BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))){
           for(int i=0;i<array.length;i++){
               tmp=String.valueOf(array[i]);
               flujo.write(tmp);
               flujo.newLine();
               }
            
               
           
           flujo.flush();
           
       }catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
            
    
    
    
    
    
    public static List<String> leerFichero(String nombreFichero) {
        List<String> lista = new ArrayList<>();
        try {
            lista = Files.readAllLines(Paths.get(nombreFichero));
        } catch (IOException ex) {
            System.out.println("Error accediendo a " + nombreFichero);
        }
        
        return lista;

    }
    
    

}
