package com.wora.batuhanozenvizee;

public class MuhasebeProgrami {

	
	public static int ucretHesapla(int calisilanSaat, int saatlikUcret) {
		Ucret test = new Ucret(calisilanSaat,saatlikUcret);
		int result = test.calisilanSaat * test.saatlikUcret;
		return result;
	}

	private static class Ucret {
		int calisilanSaat;
		int saatlikUcret;
		int ucret;

		public Ucret(int calisilanSaat, int saatlikUcret) {
			this.calisilanSaat = calisilanSaat;
			this.saatlikUcret = saatlikUcret;
			this.ucret = calisilanSaat * saatlikUcret;
		}

		@Override
		public String toString() {
			return "" + calisilanSaat + " * " + saatlikUcret + " = " + ucret + "";
		}
	}
	public static void main(String[] args) {
		System.out.println("Result = " + ucretHesapla(5, 25));
	}


}