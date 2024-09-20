package cards;

import controller.MachineTypeCredentials;
import enums.EMachineStage;
import utils.Logger;

public class CardMachineGreaterThan extends CardMachineAddition {

	public CardMachineGreaterThan(EMachineStage eMachineStage) {

		super(eMachineStage);

		String filePath = getFilePath();
		filePath += "stage " + eMachineStage + "/";
		filePath += "addition/";
		filePath += MachineTypeCredentials.INSTANCE.getGreaterThanValue(eMachineStage);
		filePath += ".jpg";

		super.createImageView(filePath);

	}

	@Override
	protected void printCredentials() {

		super.printCredentials();
		Logger.INSTANCE.log("greater than - " + getMachineTypeCredentials().getGreaterThanValue());

	}

}
