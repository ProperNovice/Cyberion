package cards;

import controller.BotFeature;

public abstract class Bot extends Card {

	private BotFeature botFeature = null;

	public Bot(BotFeature botFeature) {

		this.botFeature = botFeature;
		createImageView(getFilePath());

	}

	public final BotFeature getBotFeature() {
		return this.botFeature;
	}

	@Override
	protected String getFilePath() {
		return super.getFilePath() + "bots/";
	}

}
