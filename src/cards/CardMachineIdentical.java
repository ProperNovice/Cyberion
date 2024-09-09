package cards;

import enums.EMachineStage;

public class CardMachineIdentical extends CardMachine {

	public CardMachineIdentical(EMachineStage eMachineStage) {

		super(eMachineStage);

		String fileName = getFilePath();
		fileName += "stage ";
		fileName += eMachineStage.toString();
		fileName += "/";
		fileName += "identical.jpg";

		super.createImageView(fileName);

	}

}
