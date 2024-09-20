package controller;

import cards.CardBot;
import cards.CardRobot;
import enums.EModel;
import utils.ArrayList;

public enum Decks {

	INSTANCE;

	private ArrayList<CardBot> deckRobots = new ArrayList<>();

	private Decks() {

		ArrayList<EModel> listModels = new ArrayList<>();

		listModels.addLast(EModel.COMMANDBOT);
		listModels.addLast(EModel.CYCLOBOT);
		listModels.addLast(EModel.PLANBOT);
		listModels.addLast(EModel.SIRENBOT);
		listModels.addLast(EModel.STOCKBOT);

		createDeckRobots(listModels);

	}

	private void createDeckRobots(ArrayList<EModel> listModels) {

		for (int cardAmount = 1; cardAmount <= 2; cardAmount++)
			for (EModel eModel : listModels)
				for (int size = 1; size <= 5; size++)
					Lists.INSTANCE.robotDeck.getArrayList().addLast(new CardRobot(eModel, size));

		Lists.INSTANCE.robotDeck.getArrayList().saveOriginal();
		Lists.INSTANCE.robotDeck.relocateImageViews();

	}

}
