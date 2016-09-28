package pl.pikselke.mchw.enums;

public enum McHwEnum {
	
	OFFLINE,
	ONLINE,
	;
	
	public static McHwEnum tryb = McHwEnum.OFFLINE;
	
	public static void setMode(McHwEnum mode){
		tryb=mode;
	}
	
	public static McHwEnum getServerMode(){
		return tryb;
	}
}