package cards;

import enums.EMachineStage;

public class CardMachineSameSize extends CardMachine {

	private int size = -1;

	public CardMachineSameSize(EMachineStage eMachineStage, int size) {

		super(eMachineStage);
		this.size = size;

		createImageView(eMachineStage);

	}

	private void createImageView(EMachineStage eMachineStage) {

		String filePath = getFilePath();
		filePath += "stage ";
		filePath += eMachineStage.toString();
		filePath += "/";
		filePath += "same size/";
		filePath += size;
		filePath += ".jpg";

		super.createImageView(filePath);

	}

}
