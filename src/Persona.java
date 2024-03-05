public class Persona {

    private String nombre;
    private int edad;
    private String pais;

    public Persona(String N, int E, String P) {
        this.nombre = N;
        this.edad = E;
        this.pais = P;
    }

    public Persona() {
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }


}
