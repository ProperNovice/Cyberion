package cards;

import controller.CardBotFeatures;
import enums.EModel;

public abstract class CardBot extends Card {

	private CardBotFeatures cardBotFeatures = null;

	public CardBot(EModel eModel, int size) {

		this.cardBotFeatures = new CardBotFeatures(eModel, size);
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
