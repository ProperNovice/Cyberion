package functions;

import cardBackImageViews.CardBot;
import cards.CardMachine;
import controller.CardBacks;
import controller.Decks;
import controller.Lists;
import enums.EMachineStage;
import utils.ArrayList;
import utils.Enums.ListsSaveLoad;

public enum CreateDecks {

	INSTANCE;

	public void execute() {

		ListsSaveLoad.INSTANCE.clearLists();

		createDeckBots();
		createDeckMachines();

		CardBacks.INSTANCE.execute();

	}

	private void createDeckBots() {

		ArrayList<CardBot> list = Decks.INSTANCE.getDeckRobots();
		list.shuffle();

		Lists.INSTANCE.robotDeck.getArrayList().addAllLast(list);
		Lists.INSTANCE.robotDeck.relocateImageViews();

	}

	private void createDeckMachines() {

		createDeckMachineStage(EMachineStage.I);
		createDeckMachineStage(EMachineStage.II);

		for (CardMachine cardMachine : Decks.INSTANCE.getDeckMachine(EMachineStage.III))
			cardMachine.getImageView().setVisible(false);

	}

	private void createDeckMachineStage(EMachineStage eMachineStage) {

		ArrayList<CardMachine> list = Decks.INSTANCE.getDeckMachine(eMachineStage);
		list.shuffle();

		Lists.INSTANCE.machineDeck.getArrayList().addAllLast(list);
		Lists.INSTANCE.machineDeck.relocateImageViews();

	}

}
