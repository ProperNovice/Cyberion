package cards;

import enums.EMachineStage;
import machineStages.MachineTypeCredentials;
import machineStages.MachineTypeCredentialsStageI;
import machineStages.MachineTypeCredentialsStageII;
import machineStages.MachineTypeCredentialsStageIII;

public abstract class CardMachine extends Card {

	private MachineTypeCredentials machineTypeCredentials = null;

	public CardMachine(EMachineStage eMachineStage) {

		createMachineTypeCredentials(eMachineStage);

	}

	@Override
	protected String getFilePath() {
		return super.getFilePath() + "machine/";
	}

	public final MachineTypeCredentials getMachineTypeCredentials() {
		return this.machineTypeCredentials;
	}

	private void createMachineTypeCredentials(EMachineStage eMachineStage) {

		switch (eMachineStage) {

		case I:
			this.machineTypeCredentials = new MachineTypeCredentialsStageI();
			break;

		case II:
			this.machineTypeCredentials = new MachineTypeCredentialsStageII();
			break;

		case III:
			this.machineTypeCredentials = new MachineTypeCredentialsStageIII();
			break;

		}

	}

}
