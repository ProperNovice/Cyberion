package gameStates;

import controller.Lists;
import enums.EText;
import functions.AddCardFromRobotDeckToPlatform;
import gameStatesDefault.GameState;

public class FillPlatform extends GameState {

	@Override
	public void execute() {

		EText.FILL_PLATFORM.show();

	}

	@Override
	protected void executeTextOption(EText eText) {

		while (!Lists.INSTANCE.platform.getArrayList().isMaxCapacity())
			AddCardFromRobotDeckToPlatform.INSTANCE.execute();

		proceedToNextGameState();

	}

}
