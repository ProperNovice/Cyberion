package controller;

import enums.EModel;

public class BotFeature {

	private EModel eModel = null;
	private int size = -1;

	public BotFeature(EModel eModel, int size) {

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
