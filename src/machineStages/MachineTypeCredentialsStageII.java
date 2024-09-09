package machineStages;

public class MachineTypeCredentialsStageII extends MachineTypeCredentials {

	@Override
	public int robotsWithSameFeature() {
		return 3;
	}

	@Override
	public int identicalRobots() {
		return 2;
	}

	@Override
	public int additionRobotsAmount() {
		return 3;
	}

}
