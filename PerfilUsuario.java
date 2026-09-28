package Ejercicio19_fitnessMetas;

import java.util.ArrayList;
import java.util.List;

public class PerfilUsuario {
    private String nombre;
    private int pasosAcumulados;
    private List<String> insigniasObtenidas = new ArrayList<>();

    public PerfilUsuario(String nombre) {
        this.nombre = nombre;
    }

    public void sumarPasos(int cantidad) {
        pasosAcumulados += cantidad;
    }

    public void otorgarInsignia(String nombreInsignia) {
        if (!insigniasObtenidas.contains(nombreInsignia)) {
            insigniasObtenidas.add(nombreInsignia);
            System.out.println("[Perfil] " + nombre + " obtuvo la insignia \"" + nombreInsignia + "\".");
        }
    }

    public int getPasosAcumulados() {
        return pasosAcumulados;
    }

    public List<String> getInsigniasObtenidas() {
        return insigniasObtenidas;
    }

    public String getNombre() {
        return nombre;
    }
}
