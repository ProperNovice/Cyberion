package controller;

import cards.CardBack;
import cards.CardBackBot;
import utils.Interfaces.IImageViewAble;
import utils.ListImageViewAbles;

public enum CardBacks {

	INSTANCE;

	private CardBackBot cardBackBot = new CardBackBot();

	private CardBacks() {

		this.cardBackBot.getImageView().relocateTopLeft(Credentials.INSTANCE.cRobotDeck);

		execute();

	}

	public void execute() {

		executeCardBot();

	}

	private void executeCardBot() {
		executeList(Lists.INSTANCE.robotDeck, this.cardBackBot);
	}

	private void executeList(ListImageViewAbles<? extends IImageViewAble> list, CardBack cardBack) {

		boolean visibility = true;

		if (Lists.INSTANCE.robotDeck.getArrayList().isEmpty())
			visibility = false;

		cardBack.getImageView().setVisible(visibility);

		if (visibility)
			cardBack.getImageView().toFront();

	}

}
