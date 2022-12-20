/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas11;

import java.util.*;

/**
 * Llibreria d'utilitats
 *
 * @author mario
 * @version 1
 *
 */
public class Utils {
// <editor-fold defaultstate="collapsed" desc="Implementació de LlegirInt()">

	private static Scanner scan = null;

	/**
	 * Llegeix un valor int
	 * 
	 * @return int
	 */
	public static int LlegirInt() {
		int result;

		if (scan == null)
			scan = new Scanner(System.in);
		result = LlegirInt(scan);

		return result;
	}

	/**
	 * Mostra un missatge i llegeix un valor int
	 * 
	 * @param missatge String
	 * @return int
	 */
	public static int LlegirInt(String missatge) {
		int result;

		if (scan == null)
			scan = new Scanner(System.in);
		result = LlegirInt(scan, missatge);

		return result;
	}

	/**
	 * Llegeix un valor int amb un nou Scanner
	 * 
	 * @param scan Scanner
	 * @return int
	 */
	public static int LlegirInt(Scanner scan) {
		return LlegirInt(scan, null);
	}

	/**
	 * Mostra un missatge i llegeix un valor int amb un nou Scanner, limitat per 2
	 * valors
	 * 
	 * @param scan     Scanner
	 * @param missatge String
	 * @param valorMin int
	 * @param valorMax int
	 * @return int
	 */
	public static int LlegirInt(Scanner scan, String missatge, int valorMin, int valorMax) {
		int result = 0;
		do {
			result = LlegirInt(scan, missatge);
		} while (result < valorMin || result > valorMax);

		return result;
	}

	/**
	 * Mostra un missatge i llegeix un valor int amb un nou Scanner
	 * 
	 * @param scan     Scanner
	 * @param missatge String
	 * @return int
	 */
	public static int LlegirInt(Scanner scan, String missatge) {
		boolean dadesCorrectes;
		int result = 0;
		do {
			if (missatge != null) {
				System.out.print(missatge);
			}
			dadesCorrectes = scan.hasNextInt();
			if (dadesCorrectes) {
				result = scan.nextInt();
			} else if (scan.hasNext()) {
				scan.nextLine();
			}
		} while (!dadesCorrectes);

		return result;
	}

	/**
	 * Neteja la consola afegint salts de línia
	 */
	public static void NetejarPantalla() {
		System.out.print("\n\n\n\n\n\n\n");
	}

	/**
	 * Espera un temps donat en milisegons
	 * 
	 * @param temps int
	 */
	public static void Esperar(int temps) {
		try {
			Thread.sleep(temps);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

// </editor-fold>
}
