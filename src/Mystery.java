
import java.util.Scanner;

public class Mystery {

    public static void main(String[] args){

        int num_paradas;
        int km;


        Scanner paradas = new Scanner(System.in);
        Scanner kilometros = new Scanner(System.in);



        System.out.println("Cuantas visitas has hecho?");
        num_paradas = paradas.nextInt();

        System.out.println("Cuantos Km has hecho fuera de tu localidad?");
        km = kilometros.nextInt();

       System.out.println("Has ganado "+8*num_paradas+" Euros en concepto de sueldo.");
       System.out.println("Has ganado "+0.19*km+" Euros en concepto de desplazamientos.");
       System.out.println("-----------------------------------------------------------------------");
       System.out.println("Tu sueldo de este mes es de un total de:");
       System.out.println((8*num_paradas)+(0.19*km)+" Euros");


    }
}
