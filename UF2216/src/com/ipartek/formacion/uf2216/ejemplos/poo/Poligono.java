package com.ipartek.formacion.uf2216.ejemplos.poo;

import java.util.ArrayList;

public class Poligono {
	private ArrayList<Punto> puntos = new ArrayList<Punto>();

	public Punto[] getPuntos() {
		return puntos.toArray(new Punto[puntos.size()]);
	}

	public void add(Punto p) {
		puntos.add(p);
	}
}
