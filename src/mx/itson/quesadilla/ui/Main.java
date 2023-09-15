
package mx.itson.quesadilla.ui;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Ingresa el texto a evaluar: ");
        Scanner scanner = new Scanner(System.in);
        String enunciado = scanner.nextLine();

        String nuevoEnunciado = enunciado.replace("-", "").replace("(", "").replace(")", "").replace(" ", "");
        String[] enunciadoLineas = nuevoEnunciado.split(",");
        
        int guaymasContador = 0;
        int hermosilloContador = 0;
        int tijuanaContador = 0;
        int desconocidoContador = 0;
        
        
        for (String contador : enunciadoLineas) {
            if (contador.startsWith("622")) {
                guaymasContador++;
            } else if (contador.startsWith("662")) {
                hermosilloContador++;
            } else if (contador.startsWith("664")) {
                tijuanaContador++;
            } else {
                desconocidoContador++;
            }
        }
       
        System.out.println("Números de Guaymas: " + guaymasContador);
        System.out.println("Números de Hermosillo: " + hermosilloContador);
        System.out.println("Números de Tijuana: " + tijuanaContador);
        System.out.println("Números desconocidos: " + desconocidoContador);
   }
}

//        String nuevoEnunciado = enunciado.replace("m", "s").replace("M", "S");
//        System.out.println(nuevoEnunciado);

//        boolean estaUsada = enunciado.startsWith("a");
//        if(estaUsada){
//             System.out.println("Si inicia con a");
//        }else{
//             System.out.println("No inicia con a");
//        } 
//    
//    
//        if(enunciado.startsWith("a")){
//             System.out.println("Si inicia con a");
//        }else{
//             System.out.println("No inicia con a");
//        } 
//
//        System.out.println(enunciado.startsWith("a") ? "Si inicia con a" : "No inicia con a");
    

