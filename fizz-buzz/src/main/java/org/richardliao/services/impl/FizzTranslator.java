package org.richardliao.services.impl;

import org.richardliao.services.InterfaceTranslator;

public class FizzTranslator implements InterfaceTranslator {

	public boolean accept(int num) {
		return (num % 3 == 0);
	}

	public String translate() {
		return "Fizz";
	}

}
