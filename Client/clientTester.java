<<<<<<< HEAD

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class clientTester {
	public static void main(String[] args) {
		try {
//			Socket s = new Socket(args[0], Integer.parseInt(args[1]));
//		
//			MainActivityGUI window = new MainActivityGUI();
			Communication c = new Communication();
			LoginGUI window = new LoginGUI();
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		catch (UnknownHostException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
	}
=======

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class clientTester {
	public static void main(String[] args) {
		try {
//			Socket s = new Socket(args[0], Integer.parseInt(args[1]));
//		
//			MainActivityGUI window = new MainActivityGUI();
			Communication c = new Communication();
			LoginGUI window = new LoginGUI();
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		catch (UnknownHostException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
	}
>>>>>>> a0fa085f58d915215188a0bb98f0e2bb8742b9f0
}