package controller;

import cardBackImageViews.CardBackBot;
import enums.EMachineStage;
import images.CardBackMachine;
import images.CardBackmachineStageI;
import images.CardBackmachineStageII;
import images.CardBackmachineStageIII;
import utils.HashMap;

public enum CardBacks {

	INSTANCE;

	private CardBackBot cardBackBot = new CardBackBot();
	private HashMap<EMachineStage, CardBackMachine> hashMapCardBackMachines = new HashMap<>();

	private CardBacks() {

		this.cardBackBot.getImageView().relocateTopLeft(Credentials.INSTANCE.cRobotDeck);

		this.hashMapCardBackMachines.put(EMachineStage.I, new CardBackmachineStageI());
		this.hashMapCardBackMachines.put(EMachineStage.II, new CardBackmachineStageII());
		this.hashMapCardBackMachines.put(EMachineStage.III, new CardBackmachineStageIII());

		for (EMachineStage eMachineStage : EMachineStage.values())
			this.hashMapCardBackMachines.getValue(eMachineStage).getImageView()
					.relocateTopLeft(Credentials.INSTANCE.cMachineDeck);

		execute();

	}

	public void execute() {

		executeRobotDeck();
		executeCardMachineDeck();

	}

	private void executeCardMachineDeck() {

		for (EMachineStage eMachineStage : EMachineStage.values())
			this.hashMapCardBackMachines.getValue(eMachineStage).getImageView().setVisible(false);

		if (Lists.INSTANCE.machineDeck.getArrayList().isEmpty())
			return;

		EMachineStage eMachineStageFirstCard = Lists.INSTANCE.machineDeck.getArrayList().getFirst()
				.getEMachineStage();

		this.hashMapCardBackMachines.getValue(eMachineStageFirstCard).getImageView()
				.setVisible(true);
		this.hashMapCardBackMachines.getValue(eMachineStageFirstCard).getImageView().toFront();

	}

	private void executeRobotDeck() {

		boolean visibility = true;

		if (Lists.INSTANCE.robotDeck.getArrayList().isEmpty())
			visibility = false;

		this.cardBackBot.getImageView().setVisible(visibility);

		if (visibility)
			this.cardBackBot.getImageView().toFront();

	}

}
