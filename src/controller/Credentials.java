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
	public boolean primaryStageFullScreen = true;

	public Vector2 dCard, dMainframe, dDeviousCogFigure;
	public Vector2 cFactory, cFlash, cPlatform, cStock, cMachineDeck, cRobotDeck, cExperiencePile,
			cDiscard, cMainframe;

	private Credentials() {

		double x = 0, y = 0;

		// frame

		this.dFrame = new Vector2(2560, 1440);
		this.dFrame.x = java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		this.dFrame.y = java.awt.Toolkit.getDefaultToolkit().getScreenSize().getHeight();

		if (!this.primaryStageFullScreen) {

			this.dFrame.x -= 636 + 4;
			this.dFrame.y -= 72;

		}

		// gaps

		this.dGapBetweenComponents = new Vector2(4, 4);
		this.dGapBetweenComponentsLineCast = this.dGapBetweenComponents;

		// camera view

		this.dCameraView = new Vector2(1, 1);

		// c image view indicator

		x = this.gapBetweenBorders;
		y = this.gapBetweenBorders;
		this.cImageViewClone = new Vector2(x, y);

		// d card

		x = 223;
		y = 334;
		this.dCard = new Vector2(x, y);

		// c experience pile

		x = this.gapBetweenBorders;
		y = this.gapBetweenBorders;
		this.cExperiencePile = new Vector2(x, y);

		// c machine deck

		x = this.cExperiencePile.x;
		x += this.dCard.x;
		x += this.dGapBetweenComponents.x;
		y = this.cExperiencePile.y;
		this.cMachineDeck = new Vector2(x, y);

		// c factory

		x = this.cMachineDeck.x;
		x += this.dCard.x;
		x += this.dGapBetweenComponents.x;
		y = this.cMachineDeck.y;
		this.cFactory = new Vector2(x, y);

		// c flash

		x = this.cFactory.x;
		y = this.cFactory.y;
		y += this.dCard.y;
		y += this.dGapBetweenComponents.y;
		this.cFlash = new Vector2(x, y);

		// c discard

		x = this.cExperiencePile.y;
		y = this.cFlash.y;
		y += this.dCard.y;
		y += this.dGapBetweenComponents.y;
		this.cDiscard = new Vector2(x, y);

		// c robot deck

		x = this.cDiscard.x;
		x += this.dCard.x;
		x += this.dGapBetweenComponents.x;
		y = this.cDiscard.y;
		this.cRobotDeck = new Vector2(x, y);

		// c platform

		x = this.cFlash.x;
		y = this.cFlash.y;
		y += this.dCard.y;
		y += this.dGapBetweenComponents.y;
		this.cPlatform = new Vector2(x, y);

		// c stock

		x = this.cPlatform.x;
		y = this.cPlatform.y;
		y += this.dCard.y;
		y += this.dGapBetweenComponents.y;
		this.cStock = new Vector2(x, y);

		// d mainframe

		x = 951;
		y = 479;
		this.dMainframe = new Vector2(x, y);

		// c mainframe

		x = this.cExperiencePile.x;
		x += 7 * (this.dCard.x + this.dGapBetweenComponents.x);
		y = this.cExperiencePile.y;
		this.cMainframe = new Vector2(x, y);

		// c text panel

		x = this.cMainframe.x;
		y = this.cMainframe.y;
		y += this.dMainframe.y + this.dGapBetweenComponents.y;
		this.cTextPanel = new Vector2(x, y);

		// d devious cog figure

		x = 58;
		y = 51;
		this.dDeviousCogFigure = new Vector2(x, y);

	}

}
