import java.util.ArrayList;

public class Listado extends Persona {
    public static ArrayList<Persona> listapersona = new ArrayList<>(); // creo mi lista de tipo persona con Arralist
    public void add(Persona personahija){



        listapersona.add(personahija); // agrego elemento a la lista



    }

    public void find(Persona personahija2){

        if (listapersona.contains(personahija2)){
            System.out.println("este objeto si se encuentra en la lista");
            return;
        }

        System.out.println("No se encontro dato en la lista");




    }


    public void delete(int index){

        listapersona.remove(index);








    }

    public void mostrar () {
        int index=0;
        for (Persona item :listapersona){  // recorro los elementos de  la lista
             System.out.println(index +" "+ item.getNombre() +  " " + item.getEdad() +  " " + item.getPais()); // imprimo mis elementos de la lista
             index+=1;
        }

    }
}
