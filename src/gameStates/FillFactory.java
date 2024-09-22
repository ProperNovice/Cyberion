package gameStates;

import controller.Lists;
import enums.EText;
import functions.MoveCardFromMachineDeckToFactory;
import gameStatesDefault.GameState;

public class FillFactory extends GameState {

	@Override
	public void execute() {

		EText.FILL_FACTORY.show();

	}

	@Override
	protected void executeTextOption(EText eText) {

		while (!Lists.INSTANCE.factory.getArrayList().isMaxCapacity()
				&& !Lists.INSTANCE.machineDeck.getArrayList().isEmpty())
			MoveCardFromMachineDeckToFactory.INSTANCE.execute();

		proceedToNextGameState();

	}

}
