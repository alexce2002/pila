import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    //Persona persona = new Persona( "carlos", 25 , "colombia" ); // INSTANCIO LA CLASE PERSONA
      /*  Persona persona = new Persona();   //  INSTANCIO LA CLASE PERSONA en un objeto en donde estan los atributos
        persona.setNombre("carlos");
        persona.setEdad(25);
        persona.setPais("colombia");
        System.out.println(persona.getEdad());*/

       /* ArrayList<Persona> listapersona = new ArrayList<>(); // creo mi lista de tipo persona con Arralist
        listapersona.add(persona); // agrego elemento a la lista
       // System.out.println(listapersona.get(0).getPais());
        for (Persona item :listapersona){  // recorro los elementos de  la lista
            System.out.println(item.getNombre() +  " " + item.getEdad() +  " " + item.getPais()); // imprimo mis elementos de la lista
        }
       */

        Listado objlistado = new Listado(); // instanciamos el objeto listado
        Scanner d = new Scanner(System.in);




        int option = 0;
        do {
            System.out.println("Bienvenido al programa de ingreso de personas");
            System.out.println("Seleccione una opcion 1. add 2.find 3.remove 4.mostrar 5.salir");

            option=d.nextInt();
            switch (option){
                case 1 :

                    objlistado.add(retornarObj());



                    break;
                case 2:


                    objlistado.find(retornarObj());

                    break;
                case 3:
                    objlistado.mostrar();
                    System.out.println("Elija el numeroo");

                    objlistado.delete(d.nextInt());
                    break;
                case 4:
                    objlistado.mostrar();

                    break;
                case 5:
                    option=5;
                    break;


                default:
                    System.out.println("Opcion no valida");
                    break;


            }


        }

        while (option != 5 );



    }
    public static Persona  retornarObj(){
        Scanner d = new Scanner(System.in);
        Persona persona = new Persona();
        System.out.println("Nombre: ");
        persona.setNombre(d.nextLine());
        System.out.println("Edad:");
        persona.setEdad(d.nextInt());
        System.out.println("Pais:");
        persona.setPais(d.next());
        return  persona;


    }






}