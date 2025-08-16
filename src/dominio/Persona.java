package dominio;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persona {
	
	//atributos
	 String dni;
	 String nombre;
	 String apellido;
	 LocalDate fechaNacimiento;
	 String genero;
	 String direccion;
	 String telefono;
	 String email;
	 
	//constructores
	 public Persona() {
		 nombre = "sin nombre";
	     DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	     fechaNacimiento = LocalDate.parse("01/01/2025", formato);
	 }
	 
	 public Persona(String dni, String nombre, String apellido, LocalDate fechaNacimiento, String genero, String direccion, String telefono, String email) {
		 this.dni = dni;
		 this.nombre = nombre;
		 this.apellido = apellido;
		 this.fechaNacimiento = fechaNacimiento;
		 this.genero = genero;
		 this.direccion = direccion;
		 this.telefono = telefono;
		 this.email = email;
	 }
	 
	 //metodo toString
	 @Override
	 public String toString() {
		 return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento="
				 + fechaNacimiento + ", genero=" + genero + ", direccion=" + direccion + ", telefono=" + telefono
				 + ", email=" + email + "]";
	 }
	 
	//getters y setters
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
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
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	 
	
}
