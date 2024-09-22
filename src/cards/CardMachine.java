package cards;

import enums.EMachineStage;
import machineStages.MachineTypeCredentialsStage;
import machineStages.MachineTypeCredentialsStageI;
import machineStages.MachineTypeCredentialsStageII;
import machineStages.MachineTypeCredentialsStageIII;
import utils.Logger;

public abstract class CardMachine extends Card {

	private MachineTypeCredentialsStage machineTypeCredentials = null;
	private EMachineStage eMachineStage = null;

	public CardMachine(EMachineStage eMachineStage) {

		this.eMachineStage = eMachineStage;
		createMachineTypeCredentials(eMachineStage);

	}

	@Override
	protected String getFilePath() {
		return super.getFilePath() + "machine/";
	}

	public final MachineTypeCredentialsStage getMachineTypeCredentials() {
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

	@Override
	protected void printCredentials() {
		Logger.INSTANCE.log(this.machineTypeCredentials.getClass().getSimpleName());
	}

	public EMachineStage getEMachineStage() {
		return this.eMachineStage;
	}

}
