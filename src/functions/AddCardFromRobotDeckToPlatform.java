package functions;

import cards.CardBot;
import controller.Lists;

public enum AddCardFromRobotDeckToPlatform {

	INSTANCE;

	public void execute() {

		CardBot cardBot = Lists.INSTANCE.robotDeck.getArrayList().removeFirst();
		Lists.INSTANCE.platform.getArrayList().addLast(cardBot);
		Lists.INSTANCE.platform.relocateImageViews();

	}

}
