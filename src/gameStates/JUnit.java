package gameStates;

import cards.CardRobot;
import controller.CardBotFeatures;
import enums.EModel;
import gameStatesDefault.GameState;

public class JUnit extends GameState {

	@Override
	public void execute() {

		new CardRobot(new CardBotFeatures(EModel.SIRENBOT, 3));

	}

}
