package gameStates;

import functions.CreateDecks;
import gameStatesDefault.GameState;

public class JUnit extends GameState {

	@Override
	public void execute() {

		CreateDecks.INSTANCE.execute();

	}

}
