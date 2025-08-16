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
		
		System.out.println(e1.toString());

	}

}
