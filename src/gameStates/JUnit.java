package gameStates;

import cards.Robot;
import controller.BotFeature;
import enums.EModel;
import gameStatesDefault.GameState;

public class JUnit extends GameState {

	@Override
	public void execute() {

		new Robot(new BotFeature(EModel.SIRENBOT, 3));

	}

}
