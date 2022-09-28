package Modelo;
public class Concurso {
    private Participante A;
    private Participante B;
    private Participante C;
    private Participante ganador;
    private double puntajeA;
    private double puntajeC;
    private double puntajeB;


    public Concurso() {
    }

    public Concurso(Participante A, Participante B) {
        this.A = A;
        this.B = B;
   }

    public Participante getA() {
        return A;
    }

    public void setA(Participante A) {
        this.A = A;
    }

    public Participante getB() {
        return B;
    }

    public void setB(Participante B) {
        this.B = B;
    }

    public Participante getC() {
        return C;
    }

    public void setC(Participante C) {
        this.C = C;
    }

    public Participante getGanador() {
        return this.ganador;
    }

    public void setGanador(Participante ganador) {
        this.ganador = ganador;
    }
    
 
    
}
