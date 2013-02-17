package models;

import java.util.*;

import play.data.validation.Constraints.*;

public class Computador {

	public Long id;
	
	@Required
	public String barcode;
	public String status;

	public static List<Computador> all() {
		//TODO Deve retornar a lista de computadores cadastrados
		// Esta' retornando uma lista vazia.
		return new ArrayList<Computador>();
	}
	
	public static void create(Computador c) {
	}

	public static void delete(Computador c) {
	}

}
