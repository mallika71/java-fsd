package synchronization;

public class sync {
	public static void main(String[] args) {
		
		Sender sender = new  Sender();
		
		User t1= new User("Harsha", "Hello Good morning....!", sender);
		User t2= new User("Buddy","Hii!! how  are you?",sender);
		
		t1.start();
		t2.start();
	}



}

	
		
		
