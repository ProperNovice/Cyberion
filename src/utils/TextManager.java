package utils;

import controller.Credentials;
import enums.EText;
import symbols.Symbol;
import symbols.Symbol0;
import symbols.Symbol1;
import symbols.Symbol2;
import symbols.Symbol3;
import symbols.Symbol4;
import symbols.Symbol5;
import symbols.Symbol6;
import symbols.Symbol7;
import symbols.Symbol8;
import symbols.Symbol9;
import symbols.SymbolLowerCaseA;
import symbols.SymbolLowerCaseB;
import symbols.SymbolLowerCaseC;
import symbols.SymbolLowerCaseD;
import symbols.SymbolLowerCaseE;
import symbols.SymbolLowerCaseF;
import symbols.SymbolLowerCaseG;
import symbols.SymbolLowerCaseH;
import symbols.SymbolLowerCaseI;
import symbols.SymbolLowerCaseJ;
import symbols.SymbolLowerCaseK;
import symbols.SymbolLowerCaseL;
import symbols.SymbolLowerCaseM;
import symbols.SymbolLowerCaseN;
import symbols.SymbolLowerCaseO;
import symbols.SymbolLowerCaseP;
import symbols.SymbolLowerCaseQ;
import symbols.SymbolLowerCaseR;
import symbols.SymbolLowerCaseS;
import symbols.SymbolLowerCaseT;
import symbols.SymbolLowerCaseU;
import symbols.SymbolLowerCaseV;
import symbols.SymbolLowerCaseW;
import symbols.SymbolLowerCaseX;
import symbols.SymbolLowerCaseY;
import symbols.SymbolLowerCaseZ;
import symbols.SymbolRestColon;
import symbols.SymbolRestDash;
import symbols.SymbolRestAnd;
import symbols.SymbolRestSlash;
import symbols.SymbolRestSpace;
import symbols.SymbolUpperCaseA;
import symbols.SymbolUpperCaseB;
import symbols.SymbolUpperCaseC;
import symbols.SymbolUpperCaseD;
import symbols.SymbolUpperCaseE;
import symbols.SymbolUpperCaseF;
import symbols.SymbolUpperCaseG;
import symbols.SymbolUpperCaseH;
import symbols.SymbolUpperCaseI;
import symbols.SymbolUpperCaseJ;
import symbols.SymbolUpperCaseK;
import symbols.SymbolUpperCaseL;
import symbols.SymbolUpperCaseM;
import symbols.SymbolUpperCaseN;
import symbols.SymbolUpperCaseO;
import symbols.SymbolUpperCaseP;
import symbols.SymbolUpperCaseQ;
import symbols.SymbolUpperCaseR;
import symbols.SymbolUpperCaseS;
import symbols.SymbolUpperCaseT;
import symbols.SymbolUpperCaseU;
import symbols.SymbolUpperCaseV;
import symbols.SymbolUpperCaseW;
import symbols.SymbolUpperCaseX;
import symbols.SymbolUpperCaseY;
import symbols.SymbolUpperCaseZ;
import utils.Enums.RearrangeTypeEnum;
import utils.Enums.TextTypeEnum;

public enum TextManager {

	INSTANCE;

	private ArrayList<EText> eTextShowing = new ArrayList<>();
	private HashMap<String, Class<? extends Symbol>> hashMap = new HashMap<>();

	private TextManager() {
		createHashMap();
	}

	public void showText(EText eText, String text) {

		if (this.eTextShowing.contains(eText))
			ShutDown.INSTANCE.execute();

		this.eTextShowing.addLast(eText);

		ArrayList<Class<? extends Symbol>> listSymbol = getSymbolList(text);
		eText.getText().showText(listSymbol);

		relocateTexts();

	}

	public void concealTexts() {

		for (EText eText : this.eTextShowing)
			eText.getText().concealText();

		this.eTextShowing.clear();

	}

	public EText getTextEnumOptionPressed(int textOptionID) {

		int currentTextOptionID = 0;

		for (EText eText : this.eTextShowing) {

			if (!eText.getTextTypeEnum().equals(TextTypeEnum.OPTION))
				continue;

			if (textOptionID == currentTextOptionID)
				return eText;

			currentTextOptionID++;

		}

		return null;

	}

	private void relocateTexts() {

		double x = Credentials.INSTANCE.cTextPanel.x;
		double y = Credentials.INSTANCE.cTextPanel.y;

		if (Credentials.INSTANCE.rearrangeTypeEnumText.equals(RearrangeTypeEnum.PIVOT)) {

			double totalY = this.eTextShowing.size() * Credentials.INSTANCE.textHeight;
			y -= totalY / 2;

		}

		for (EText eText : this.eTextShowing) {

			eText.getText().relocateTopLeft(x, y);
			y += Credentials.INSTANCE.textHeight;

		}

	}

	private ArrayList<Class<? extends Symbol>> getSymbolList(String string) {

		ArrayList<Class<? extends Symbol>> list = new ArrayList<>();

		for (int counter = 0; counter < string.length(); counter++) {

			String s = string.substring(counter, counter + 1);
			Class<? extends Symbol> classSymbol = this.hashMap.getValue(s);
			list.addLast(classSymbol);

		}

		return list;

	}

	private void createHashMap() {

		// numbers

		this.hashMap.put("0", Symbol0.class);
		this.hashMap.put("1", Symbol1.class);
		this.hashMap.put("2", Symbol2.class);
		this.hashMap.put("3", Symbol3.class);
		this.hashMap.put("4", Symbol4.class);
		this.hashMap.put("5", Symbol5.class);
		this.hashMap.put("6", Symbol6.class);
		this.hashMap.put("7", Symbol7.class);
		this.hashMap.put("8", Symbol8.class);
		this.hashMap.put("9", Symbol9.class);

		// letters upper case

		this.hashMap.put("A", SymbolUpperCaseA.class);
		this.hashMap.put("B", SymbolUpperCaseB.class);
		this.hashMap.put("C", SymbolUpperCaseC.class);
		this.hashMap.put("D", SymbolUpperCaseD.class);
		this.hashMap.put("E", SymbolUpperCaseE.class);
		this.hashMap.put("F", SymbolUpperCaseF.class);
		this.hashMap.put("G", SymbolUpperCaseG.class);
		this.hashMap.put("H", SymbolUpperCaseH.class);
		this.hashMap.put("I", SymbolUpperCaseI.class);
		this.hashMap.put("J", SymbolUpperCaseJ.class);
		this.hashMap.put("K", SymbolUpperCaseK.class);
		this.hashMap.put("L", SymbolUpperCaseL.class);
		this.hashMap.put("M", SymbolUpperCaseM.class);
		this.hashMap.put("N", SymbolUpperCaseN.class);
		this.hashMap.put("O", SymbolUpperCaseO.class);
		this.hashMap.put("P", SymbolUpperCaseP.class);
		this.hashMap.put("Q", SymbolUpperCaseQ.class);
		this.hashMap.put("R", SymbolUpperCaseR.class);
		this.hashMap.put("S", SymbolUpperCaseS.class);
		this.hashMap.put("T", SymbolUpperCaseT.class);
		this.hashMap.put("U", SymbolUpperCaseU.class);
		this.hashMap.put("V", SymbolUpperCaseV.class);
		this.hashMap.put("W", SymbolUpperCaseW.class);
		this.hashMap.put("X", SymbolUpperCaseX.class);
		this.hashMap.put("Y", SymbolUpperCaseY.class);
		this.hashMap.put("Z", SymbolUpperCaseZ.class);

		// letters lower case

		this.hashMap.put("a", SymbolLowerCaseA.class);
		this.hashMap.put("b", SymbolLowerCaseB.class);
		this.hashMap.put("c", SymbolLowerCaseC.class);
		this.hashMap.put("d", SymbolLowerCaseD.class);
		this.hashMap.put("e", SymbolLowerCaseE.class);
		this.hashMap.put("f", SymbolLowerCaseF.class);
		this.hashMap.put("g", SymbolLowerCaseG.class);
		this.hashMap.put("h", SymbolLowerCaseH.class);
		this.hashMap.put("i", SymbolLowerCaseI.class);
		this.hashMap.put("j", SymbolLowerCaseJ.class);
		this.hashMap.put("k", SymbolLowerCaseK.class);
		this.hashMap.put("l", SymbolLowerCaseL.class);
		this.hashMap.put("m", SymbolLowerCaseM.class);
		this.hashMap.put("n", SymbolLowerCaseN.class);
		this.hashMap.put("o", SymbolLowerCaseO.class);
		this.hashMap.put("p", SymbolLowerCaseP.class);
		this.hashMap.put("q", SymbolLowerCaseQ.class);
		this.hashMap.put("r", SymbolLowerCaseR.class);
		this.hashMap.put("s", SymbolLowerCaseS.class);
		this.hashMap.put("t", SymbolLowerCaseT.class);
		this.hashMap.put("u", SymbolLowerCaseU.class);
		this.hashMap.put("v", SymbolLowerCaseV.class);
		this.hashMap.put("w", SymbolLowerCaseW.class);
		this.hashMap.put("x", SymbolLowerCaseX.class);
		this.hashMap.put("y", SymbolLowerCaseY.class);
		this.hashMap.put("z", SymbolLowerCaseZ.class);

		// rest

		this.hashMap.put("-", SymbolRestDash.class);
		this.hashMap.put("/", SymbolRestSlash.class);
		this.hashMap.put(":", SymbolRestColon.class);
		this.hashMap.put("&", SymbolRestAnd.class);
		this.hashMap.put(" ", SymbolRestSpace.class);

	}

}
