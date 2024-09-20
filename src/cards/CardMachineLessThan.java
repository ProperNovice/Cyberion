package cards;

import controller.MachineTypeCredentials;
import enums.EMachineStage;
import utils.Logger;

public class CardMachineLessThan extends CardMachineAddition {

	public CardMachineLessThan(EMachineStage eMachineStage) {

		super(eMachineStage);

		String filePath = getFilePath();
		filePath += "stage " + eMachineStage + "/";
		filePath += "addition/";
		filePath += MachineTypeCredentials.INSTANCE.getLessThanValue(eMachineStage);
		filePath += ".jpg";

		super.createImageView(filePath);

	}

	@Override
	protected void printCredentials() {

		super.printCredentials();
		Logger.INSTANCE.log("less than - " + getMachineTypeCredentials().getLessThanValue());

	}

}
