package cards;

import utils.ImageView;
import utils.Interfaces.IImageViewAble;

public abstract class CardBack implements IImageViewAble {

	public CardBack() {

		String filePath = getFilePath() + ".jpg";
		new ImageView(filePath, this);
		getImageView().setVisible(false);

	}

	protected String getFilePath() {
		return "cards/card back/";
	}

}
