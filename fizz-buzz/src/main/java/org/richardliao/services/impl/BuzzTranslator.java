package org.richardliao.services.impl;

import org.richardliao.services.InterfaceTranslator;

public class BuzzTranslator implements InterfaceTranslator {

	public boolean accept(int num) {
		return (num % 5 == 0);
	}

	public String translate() {
		return "Buzz";
	}

}
