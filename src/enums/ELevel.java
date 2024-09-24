package enums;

public enum ELevel {

	I(1, false), II(2, false), III(3, false), IV(4, false), V(5, true);

	private int upgradeMachineCardsRequired = -1;
	private boolean getFailsafeToken;

	private ELevel(int upgradeMachineCardsRequired, boolean getFailsafeToken) {
		this.upgradeMachineCardsRequired = upgradeMachineCardsRequired;
		this.getFailsafeToken = getFailsafeToken;
	}

	public int upgradeMachineCardsRequired() {
		return this.upgradeMachineCardsRequired;
	}

	public boolean getFailsafeToken() {
		return this.getFailsafeToken;
	}

}
