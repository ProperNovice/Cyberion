package cards;

import enums.EMachineStage;

public abstract class CardMachineAddition extends CardMachine {

	private int value = -1;

	public CardMachineAddition(EMachineStage eMachineStage, int value) {

		super(eMachineStage);

		this.value = value;

		String filePath = getFilePath();
		filePath += "stage " + eMachineStage + "/";
		filePath += "addition/";
		filePath += this.value + ".jpg";

		super.createImageView(filePath);

	}

	public final int getValue() {
		return this.value;
	}

}
