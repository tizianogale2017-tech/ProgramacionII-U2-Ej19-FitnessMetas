package Ejercicio19_fitnessMetas;

public class Main {
    public static void main(String[] args) {
        PerfilUsuario perfil = new PerfilUsuario("Camila");
        PulseraInteligente pulsera = new PulseraInteligente(perfil);

        pulsera.registrarPasos(4500);
        pulsera.registrarPasos(3800);
        pulsera.registrarPasos(2500);

        System.out.println("Insignias de " + perfil.getNombre() + ": " + perfil.getInsigniasObtenidas());
    }
}
