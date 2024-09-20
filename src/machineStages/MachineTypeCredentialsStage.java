package machineStages;

import utils.ShutDown;

public abstract class MachineTypeCredentialsStage {

	public MachineTypeCredentialsStage() {

	}

	public int getRobotsWithSameFeature() {

		ShutDown.INSTANCE.execute();
		return -1;

	}

	public int getIdenticalRobots() {

		ShutDown.INSTANCE.execute();
		return -1;

	}

	public int getAdditionRobotsAmount() {

		ShutDown.INSTANCE.execute();
		return -1;

	}

	public int getGreaterThanValue() {

		ShutDown.INSTANCE.execute();
		return -1;

	}

	public int getLessThanValue() {

		ShutDown.INSTANCE.execute();
		return -1;

	}

}
