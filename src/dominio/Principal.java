package dominio;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		System.out.println(p.toString());
		
		Persona p2 = new Persona(
			"12345678", "Lolo", "Ciriaco", LocalDate.of(1998, 5, 12),
            "Masculino", "Av. Siempre Viva 123", "123456789", "lolo@mail.com"
		);
		System.out.println(p2.toString());
				
		Empleado e1 = new Empleado(
                "12345678", "Lolo", "Ciriaco", LocalDate.of(1998, 5, 12),
                "Masculino", "Av. Siempre Viva 123", "123456789", "lolo@mail.com",
                "Programador"
        );
		Empleado e2 = new Empleado("12345678", "Ana", "Gomez", LocalDate.of(1995, 5, 20),
                "Femenino", "Calle Falsa 123", "111-222-333", "ana@mail.com", "Analista");
		
        Empleado e3 = new Empleado("87654321", "Carlos", "Perez", LocalDate.of(1988, 10, 15),
                "Masculino", "Av. Siempre Viva 742", "222-333-444", "carlos@mail.com", "Programador");
        
         Empleado e4 = new Empleado();
         
           Empleado e5 = new Empleado("11223344", "Laura", "Martinez", LocalDate.of(2000, 1, 1),
                "Femenino", "San Martin 456", "333-444-555", "laura@mail.com", "Tester");


   		System.out.println(e1.toString());
   		System.out.println(e2.toString());
   		System.out.println(e3.toString());
   		System.out.println(e4.toString());
   		System.out.println(e5.toString());


      // Mostrar próximo legajo
     System.out.println("El próximo legajo será el " + Empleado.devuelveProximoLegajo());
		

	}

}
