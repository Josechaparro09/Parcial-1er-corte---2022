
package Vista;

import Modelo.*;

public class Main {

    public static void main(String[] args) {
        
        Participante A = new Participante("Luis","Perez",1,new Llanta(10));
        Participante B = new Participante("Carlos","Lopez",2,new Llanta(5));
        Participante C = new Participante("Gorge","Pinto",3,new Llanta(7));
        
        Concurso concurso = new Concurso(A, B);
        concurso.setC(C);
        System.out.println("Resultado lanzamientos:");
        System.out.println("--------------------------------------");
        System.out.println("Resultado A: " + concurso.getA().resultadoLanzamiento(3));
        System.out.println("Resultado B: " + concurso.getB().resultadoLanzamiento(6.001));
        System.out.println("Resultado C: " + concurso.getC().resultadoLanzamiento(4));
        System.out.println("");
        Participante ganador = concurso.getGanador();
        System.out.println("Ganador: " +ganador);
        

    }
    
}
