package model;

import enums.ELayerZ;
import utils.ImageView;
import utils.Interfaces.IImageViewAble;

public class DeviousCogFigure implements IImageViewAble {

	public DeviousCogFigure() {

		new ImageView("devious cog figure.png", ELayerZ.DEVIOUS_COG_FIGURE, this);

	}

}
