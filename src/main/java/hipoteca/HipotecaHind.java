/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipoteca;

import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author hinda
 */
public class HipotecaHind {

    public static void main(String[] args) {

        //declaracion y initialisation variables
        int edad, anosDelvolverHipoteca;
        double salarioBrutoMensual, totalHipoteca, sueldoBrutoAnual, contidadresulta;
        String opcion;
        Scanner sc = new Scanner(System.in);
        //constantes
        double FACTORMULTIPLICATIVO = 5.85;
         
        
        

        do {

            System.out.println("Menú de opciones");
            System.out.println("-------------------------");
            System.out.println("Realizar.Hacer la programa");
            System.out.println("salir.Finalizar la programa");
            System.out.println("-------------------------");
            System.out.println("Elija una opción: ");
            opcion = sc.next();

            switch (opcion) {
                case "Realizar":

                    //pedir Informaciones de edad hasta que la edad seria valido entre 18 y 65
                    do {
                        System.out.println("Introduce tu edad entre 18 y 65: ");
                        edad = sc.nextInt();
                    } while (edad < 18 || edad > 65);

                    //pedi el salario mensual y controlar que no sea negativo
                    do {
                        System.out.println("Introduce tu salario Bruto Mensual : ");
                        salarioBrutoMensual = sc.nextDouble();
                        if(salarioBrutoMensual <= 0){
                            System.out.println("el salario no puede ser 0 o negativo"); 
                        }
                    } while (salarioBrutoMensual <= 0);
                    //pedi el total de hipoteca y controlar que no sea negativo ni menos del salario
                    do {
                        System.out.println("Introduce la cantidad total de pasta que necesita para su hipoteca : ");
                        totalHipoteca = sc.nextDouble();
                        if(totalHipoteca <= 0 || totalHipoteca <= salarioBrutoMensual){
                            System.out.println("total hipoteca can't be negative or egual del salary"); 
                        }
                    } while (totalHipoteca <= 0 || totalHipoteca <= salarioBrutoMensual);

                    //calcular el sueldo bruto anual y multiplicamos con el FACTORMULTIPLICATIVO
                    sueldoBrutoAnual = salarioBrutoMensual * 12;
                    contidadresulta = sueldoBrutoAnual * FACTORMULTIPLICATIVO;

                    //ver si el total pediendo de hipoteca mas que su sueldoAnual multiplicando con el Factor Multiplicativo
                    if (totalHipoteca > contidadresulta) {
                        System.out.println("Lo siento la hipoteca rechaza");//si si devuelve msg que tu hipoteca rechaza 
                    } else {//si no entra para saber mas informaciones 

                        do {//contral el numero de años para que no sea negativo ni >30 o <5 ni edad + anosDelvolverHipoteca) > 75
                            System.out.println("Introduce numero de años en los que quiere devolver la hipoteca: ");
                            anosDelvolverHipoteca = sc.nextInt();               
                        } while (anosDelvolverHipoteca<=0 || (anosDelvolverHipoteca > 30 || anosDelvolverHipoteca < 5) || ((edad + anosDelvolverHipoteca) > 75 ));

                            System.out.println("hipoteca Acceptada");                       
                    }

                    break;
                    
                case "salir":
                    System.out.println("Finalizar");
                    break;

                default:
                    System.out.println("Error: has elegido opcion no existe");
            }

        } while (!opcion.equalsIgnoreCase("Salir"));

    }
}
