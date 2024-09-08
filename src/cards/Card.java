package cards;

import utils.ImageView;
import utils.Interfaces.IImageViewAble;

public abstract class Card implements IImageViewAble {

	public Card() {

	}

	protected final void createImageView(String filePath) {
		new ImageView(getFilePath(), this);
	}

	protected String getFilePath() {
		return "cards/";
	}

}
