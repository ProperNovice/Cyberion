package gameStatesDefault;

import cards.Card;
import cards.CardBot;
import cards.CardMachine;
import controller.Credentials;
import controller.Lists;
import enums.EText;
import javafx.scene.input.KeyCode;
import utils.Animation;
import utils.ArrayList;
import utils.CameraView;
import utils.Flow;
import utils.KeyCodeHandler;
import utils.Logger;
import utils.SelectImageViewManager;
import utils.TextManager;
import utils.Vector2;

public abstract class GameState {

	public abstract void execute();

	public final void handleTextOptionPressed(EText textEnum) {

		Logger.INSTANCE.log("text option executing");
		Logger.INSTANCE.logNewLine(textEnum);

		concealText();
		executeTextOption(textEnum);

	}

	public final void executeKeyPressed(KeyCode keyCode) {

		if (Animation.INSTANCE.isAnimating())
			return;

		handleKeyPressed(keyCode);

		// e text

		int keyCodeETextID = KeyCodeHandler.INSTANCE.getKeyCodeETextInt(keyCode);

		if (keyCodeETextID != -1) {

			EText textEnumPressed = TextManager.INSTANCE.getTextEnumOptionPressed(keyCodeETextID);

			if (textEnumPressed == null)
				return;

			Logger.INSTANCE.log("executing key pressed -> " + keyCode);
			handleTextOptionPressed(textEnumPressed);

		}

		// camera view

		int cameraViewSpot = KeyCodeHandler.INSTANCE.getKeyCodeCameraViewInt(keyCode);

		if (cameraViewSpot > 0 && cameraViewSpot <= Credentials.INSTANCE.cameraViewSpots)
			CameraView.INSTANCE.setCameraViewingSpot(cameraViewSpot);

	}

	protected void handleKeyPressed(KeyCode keyCode) {

	}

	protected void executeTextOption(EText eText) {

	}

	public final void handleBackgroundPressed(Vector2 vector2) {

	}

	protected final ArrayList<Class<? extends GameState>> getFlow() {
		return Flow.INSTANCE.getFlow();
	}

	protected final void executeGameState(Class<? extends GameState> gameState) {
		Flow.INSTANCE.executeGameState(gameState);
	}

	protected final void proceedToNextGameState() {
		Flow.INSTANCE.proceed();
	}

	protected final void concealText() {
		TextManager.INSTANCE.concealTexts();
	}

	protected final SelectImageViewManager getSelectImageViewManager() {
		return SelectImageViewManager.INSTANCE;
	}

	protected final Lists lists() {
		return Lists.INSTANCE;
	}

	public final void handleCardPressedPrimary(Card card) {

		if (card instanceof CardBot)
			handleCardBotPressed((CardBot) card);
		else if (card instanceof CardMachine)
			handleCardMachinePressed((CardMachine) card);

	}

	protected final void handleCardBotPressed(CardBot cardBot) {

		if (Lists.INSTANCE.flash.getArrayList().contains(cardBot))
			handleCardBotPressedFlash(cardBot);
		else if (Lists.INSTANCE.platform.getArrayList().contains(cardBot))
			handleCardBotPressedPlatform(cardBot);
		else if (Lists.INSTANCE.stock.getArrayList().contains(cardBot))
			handleCardBotPressedStock(cardBot);

	}

	protected void handleCardBotPressedFlash(CardBot cardBot) {

	}

	protected void handleCardBotPressedPlatform(CardBot cardBot) {

	}

	protected void handleCardBotPressedStock(CardBot cardBot) {

	}

	protected final void handleCardMachinePressed(CardMachine cardMachine) {

		if (lists().factory.getArrayList().contains(cardMachine))
			handleCardMachineFactoryPressed(cardMachine);

	}

	protected void handleCardMachineFactoryPressed(CardMachine cardMachine) {

	}

}
