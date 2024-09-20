package cards;

import controller.MachineTypeCredentials;
import enums.EMachineStage;

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

}
