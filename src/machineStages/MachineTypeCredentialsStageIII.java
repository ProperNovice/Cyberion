package machineStages;

public class MachineTypeCredentialsStageIII extends MachineTypeCredentials {

	@Override
	public int robotsWithSameFeature() {
		return 4;
	}

	@Override
	public int identicalRobots() {
		return 3;
	}

	@Override
	public int additionRobotsAmount() {
		return 4;
	}

}
