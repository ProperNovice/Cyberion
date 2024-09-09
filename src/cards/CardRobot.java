package cards;

import controller.CardBotFeatures;

public class CardRobot extends CardBot {

	public CardRobot(CardBotFeatures cardBotFeatures) {
		super(cardBotFeatures);
	}

	@Override
	protected String getFilePath() {

		String filePath = super.getFilePath();
		filePath += "robots/";
		filePath += this.getBotFeatures().getEModel().toString().toLowerCase() + "/";
		filePath += this.getBotFeatures().getSize() + ".jpg";

		return filePath;

	}

}
