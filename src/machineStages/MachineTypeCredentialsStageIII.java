package machineStages;

public class MachineTypeCredentialsStageIII extends MachineTypeCredentialsStage {

	@Override
	public int getRobotsWithSameFeature() {
		return 4;
	}

	@Override
	public int getIdenticalRobots() {
		return 3;
	}

	@Override
	public int getAdditionRobotsAmount() {
		return 4;
	}

	@Override
	public int getGreaterThanValue() {
		return 15;
	}

	@Override
	public int getLessThanValue() {
		return 9;
	}

}
