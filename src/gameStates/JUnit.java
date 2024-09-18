package gameStates;

import cards.CardMachineStraight;
import enums.EMachineStage;
import gameStatesDefault.GameState;

public class JUnit extends GameState {

	@Override
	public void execute() {

		new CardMachineStraight(EMachineStage.III);

	}

}
