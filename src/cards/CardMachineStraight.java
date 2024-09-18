package cards;

import enums.EMachineStage;

public class CardMachineStraight extends CardMachine {

	public CardMachineStraight(EMachineStage eMachineStage) {

		super(eMachineStage);

		String filePath = getFilePath();
		filePath += "stage " + eMachineStage + "/";
		filePath += "straight.jpg";

		super.createImageView(filePath);

	}

}
