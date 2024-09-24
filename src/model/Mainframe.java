package model;

import controller.Credentials;
import enums.ELayerZ;
import enums.ELevel;
import enums.EModel;
import utils.HashMap;
import utils.ImageView;
import utils.Interfaces.IImageViewAble;
import utils.Interfaces.ISelectCoordinatesAble;
import utils.ShutDown;
import utils.Vector2;

public enum Mainframe {

	INSTANCE;

	private HashMap<EModel, MainFrameModel> mainframeModels = new HashMap<>();

	private Mainframe() {

		new MainframeImageView();

		double x = 151, y = 89, step = 83;

		this.mainframeModels.put(EModel.SIRENBOT, new MainFrameModel(x, y));
		y += step;
		this.mainframeModels.put(EModel.STOCKBOT, new MainFrameModel(x, y));
		y += step;
		this.mainframeModels.put(EModel.CYCLOBOT, new MainFrameModel(x, y));
		y += step;
		this.mainframeModels.put(EModel.PLANBOT, new MainFrameModel(x, y));
		y += step;
		this.mainframeModels.put(EModel.COMMANDBOT, new MainFrameModel(x, y));

	}

	public ELevel getDeviousCogFigureLevel(EModel eModel) {
		return this.mainframeModels.getValue(eModel).getDeviousCogFigureLevel();
	}

	public void upgradeMainFrameModel(EModel eModel) {
		this.mainframeModels.getValue(eModel).upgrade();
	}

	private class MainFrameModel {

		private Vector2 vector2 = null;
		private HashMap<ELevel, MainframeLevel> mainframeLevels = new HashMap<>();

		public MainFrameModel(double x, double y) {

			this.vector2 = Credentials.INSTANCE.cMainframe.clone();
			this.vector2.addXY(x, y);

			double xLevel = this.vector2.x;
			double yLevel = this.vector2.y;

			for (ELevel eLevel : ELevel.values()) {

				this.mainframeLevels.put(eLevel, new MainframeLevel(xLevel, yLevel));
				xLevel += 190;

				if (eLevel.equals(ELevel.I))
					this.mainframeLevels.getValue(eLevel)
							.addRelocateDeviousCogFigure(new DeviousCogFigure());

			}

		}

		public ELevel getDeviousCogFigureLevel() {

			for (ELevel eLevel : ELevel.values())
				if (this.mainframeLevels.getValue(eLevel).containsDeviousCogFigure())
					return eLevel;

			ShutDown.INSTANCE.execute();

			return null;

		}

		public void upgrade() {

			DeviousCogFigure deviousCogFigure = null;
			boolean upgradeToThisLevel = false;

			for (ELevel eLevel : ELevel.values()) {

				if (this.mainframeLevels.getValue(eLevel).containsDeviousCogFigure()) {

					deviousCogFigure = this.mainframeLevels.getValue(eLevel)
							.removeDeviousCogFigure();

					upgradeToThisLevel = true;

				} else if (upgradeToThisLevel) {

					this.mainframeLevels.getValue(eLevel)
							.addRelocateDeviousCogFigure(deviousCogFigure);

					return;

				}

			}

		}

	}

	private class MainframeLevel implements ISelectCoordinatesAble {

		private Vector2 vector2 = null;
		private DeviousCogFigure deviousCogFigure = null;

		public MainframeLevel(double x, double y) {
			this.vector2 = new Vector2(x, y);
		}

		public void addRelocateDeviousCogFigure(DeviousCogFigure deviousCogFigure) {

			this.deviousCogFigure = deviousCogFigure;
			this.deviousCogFigure.getImageView().relocateCenter(this.vector2);

		}

		public DeviousCogFigure removeDeviousCogFigure() {

			DeviousCogFigure deviousCogFigure = this.deviousCogFigure;
			this.deviousCogFigure = null;
			return deviousCogFigure;

		}

		public boolean containsDeviousCogFigure() {
			return this.deviousCogFigure != null;
		}

		@Override
		public Vector2 getCoordinatesCenter() {
			return this.vector2;
		}

		@Override
		public double getSelectDimension() {
			return Credentials.INSTANCE.dDeviousCogFigure.x;
		}

	}

	private class MainframeImageView implements IImageViewAble {

		public MainframeImageView() {

			new ImageView("mainframe.jpg", ELayerZ.MAINFRAME, this);
			getImageView().relocateTopLeft(Credentials.INSTANCE.cMainframe);

		}

	}

}
