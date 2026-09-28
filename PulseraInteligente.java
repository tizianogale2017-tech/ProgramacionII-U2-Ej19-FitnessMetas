package Ejercicio19_fitnessMetas;

public class PulseraInteligente {
    private static final int META_DIARIA = 10000;

    private PerfilUsuario perfil;

    public PulseraInteligente(PerfilUsuario perfil) {
        this.perfil = perfil;
    }

    public void registrarPasos(int cantidad) {
        if (cantidad <= 0) {
            return;
        }
        int antes = perfil.getPasosAcumulados();
        perfil.sumarPasos(cantidad);
        System.out.println("[Pulsera] +" + cantidad + " pasos (total: " + perfil.getPasosAcumulados() + ")");
        if (antes < META_DIARIA && perfil.getPasosAcumulados() >= META_DIARIA) {
            System.out.println("[Pulsera] ¡Meta diaria de " + META_DIARIA + " pasos superada! Notificando al perfil...");
            perfil.otorgarInsignia("Caminante 10K");
        }
    }
}
