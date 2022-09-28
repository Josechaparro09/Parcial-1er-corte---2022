package Modelo;
public class Participante {
//    gitmind
    private String nombre;
    private String apellido;
    private int numero;
    private Llanta llanta;
    private Concurso c;
    

    public Participante() {
    }

    public Participante(String nombre, String apellido, int numero, Llanta llanta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
        this.llanta = llanta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Llanta getLlanta() {
        return llanta;
    }

    public void setLlanta(Llanta llanta) {
        this.llanta = llanta;
    }
    public double resultadoLanzamiento(double vueltas){
        c.setGanador(this);
       return vueltas*(this.getLlanta().getDiametro()*Math.PI);
    }
    

    @Override
    public String toString() {
        return "nombre=" + nombre + ", Apellido=" + apellido + ", numero=" + numero ;
    }
    
    
   
    
}
