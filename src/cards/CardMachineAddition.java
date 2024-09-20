package cards;

import enums.EMachineStage;
import utils.Logger;

public abstract class CardMachineAddition extends CardMachine {

	public CardMachineAddition(EMachineStage eMachineStage) {
		super(eMachineStage);
	}

	@Override
	protected void printCredentials() {

		super.printCredentials();

		Logger.INSTANCE
				.log("robots amount - " + getMachineTypeCredentials().getAdditionRobotsAmount());

	}

}
