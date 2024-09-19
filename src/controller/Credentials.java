package controller;

import utils.Enums.RearrangeTypeEnum;
import utils.Vector2;

public enum Credentials {

	INSTANCE;

	public String primaryStageTitle = "Cyberion", numbersImageViewColor = "black";
	public boolean colliderVisibility = true;
	public final double stagePixesOnTheLeft = 180, gapBetweenBorders = 10, textHeight = 50,
			selectEventHandlerAbleDimension = 100, imageViewCloneWidth = 200, animationStep = 4,
			cameraViewSpots = 1;
	public Vector2 dFrame, dGapBetweenComponents, dCameraView, dGapBetweenComponentsLineCast;
	public Vector2 cTextPanel, cImageViewClone;
	public RearrangeTypeEnum rearrangeTypeEnumText = RearrangeTypeEnum.LINEAR;

	public Vector2 dCard;
	public Vector2 cFactory, cFlash, cPlatform, cStock, cMachineDeck, cRobotDeck, cExperiencePile,
			cDiscard;

	private Credentials() {

		double x = 0, y = 0;

		// frame

		this.dFrame = new Vector2(2560 - 4 - 636, 1368);

		// gaps

		this.dGapBetweenComponents = new Vector2(4, 4);
		this.dGapBetweenComponentsLineCast = this.dGapBetweenComponents;

		// camera view

		this.dCameraView = new Vector2(1, 1);

		// c text panel

		x = 0;
		y = 0;

		this.cTextPanel = new Vector2(x, y);

		// c image view indicator

		x = this.gapBetweenBorders;
		y = this.gapBetweenBorders;
		this.cImageViewClone = new Vector2(x, y);

		// d card

		x = 223;
		y = 334;
		this.dCard = new Vector2(x, y);

		// c factory

		x = this.dFrame.x / 2;
		x -= 2.5 * this.dCard.x;
		x -= 2 * this.dGapBetweenComponents.x;
		y = this.gapBetweenBorders;
		this.cFactory = new Vector2(x, y);

		// c flash

		x = this.cFactory.x;
		y = this.cFactory.y;
		y += this.dCard.y;
		y += this.dCard.y;
		this.cFlash = new Vector2(x, y);

		// c platform

		x = this.cFlash.x;
		y = this.cFlash.y;
		this.cPlatform = new Vector2(x, y);

		// c stock

		x = this.cPlatform.x;
		y = this.cPlatform.y;
		this.cStock = new Vector2(x, y);

		// c machine deck

		x = this.cFactory.x;
		x -= this.dCard.x;
		x -= this.dGapBetweenComponents.x;
		y = this.cFactory.y;
		this.cMachineDeck = new Vector2(x, y);

		// c experience pile

		x = this.cMachineDeck.x;
		x -= this.dCard.x;
		x -= this.dGapBetweenComponents.x;
		y = this.cMachineDeck.y;
		this.cExperiencePile = new Vector2(x, y);

		// c robot deck

		x = this.cPlatform.x;
		x -= this.dCard.x;
		x -= this.dGapBetweenComponents.x;
		y = this.cPlatform.y;
		this.cRobotDeck = new Vector2(x, y);

		// c discard

		x = this.cRobotDeck.x;
		x -= this.dCard.x;
		x -= this.dGapBetweenComponents.x;
		y = this.cRobotDeck.y;
		this.cDiscard = new Vector2(x, y);

	}

}
