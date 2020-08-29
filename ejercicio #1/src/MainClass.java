
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kevin
 */
public class MainClass {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("ESCRIBA SU NOMBRE");
        String nombre = sc.nextLine();
        System.out.println("ESCIBA SU EDAD");
        int edad = sc.nextInt();
        System.out.println("SEXO");
        String sexo = sc.nextLine();
        System.out.println("DIGITE SU PESO");
        double peso = sc.nextDouble();
        System.out.println("DIGITE SU ALTURA");
        double altura = sc.nextDouble();

        Persona Per = new Persona();

        Per.setNomnre(nombre);
        Per.setEdad(edad);
        Per.setSexo(sexo);
        Per.setPeso(peso);
        Per.setAltura(altura);
        System.out.println(Per.esMayor());
        
       

    }

}
