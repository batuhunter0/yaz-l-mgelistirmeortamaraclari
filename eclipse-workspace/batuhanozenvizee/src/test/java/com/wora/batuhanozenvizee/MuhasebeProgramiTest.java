package com.wora.batuhanozenvizee;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MuhasebeProgramiTest {

	@Test
	public void testHesaplaUcret() {

		MuhasebeProgrami test = new MuhasebeProgrami();
		int sonuc = test.ucretHesapla(5,25);
		System.out.println("Sonuç = " + sonuc);

	}

}
