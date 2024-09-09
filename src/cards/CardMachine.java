package cards;

import enums.EMachineStage;

public abstract class CardMachine extends Card {

	protected EMachineStage eMachineStage = null;

	public CardMachine(EMachineStage eMachineStage) {
		this.eMachineStage = eMachineStage;
	}

	public final EMachineStage getEMachineStage() {
		return this.eMachineStage;
	}

}
