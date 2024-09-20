package controller;

public enum InstantiateComponents {

	INSTANCE;

	private InstantiateComponents() {

		Decks.values();
		CardBacks.values();

	}

}
