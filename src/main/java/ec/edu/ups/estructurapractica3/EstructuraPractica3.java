/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.estructurapractica3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author venot
 */
public class EstructuraPractica3 {
//{[()]}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una expresión con llaves, corchetes y paréntesis:");

        String expresion = scanner.nextLine();
        
        Queue<Character> cola = new LinkedList<>();

        for (char caracter : expresion.toCharArray()) {
            if (caracter == '{' || caracter == '[' || caracter == '(') {
                cola.add(caracter);
                System.out.println(cola);
            } else if (caracter == '}' || caracter == ']' || caracter == ')') {
                cola.poll();
                System.out.println(cola);
            }        
        }
        System.out.println("Cola Final \n"+cola);
    }
    
}