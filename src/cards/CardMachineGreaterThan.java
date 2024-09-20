package cards;

import controller.MachineTypeCredentials;
import enums.EMachineStage;

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

}
