package cards;

import controller.BotFeature;
import utils.ImageView;

public abstract class Bot extends Card {

	private BotFeature botFeature = null;

	public Bot(BotFeature botFeature) {

		this.botFeature = botFeature;
		new ImageView(getFilePath(), this);

	}

	public final BotFeature getBotFeature() {
		return this.botFeature;
	}

	@Override
	protected String getFilePath() {
		return super.getFilePath() + "bots/";
	}

}
