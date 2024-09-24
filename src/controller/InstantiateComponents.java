package controller;

import rest.Mainframe;

public enum InstantiateComponents {

	INSTANCE;

	private InstantiateComponents() {

		Decks.values();
		CardBacks.values();
		Mainframe.values();

	}

}
