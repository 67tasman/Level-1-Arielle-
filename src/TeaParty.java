
	public class TeaParty {
		String lastName;
		boolean isWoman;
		boolean isKnighted;
		String a;
		public String welcome(String lastName, boolean isWoman, boolean isKnighted){
			this.lastName = lastName;
			this.isWoman = isWoman;
			this.isKnighted=isKnighted;
		
			if(isWoman==true) {
				a = "Ms. ";
			}
			else if(isKnighted==true) {
				 a = "Sir ";
			}
			else {
				 a = "Mr. ";
			}
		    return("Hello "+ a + lastName);   
		    }
		
		
		}



