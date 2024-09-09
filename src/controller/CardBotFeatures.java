package controller;

import enums.EModel;

public class CardBotFeatures {

	private EModel eModel = null;
	private int size = -1;

	public CardBotFeatures(EModel eModel, int size) {

		this.eModel = eModel;
		this.size = size;

	}

	public EModel getEModel() {
		return this.eModel;
	}

	public int getSize() {
		return this.size;
	}

}
