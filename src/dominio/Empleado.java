package dominio;

import java.time.LocalDate;

public class Empleado extends Persona {

	private static int contadorLegajo = 1000;
    private int legajo;
    private String puesto;
    
    
    
    public Empleado() {
        super(); // llama al constructor vacío de Persona
        this.legajo = contadorLegajo++;
        this.puesto = "sin puesto";
    }
    // Constructor
    public Empleado(String dni, String nombre, String apellido, LocalDate fechaNacimiento,
                    String genero, String direccion, String telefono, String email,
                    String puesto) {
        super(dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);
        this.legajo = contadorLegajo++; // se asigna y luego se incrementa
        this.puesto = puesto;
    }

    // Getter solo de lectura para legajo (no setter, porque es autogenerado)
    public int getLegajo() {
        return legajo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    // Método estático que devuelve el próximo legajo
    public static int devuelveProximoLegajo() {
        return contadorLegajo;
    }
    
    // Método toString
    @Override
    public String toString() {
        return "Empleado{" +
                "legajo=" + legajo +
                ", puesto='" + puesto + '\'' +
                ", datosPersona=" + super.toString() +
                '}';
    }
}

