package cards;

import enums.EMachineStage;
import enums.EModel;
import utils.Logger;

public class CardMachineSameModel extends CardMachine {

	private EModel eModel = null;

	public CardMachineSameModel(EMachineStage eMachineStage, EModel eModel) {

		super(eMachineStage);
		this.eModel = eModel;

		createImageView(eMachineStage);

	}

	private void createImageView(EMachineStage eMachineStage) {

		String filePath = getFilePath();
		filePath += "stage ";
		filePath += eMachineStage.toString();
		filePath += "/";
		filePath += "same model/";
		filePath += eModel.toString().toLowerCase();
		filePath += ".jpg";

		super.createImageView(filePath);

	}

	@Override
	protected void printCredentials() {

		super.printCredentials();
		Logger.INSTANCE.log(this.eModel);
		Logger.INSTANCE
				.log("robots amount - " + getMachineTypeCredentials().getRobotsWithSameFeature());

	}

}
