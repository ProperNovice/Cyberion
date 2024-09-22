package gameStates;

import controller.Lists;
import enums.EText;
import functions.MoveCardFromRobotDeckToPlatform;
import gameStatesDefault.GameState;

public class FillPlatform extends GameState {

	@Override
	public void execute() {

		EText.FILL_PLATFORM.show();

	}

	@Override
	protected void executeTextOption(EText eText) {

		while (!Lists.INSTANCE.platform.getArrayList().isMaxCapacity())
			MoveCardFromRobotDeckToPlatform.INSTANCE.execute();

		proceedToNextGameState();

	}

}
