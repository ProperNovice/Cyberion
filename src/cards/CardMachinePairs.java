package cards;

import enums.EMachineStage;

public class CardMachinePairs extends CardMachine {

	public CardMachinePairs(EMachineStage eMachineStage) {

		super(eMachineStage);

		String filePath = getFilePath();
		filePath += "stage " + eMachineStage + "/";
		filePath += "pairs.jpg";

		super.createImageView(filePath);

	}

}
