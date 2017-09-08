
public class JamesBond {
	vault myVault;
	public  JamesBond(vault v) {
		this.myVault=v;
	}
public int findCode() {
for(int i=0;i<=999999999; i++) {
	if(myVault.tryCode(i) == true) {
		return i; }
	
		}
return -1;
}

}

