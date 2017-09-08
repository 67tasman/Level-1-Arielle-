
public class vaultRunner {

	public static void main(String[] args) {
		vault vault1 = new vault(999999999);
		JamesBond jb = new JamesBond(vault1);
		System.out.println(jb.findCode());
//System.out.println(vault1.tryCode(12345));
//System.out.println(vault1.tryCode(1235));
	}

}
