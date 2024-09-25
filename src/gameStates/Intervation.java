package gameStates;

import enums.EText;
import gameStatesDefault.GameState;
import model.Mainframe;

public class Intervation extends GameState {

	@Override
	public void execute() {

		showText();

	}

	private void showText() {

		EText.INTERVATION.show();
		handleRepair();
		handleTrigger();
		handleUpgrade();

	}

	private void handleRepair() {
		EText.REPAIR_OPTION.show();
	}

	private void handleTrigger() {

		EText.TRIGGER.show();

	}

	private void handleUpgrade() {

		int experienceCardsAvailable = lists().experiencePile.getArrayList().size();
		int experienceCardsRequired = Mainframe.INSTANCE.getLowestELevel()
				.getUpgradeMachineCardsRequired();

		if (experienceCardsAvailable < experienceCardsRequired)
			return;

		EText.UPGRADE.show();

	}

}
