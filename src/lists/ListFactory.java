package lists;

import cards.CardBot;
import utils.ListImageViewAbles;

public enum ListFactory {

	INSTANCE;

	private ListImageViewAbles<CardBot> list = new ListImageViewAbles<>();

	private ListFactory() {

		this.list.getArrayList().setCapacity(5);

	}

}
