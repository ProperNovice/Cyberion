package functions;

import cards.CardBot;
import controller.CardBacks;
import controller.Lists;

public enum MoveCardFromRobotDeckToPlatform {

	INSTANCE;

	public void execute() {

		CardBot cardBot = Lists.INSTANCE.robotDeck.getArrayList().removeFirst();
		Lists.INSTANCE.platform.getArrayList().addLast(cardBot);
		Lists.INSTANCE.platform.relocateImageViews();
		CardBacks.INSTANCE.execute();

	}

}
