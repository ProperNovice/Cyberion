package gameStates;

import cards.CardBot;
import cards.CardMachine;
import cards.CardMachineSameModel;
import cards.CardMachineSameSize;
import cards.CardRobot;
import controller.Lists;
import enums.EMachineStage;
import enums.EModel;
import functions.CreateDecks;
import gameStatesDefault.GameState;
import utils.Flow;
import utils.ListImageViewAbles;

public class JUnit extends GameState {

	@Override
	public void execute() {

		CreateDecks.INSTANCE.execute();

		addCardRobotToList(List.FLASH, EModel.COMMANDBOT, 4);
		addCardRobotToList(List.FLASH, EModel.SIRENBOT, 2);

		addCardRobotToList(List.PLATFORM, EModel.COMMANDBOT, 4);
		addCardRobotToList(List.PLATFORM, EModel.SIRENBOT, 2);
		addCardRobotToList(List.PLATFORM, EModel.CYCLOBOT, 4);
		addCardRobotToList(List.PLATFORM, EModel.CYCLOBOT, 4);
		addCardRobotToList(List.PLATFORM, EModel.SIRENBOT, 4);

		addCardRobotToList(List.STOCK, EModel.COMMANDBOT, 4);
		addCardRobotToList(List.STOCK, EModel.SIRENBOT, 2);

		addCardMachineSameModelToFactory(EMachineStage.I, EModel.CYCLOBOT);
		addCardMachineSameModelToFactory(EMachineStage.II, EModel.SIRENBOT);

		addCardMachineSameSizeToFactory(EMachineStage.II, 4);
		addCardMachineSameSizeToFactory(EMachineStage.I, 4);
		addCardMachineSameSizeToFactory(EMachineStage.II, 2);

		addCardsToExperiencePile(6);

//		Flow.INSTANCE.getFlow().addLast(FillFactory.class);
//		Flow.INSTANCE.getFlow().addLast(FillPlatform.class);
//		Flow.INSTANCE.getFlow().addLast(Intervation.class);
		Flow.INSTANCE.getFlow().addLast(Repair.class);

		proceedToNextGameState();

	}

	private enum List {

		FLASH(Lists.INSTANCE.flash), PLATFORM(Lists.INSTANCE.platform), STOCK(Lists.INSTANCE.stock);

		private ListImageViewAbles<CardBot> list = null;

		private List(ListImageViewAbles<CardBot> list) {
			this.list = list;
		}

		public ListImageViewAbles<CardBot> getList() {
			return this.list;
		}

	}

	public void addCardRobotToList(List list, EModel eModel, int size) {

		CardBot cardBot = new CardRobot(eModel, size);
		list.getList().getArrayList().addLast(cardBot);
		list.getList().relocateImageViews();

	}

	public void addCardsToExperiencePile(int amount) {

		for (int counter = 1; counter <= amount; counter++) {

			CardMachine cardMachine = Lists.INSTANCE.machineDeck.getArrayList().removeFirst();
			lists().experiencePile.getArrayList().addFirst(cardMachine);
			lists().experiencePile.relocateImageViews();

		}

	}

	public void addCardMachineSameModelToFactory(EMachineStage eMachineStage, EModel eModel) {

		CardMachine cardMachine = new CardMachineSameModel(eMachineStage, eModel);
		lists().factory.getArrayList().addLast(cardMachine);
		lists().factory.relocateImageViews();

	}

	public void addCardMachineSameSizeToFactory(EMachineStage eMachineStage, int size) {

		CardMachine cardMachine = new CardMachineSameSize(eMachineStage, size);
		lists().factory.getArrayList().addLast(cardMachine);
		lists().factory.relocateImageViews();

	}

}
