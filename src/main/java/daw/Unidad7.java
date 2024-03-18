/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package daw;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Unidad7 {

    public static void main(String[] args) {
       String idFichero = "array.txt" ;
       String tmp;
        ArrayList<String> listaTexto= new ArrayList<>();
                
        
       Scanner teclado = new Scanner(System.in);
       String entrada;
       do{
           System.out.println("introduce texto:(fin para salir) ");
           entrada=teclado.nextLine();
           listaTexto.add(entrada);
           
       }while(!entrada.equalsIgnoreCase("fin"));
       
       
       try(BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))){
           for(int i=0;i<listaTexto.size();i++){
               tmp=listaTexto.get(i);
               if(!tmp.equalsIgnoreCase("fin")){
               flujo.write(tmp);
               flujo.newLine();
               }
            
               
           }
           flujo.flush();
           
       }catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        
    }
}
