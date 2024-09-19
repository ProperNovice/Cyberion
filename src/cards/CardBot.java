package cards;

import controller.CardBotFeatures;

public abstract class CardBot extends Card {

	private CardBotFeatures cardBotFeatures = null;

	public CardBot(CardBotFeatures cardBotFeatures) {

		this.cardBotFeatures = cardBotFeatures;
		createImageView(getFilePath());

	}

	public final CardBotFeatures getBotFeatures() {
		return this.cardBotFeatures;
	}

	@Override
	protected String getFilePath() {
		return super.getFilePath() + "bots/";
	}

	@Override
	protected void printCredentials() {
		this.cardBotFeatures.print();
	}

}
