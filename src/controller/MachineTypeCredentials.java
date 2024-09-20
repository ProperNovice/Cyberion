package controller;

import enums.EMachineStage;
import machineStages.MachineTypeCredentialsStage;
import machineStages.MachineTypeCredentialsStageI;
import machineStages.MachineTypeCredentialsStageII;
import machineStages.MachineTypeCredentialsStageIII;
import utils.HashMap;

public enum MachineTypeCredentials {

	INSTANCE;

	private HashMap<EMachineStage, MachineTypeCredentialsStage> hashMap = new HashMap<>();

	private MachineTypeCredentials() {

		this.hashMap.put(EMachineStage.I, new MachineTypeCredentialsStageI());
		this.hashMap.put(EMachineStage.II, new MachineTypeCredentialsStageII());
		this.hashMap.put(EMachineStage.III, new MachineTypeCredentialsStageIII());

	}

	public int getRobotsWithSameFeature(EMachineStage eMachineStage) {
		return this.hashMap.getValue(eMachineStage).getRobotsWithSameFeature();

	}

	public int getIdenticalRobots(EMachineStage eMachineStage) {
		return this.hashMap.getValue(eMachineStage).getIdenticalRobots();

	}

	public int getAdditionRobotsAmount(EMachineStage eMachineStage) {
		return this.hashMap.getValue(eMachineStage).getAdditionRobotsAmount();

	}

	public int getGreaterThanValue(EMachineStage eMachineStage) {
		return this.hashMap.getValue(eMachineStage).getGreaterThanValue();

	}

	public int getLessThanValue(EMachineStage eMachineStage) {
		return this.hashMap.getValue(eMachineStage).getLessThanValue();

	}

}
