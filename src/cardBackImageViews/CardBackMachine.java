package cardBackImageViews;

public abstract class CardBackMachine extends CardBack {

	@Override
	protected String getFilePath() {
		return super.getFilePath() + "card machine ";
	}

}
