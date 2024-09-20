package controller;

import cards.CardBot;
import cards.CardMachine;
import cards.CardMachineGreaterThan;
import cards.CardMachineIdentical;
import cards.CardMachineLessThan;
import cards.CardMachineSameModel;
import cards.CardMachineSameSize;
import cards.CardRobot;
import enums.EMachineStage;
import enums.EModel;
import utils.ArrayList;
import utils.HashMap;

public enum Decks {

	INSTANCE;

	private ArrayList<CardBot> deckRobots = new ArrayList<>();
	private HashMap<EMachineStage, ArrayList<CardMachine>> deckMachines = new HashMap<>();

	private Decks() {

		ArrayList<EModel> listModels = new ArrayList<>();

		listModels.addLast(EModel.COMMANDBOT);
		listModels.addLast(EModel.CYCLOBOT);
		listModels.addLast(EModel.PLANBOT);
		listModels.addLast(EModel.SIRENBOT);
		listModels.addLast(EModel.STOCKBOT);

		createDeckRobots(listModels);
		createDeckMachines(listModels);

		System.out.println(this.deckRobots.size());

		for (EMachineStage eMachineStage : EMachineStage.values())
			System.out.println(this.deckMachines.getValue(eMachineStage).size());

	}

	private void createDeckRobots(ArrayList<EModel> listModels) {

		for (int cardAmount = 1; cardAmount <= 2; cardAmount++)
			for (EModel eModel : listModels)
				for (int size = 1; size <= 5; size++)
					this.deckRobots.addLast(new CardRobot(eModel, size));

	}

	private void createDeckMachines(ArrayList<EModel> listModels) {

		for (EMachineStage eMachineStage : EMachineStage.values())
			this.deckMachines.put(eMachineStage, new ArrayList<>());

		for (EMachineStage eMachineStage : EMachineStage.values()) {

			int a = 1; // TODO

			ArrayList<CardMachine> list = this.deckMachines.getValue(eMachineStage);

			// same model

			for (EModel eModel : listModels)
				list.addLast(new CardMachineSameModel(eMachineStage, eModel));

			// same size

			for (int counter = 1; counter <= 5; counter++)
				list.addLast(new CardMachineSameSize(eMachineStage, counter));

			if (eMachineStage.equals(EMachineStage.I))
				continue;

			// identical

			list.addLast(new CardMachineIdentical(eMachineStage));

			if (a == 1) // TODO
				continue;

			// addition

			list.addLast(new CardMachineGreaterThan(eMachineStage));
			list.addLast(new CardMachineLessThan(eMachineStage));

		}

	}

	public ArrayList<CardBot> getDeckRobots() {
		return this.deckRobots.clone();
	}

	public ArrayList<CardMachine> getDeckMachine(EMachineStage eMachineStage) {
		return this.deckMachines.getValue(eMachineStage).clone();
	}

}
