package org.richardliao.services.impl;

import org.richardliao.services.InterfaceTranslator;

public class FizzBuzzTranslator implements InterfaceTranslator {

	public boolean accept(int num) {
		return (num % 15 == 0);
	}

	public String translate() {
		return "FizzBuzz";
	}

}
