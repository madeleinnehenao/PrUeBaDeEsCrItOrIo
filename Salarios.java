/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios1semana;
import java.util.Scanner;
/**
 *
 * @author PAULINA HENAO GARCIA
 */
public class Salarios {
    public static void main(String[] args){
        double horastrabajadas,valorhora,retencion,salariobruto,salarioneto;
        Scanner Entrada=new Scanner(System.in);
        System.out.println("Ingrese horas trabajadas");
        horastrabajadas=Entrada.nextDouble();
        System.out.println("Ingrese el valor de la hora");
        valorhora=Entrada.nextDouble();
        retencion=0.125;
        salariobruto=horastrabajadas*valorhora;
        salarioneto=salariobruto-(salariobruto*retencion);
        System.out.println("El salario bruto es: "+(salariobruto));
        System.out.println("El salario neto es: "+(salarioneto));
        
    }
}
