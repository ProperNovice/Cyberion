package gameStates;

import cards.CardMachineLessThan;
import enums.EMachineStage;
import gameStatesDefault.GameState;

public class JUnit extends GameState {

	@Override
	public void execute() {

		new CardMachineLessThan(EMachineStage.II, 6);

	}

}
