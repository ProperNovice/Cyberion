package machineStages;

import utils.ShutDown;

public abstract class MachineTypeCredentials {

	public MachineTypeCredentials() {

	}

	public int cardsWithSameFeature() {

		ShutDown.INSTANCE.execute();
		return -1;

	}

}
