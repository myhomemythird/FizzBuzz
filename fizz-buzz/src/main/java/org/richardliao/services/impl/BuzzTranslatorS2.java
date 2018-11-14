package org.richardliao.services.impl;

import org.richardliao.services.InterfaceTranslator;

public class BuzzTranslatorS2 implements InterfaceTranslator {

	public boolean accept(int num) {
		return String.valueOf(num).indexOf('5') > -1;
	}

	public String translate() {
		return "Buzz";
	}

}
