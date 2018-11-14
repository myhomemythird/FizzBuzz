package org.richardliao.services.impl;

import org.richardliao.services.InterfaceTranslator;

public class FizzBuzzTranslatorS2 implements InterfaceTranslator {

	public boolean accept(int num) {
		return String.valueOf(num).indexOf("3") > -1 && String.valueOf(num).indexOf("5") > -1;
	}

	public String translate() {
		return "FizzBuzz";
	}

}
