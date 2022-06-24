
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

public class AdivinaNumero{
    public static void main (String[] args){
        int number = 0;
        Random rand = new Random() ;
        number = rand.nextInt(100);

        

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Bienvenenido a adivina el numero. Nuestro sistema a elegido un numero entre 1 y 100 y tu objetivo es adivina cual es el numero");
        
        //System.out.println(number);
       
        int answer = 0;
        //answer = Integer.parseInt(JOptionPane.showInputDialog("Digita el numero"));
        System.out.println("intenta adivinar el numero");
        
        //Scanner sc = new Scanner(System.in);
        //answer = Integer.valueOf(scan.nextLine());

        do {  answer = Integer.valueOf(scan.nextLine());
        if(answer < number){
            System.out.println("Escribe un numero mas grande");
        }
        if (answer > number){
            System.out.println("Escribe un numero mas pequeño");
        }
        if(answer == number){
            System.out.println("Has ganado");
        }
        

        } while (answer != number);



    }