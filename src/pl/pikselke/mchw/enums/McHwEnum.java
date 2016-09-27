package pl.pikselke.mchw.enums;

public enum McHwEnum {
	
	PRACE,
	OFFLINE,
	ONLINE,
	;
	
	public static McHwEnum tryb = McHwEnum.OFFLINE;
	
	public static void setMode(McHwEnum mode){
		tryb=mode;
	}
	
	public static McHwEnum getSerwerMode(){
		return tryb;
	}
}