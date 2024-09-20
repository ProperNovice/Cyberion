package machineStages;

public class MachineTypeCredentialsStageII extends MachineTypeCredentialsStage {

	@Override
	public int getRobotsWithSameFeature() {
		return 3;
	}

	@Override
	public int getIdenticalRobots() {
		return 2;
	}

	@Override
	public int getAdditionRobotsAmount() {
		return 3;
	}

	@Override
	public int getGreaterThanValue() {
		return 12;
	}

	@Override
	public int getLessThanValue() {
		return 6;
	}

}
