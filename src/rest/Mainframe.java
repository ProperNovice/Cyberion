package rest;

import controller.Credentials;
import enums.ELayerZ;
import enums.EModel;
import utils.HashMap;
import utils.ImageView;
import utils.Interfaces.IImageViewAble;
import utils.Interfaces.ISelectCoordinatesAble;
import utils.Vector2;

public enum Mainframe {

	INSTANCE;

	private MainframeImageView mainframeImageView = new MainframeImageView();
	private HashMap<EModel, MainFrameModel> mainframeModels = new HashMap<>();

	private Mainframe() {

		this.mainframeModels.put(EModel.SIRENBOT, new MainFrameModel(151, 89));
		this.mainframeModels.put(EModel.STOCKBOT, new MainFrameModel(151, 173));
		this.mainframeModels.put(EModel.CYCLOBOT, new MainFrameModel(151, 257));
		this.mainframeModels.put(EModel.PLANBOT, new MainFrameModel(151, 340));
		this.mainframeModels.put(EModel.COMMANDBOT, new MainFrameModel(151, 425));

	}

	private class MainFrameModel {

		private Vector2 vector2 = null;

		public MainFrameModel(double x, double y) {

			this.vector2 = Credentials.INSTANCE.cMainframe.clone();
			this.vector2.addXY(x, y);

			new DeviousCogFigure().getImageView().relocateCenter(this.vector2);

		}

	}

	private class MainframeLevel implements ISelectCoordinatesAble {

		public MainframeLevel() {

		}

		@Override
		public Vector2 getCoordinatesCenter() {
			return null;
		}

	}

	private class MainframeImageView implements IImageViewAble {

		public MainframeImageView() {

			new ImageView("mainframe.jpg", ELayerZ.MAINFRAME, this);
			getImageView().relocateTopLeft(Credentials.INSTANCE.cMainframe);

		}

	}

}
