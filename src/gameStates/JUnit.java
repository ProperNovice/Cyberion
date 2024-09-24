package gameStates;

import functions.CreateDecks;
import gameStatesDefault.GameState;
import utils.Flow;

public class JUnit extends GameState {

	@Override
	public void execute() {

		CreateDecks.INSTANCE.execute();

		Flow.INSTANCE.getFlow().addLast(FillFactory.class);
		Flow.INSTANCE.getFlow().addLast(FillPlatform.class);

		proceedToNextGameState();

	}

}
