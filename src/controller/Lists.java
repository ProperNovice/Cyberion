package controller;

import cards.CardBot;
import utils.Enums.RearrangeTypeEnum;
import utils.ListImageViewAbles;

public enum Lists {

	INSTANCE;

	public ListImageViewAbles<CardBot> factory = new ListImageViewAbles<>();
	public ListImageViewAbles<CardBot> flash = new ListImageViewAbles<>();
	public ListImageViewAbles<CardBot> platform = new ListImageViewAbles<>();
	public ListImageViewAbles<CardBot> stock = new ListImageViewAbles<>();
	public ListImageViewAbles<CardBot> machineDeck = new ListImageViewAbles<>();
	public ListImageViewAbles<CardBot> robotDeck = new ListImageViewAbles<>();
	public ListImageViewAbles<CardBot> experiencePile = new ListImageViewAbles<>();
	public ListImageViewAbles<CardBot> discard = new ListImageViewAbles<>();

	private Lists() {

		// factory

		this.factory.getArrayList().setCapacity(5);
		this.factory.getListCredentials().coordinatesList = Credentials.INSTANCE.cFactory;

		// flash

		this.flash.getArrayList().setCapacity(5);
		this.flash.getListCredentials().coordinatesList = Credentials.INSTANCE.cFlash;

		// platform

		this.platform.getArrayList().setCapacity(5);
		this.platform.getListCredentials().coordinatesList = Credentials.INSTANCE.cPlatform;

		// stock

		this.stock.getArrayList().setCapacity(5);
		this.stock.getListCredentials().coordinatesList = Credentials.INSTANCE.cStock;

		// machine

		this.machineDeck.getListCredentials().coordinatesList = Credentials.INSTANCE.cMachineDeck;

		// robot deck

		this.robotDeck.getListCredentials().coordinatesList = Credentials.INSTANCE.cRobotDeck;
		this.robotDeck.getListCredentials().rearrangeTypeEnum = RearrangeTypeEnum.STATIC;

		// experience pile

		this.experiencePile
				.getListCredentials().coordinatesList = Credentials.INSTANCE.cExperiencePile;

		// discard

		this.discard.getListCredentials().coordinatesList = Credentials.INSTANCE.cDiscard;

	}

}
