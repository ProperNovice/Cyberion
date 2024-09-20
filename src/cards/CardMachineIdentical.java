package cards;

import enums.EMachineStage;
import utils.Logger;

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

	@Override
	protected void printCredentials() {
		Logger.INSTANCE.log("robots amount - " + getMachineTypeCredentials().getIdenticalRobots());
	}

}
