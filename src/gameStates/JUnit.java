package gameStates;

import cards.CardMachineSameModel;
import cards.CardMachineSameSize;
import enums.EMachineStage;
import enums.EModel;
import gameStatesDefault.GameState;

public class JUnit extends GameState {

	@Override
	public void execute() {

		new CardMachineSameModel(EMachineStage.III, EModel.CYCLOBOT);
		new CardMachineSameSize(EMachineStage.III, 5);

	}

}
