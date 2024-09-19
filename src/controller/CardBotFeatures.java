package controller;

import enums.EModel;
import utils.Logger;

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

	public void print() {

		Logger.INSTANCE.log("model - " + this.eModel);
		Logger.INSTANCE.log("size - " + this.size);

	}

}
