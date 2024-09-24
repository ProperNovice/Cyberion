package controller;

import model.Mainframe;

public enum InstantiateComponents {

	INSTANCE;

	private InstantiateComponents() {

		Decks.values();
		CardBacks.values();
		Mainframe.values();

	}

}
