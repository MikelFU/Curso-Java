package com.ipartek.formacion.uf2216.ejemplos.poo;

public class PuntoNombrePrueba extends Punto {
	public static void main(String[] args) {
		PuntoNombre ptn = new PuntoNombre("Javier");
		Punto p = ptn;

		System.out.println(p);//.toString());

		PuntoNombre ptn2 = (PuntoNombre) p;
		System.out.println(ptn2.getNombre());

		Punto p2 = new Punto();

		if (p2 instanceof PuntoNombre) {
			PuntoNombre ptn3 = (PuntoNombre) p2;
			System.out.println(ptn3.getNombre());
		} else {
			System.out.println("No es una instancia de PuntoNombre");
		}
		
		System.out.println(ptn2);
		
		
		
		System.gc();
	}

	public static void mainPruebas1(String[] args) {
		PuntoNombre ptn;
		ptn = new PuntoNombre("Bilbao");

		System.out.println(ptn.toString());

		ptn.setXY(3, 4);
		System.out.println(ptn.toString(false));

		Poligono poligono = new Poligono();

		poligono.add(ptn);
	}
}
