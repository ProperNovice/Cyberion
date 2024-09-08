package cards;

import controller.BotFeature;

public class Robot extends Bot {

	public Robot(BotFeature botFeature) {
		super(botFeature);
	}

	@Override
	protected String getFilePath() {

		String filePath = super.getFilePath();
		System.out.println(filePath);
		filePath += "robots/";
		filePath += this.getBotFeature().getEModel().toString().toLowerCase() + "/";
		filePath += this.getBotFeature().getSize() + ".jpg";

		return filePath;

	}

}
