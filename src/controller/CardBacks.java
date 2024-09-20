package controller;

import cardBackImageViews.CardBackBot;

public enum CardBacks {

	INSTANCE;

	private CardBackBot cardBackBot = new CardBackBot();

	private CardBacks() {

		this.cardBackBot.getImageView().relocateTopLeft(Credentials.INSTANCE.cRobotDeck);

		execute();

	}

	public void execute() {

		executeRobotDeck();

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
