package gameStates;

import cards.CardBot;
import cards.CardMachine;
import cards.CardMachineSameModel;
import cards.CardMachineSameSize;
import enums.EModel;
import enums.EText;
import gameStatesDefault.GameState;
import machineStages.MachineTypeCredentialsStage;
import utils.ArrayList;

public class Repair extends GameState {

	private ArrayList<CardBot> cardsBotSelected = new ArrayList<>();
	private CardMachine cardsMachineSelected = null;

	@Override
	public void execute() {

		concealText();

		EText.CHOOSE_BOTS_AND_MACHINE.show();

		if (canRepair())
			EText.REPAIR_OPTION.show();

		EText.CANCEL.show();

	}

	@Override
	protected void handleCardBotPressedFlash(CardBot cardBot) {
		executeCardBotPressed(cardBot);
	}

	@Override
	protected void handleCardBotPressedPlatform(CardBot cardBot) {
		executeCardBotPressed(cardBot);
	}

	@Override
	protected void handleCardBotPressedStock(CardBot cardBot) {
		executeCardBotPressed(cardBot);
	}

	private void executeCardBotPressed(CardBot cardBot) {

		if (cardBot.isSelected())
			this.cardsBotSelected.remove(cardBot);
		else
			this.cardsBotSelected.addLast(cardBot);

		cardBot.reverseSelected();
		execute();

	}

	@Override
	protected void handleCardMachineFactoryPressed(CardMachine cardMachine) {

		if (cardMachine.isSelected())
			this.cardsMachineSelected = null;
		else {

			if (this.cardsMachineSelected != null)
				this.cardsMachineSelected.reverseSelected();

			this.cardsMachineSelected = cardMachine;

		}

		cardMachine.reverseSelected();
		execute();

	}

	private boolean canRepair() {

		if (this.cardsMachineSelected == null)
			return false;

		if (this.cardsMachineSelected instanceof CardMachineSameModel)
			return canRepairSameModel();

		else if (this.cardsMachineSelected instanceof CardMachineSameSize)
			return canRepairSameSize();

		return false;

	}

	private boolean canRepairSameModel() {

		CardMachineSameModel cardMachineSameModel = (CardMachineSameModel) this.cardsMachineSelected;

		EModel eModel = cardMachineSameModel.getEModel();
		MachineTypeCredentialsStage machineTypeCredentialsStage = this.cardsMachineSelected
				.getMachineTypeCredentials();

		if (machineTypeCredentialsStage.getRobotsWithSameFeature() != this.cardsBotSelected.size())
			return false;

		for (CardBot cardBot : this.cardsBotSelected)
			if (!cardBot.getBotFeatures().getEModel().equals(eModel))
				return false;

		return true;

	}

	private boolean canRepairSameSize() {

		CardMachineSameSize cardMachineSameSize = (CardMachineSameSize) this.cardsMachineSelected;

		int size = cardMachineSameSize.getSize();
		MachineTypeCredentialsStage machineTypeCredentialsStage = this.cardsMachineSelected
				.getMachineTypeCredentials();

		if (machineTypeCredentialsStage.getRobotsWithSameFeature() != this.cardsBotSelected.size())
			return false;

		for (CardBot cardBot : this.cardsBotSelected)
			if (cardBot.getBotFeatures().getSize() != size)
				return false;

		return true;

	}

}
