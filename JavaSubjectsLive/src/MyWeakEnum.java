
public enum MyWeakEnum {
	
	MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6),SUNDAY(7);
	final int i;
	
	MyWeakEnum(int i){
	this.i=i;	
		
	}
	
	public int getNum() {
		return this.i;
	}
	
}
