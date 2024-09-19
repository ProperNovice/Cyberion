package cards;

import utils.Flow;
import utils.ImageView;
import utils.Interfaces.IImageViewAble;
import utils.Logger;

public abstract class Card implements IImageViewAble {

	public Card() {

	}

	protected final void createImageView(String filePath) {
		new ImageView(filePath, this);
	}

	protected String getFilePath() {
		return "cards/";
	}

	@Override
	public final void handleMousePressedPrimary() {
		Flow.INSTANCE.getGameStateCurrent().handleCardPressedPrimary(this);
	}

	public final void print() {

		Logger.INSTANCE.logNewLine("/*");
		Logger.INSTANCE.logNewLine("printing card");

		Logger.INSTANCE.log(this.getClass().getSimpleName());

		printCredentials();

		Logger.INSTANCE.newLine();
		Logger.INSTANCE.log("*/");

	}

	protected void printCredentials() {

	}

}
