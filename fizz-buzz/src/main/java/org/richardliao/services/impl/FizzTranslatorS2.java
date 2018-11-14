package org.richardliao.services.impl;

import org.richardliao.services.InterfaceTranslator;

public class FizzTranslatorS2 implements InterfaceTranslator {

	public boolean accept(int num) {
		return String.valueOf(num).indexOf("3") > -1;
	}

	public String translate() {
		return "Fizz";
	}

}
