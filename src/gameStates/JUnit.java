package gameStates;

import cards.CardMachine;
import cards.CardRobot;
import controller.Lists;
import enums.EModel;
import functions.CreateDecks;
import gameStatesDefault.GameState;
import utils.Flow;

public class JUnit extends GameState {

	@Override
	public void execute() {

		CreateDecks.INSTANCE.execute();

		addCardRobotToFlash(EModel.COMMANDBOT, 4);
		addCardRobotToFlash(EModel.SIRENBOT, 2);

		addCardRobotToFactory(EModel.COMMANDBOT, 4);
		addCardRobotToFactory(EModel.SIRENBOT, 2);

		addCardRobotToStock(EModel.COMMANDBOT, 4);
		addCardRobotToStock(EModel.SIRENBOT, 2);

		addCardsToExperiencePile(6);

		Flow.INSTANCE.getFlow().addLast(FillFactory.class);
		Flow.INSTANCE.getFlow().addLast(FillPlatform.class);

		proceedToNextGameState();

	}

	public void addCardRobotToFlash(EModel eModel, int size) {

		CardRobot cardRobot = new CardRobot(eModel, size);
		Lists.INSTANCE.flash.getArrayList().addLast(cardRobot);
		Lists.INSTANCE.flash.relocateImageViews();

	}

	public void addCardRobotToFactory(EModel eModel, int size) {

		CardRobot cardRobot = new CardRobot(eModel, size);
		Lists.INSTANCE.platform.getArrayList().addLast(cardRobot);
		Lists.INSTANCE.platform.relocateImageViews();

	}

	public void addCardRobotToStock(EModel eModel, int size) {

		CardRobot cardRobot = new CardRobot(eModel, size);
		Lists.INSTANCE.stock.getArrayList().addLast(cardRobot);
		Lists.INSTANCE.stock.relocateImageViews();

	}

	public void addCardsToExperiencePile(int amount) {

		for (int counter = 1; counter <= amount; counter++) {

			CardMachine cardMachine = Lists.INSTANCE.machineDeck.getArrayList().removeFirst();
			lists().experiencePile.getArrayList().addFirst(cardMachine);
			lists().experiencePile.relocateImageViews();

		}

	}

}
