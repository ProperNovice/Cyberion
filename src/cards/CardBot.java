package cards;

import controller.CardBotFeatures;

public abstract class CardBot extends Card {

	private CardBotFeatures botFeatures = null;

	public CardBot(CardBotFeatures botFeature) {

		this.botFeatures = botFeature;
		createImageView(getFilePath());

	}

	public final CardBotFeatures getBotFeatures() {
		return this.botFeatures;
	}

	@Override
	protected String getFilePath() {
		return super.getFilePath() + "bots/";
	}

}
