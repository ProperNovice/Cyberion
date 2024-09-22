package functions;

import cards.CardMachine;
import controller.Lists;

public enum MoveCardFromMachineDeckToFactory {

	INSTANCE;

	public void execute() {

		CardMachine cardMachine = Lists.INSTANCE.machineDeck.getArrayList().removeFirst();
		Lists.INSTANCE.factory.getArrayList().addLast(cardMachine);
		Lists.INSTANCE.factory.relocateImageViews();

	}

}
