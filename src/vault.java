
public class vault {
	int myCode;
	public vault(int sCode) {
	this.myCode =sCode;		
	}

	public boolean tryCode(int code){
		if( myCode==code){
			return true;
		}
		else
			return false;
	}
	
}
