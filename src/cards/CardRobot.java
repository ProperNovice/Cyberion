package cards;

import cardBackImageViews.CardBot;
import enums.EModel;

public class CardRobot extends CardBot {

	public CardRobot(EModel eModel, int size) {
		super(eModel, size);
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
