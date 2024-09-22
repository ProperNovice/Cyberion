package controller;

import cards.CardBot;
import cards.CardMachine;
import utils.Enums.RearrangeTypeEnum;
import utils.ListImageViewAbles;

public enum Lists {

	INSTANCE;

	public ListImageViewAbles<CardMachine> factory = new ListImageViewAbles<>();
	public ListImageViewAbles<CardBot> flash = new ListImageViewAbles<>();
	public ListImageViewAbles<CardBot> platform = new ListImageViewAbles<>();
	public ListImageViewAbles<CardBot> stock = new ListImageViewAbles<>();
	public ListImageViewAbles<CardMachine> machineDeck = new ListImageViewAbles<>();
	public ListImageViewAbles<CardBot> robotDeck = new ListImageViewAbles<>();
	public ListImageViewAbles<CardMachine> experiencePile = new ListImageViewAbles<>();
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

		// machine deck

		this.machineDeck.getListCredentials().coordinatesList = Credentials.INSTANCE.cMachineDeck;
		this.machineDeck.getListCredentials().rearrangeTypeEnum = RearrangeTypeEnum.STATIC;
		this.machineDeck.getListCredentials().showListSize = true;

		// robot deck

		this.robotDeck.getListCredentials().coordinatesList = Credentials.INSTANCE.cRobotDeck;
		this.robotDeck.getListCredentials().rearrangeTypeEnum = RearrangeTypeEnum.STATIC;
		this.robotDeck.getListCredentials().showListSize = true;

		// experience pile

		this.experiencePile
				.getListCredentials().coordinatesList = Credentials.INSTANCE.cExperiencePile;
		this.experiencePile.getListCredentials().rearrangeTypeEnum = RearrangeTypeEnum.STATIC;

		// discard

		this.discard.getListCredentials().coordinatesList = Credentials.INSTANCE.cDiscard;
		this.discard.getListCredentials().rearrangeTypeEnum = RearrangeTypeEnum.STATIC;

	}

}
