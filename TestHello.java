import java.util.*;

public class TestHello {
	static String HELLO_MSG = "Hello\n";
	private Vector<String> stringVector;

	public static void main(String args[]){
		System.out.println(HELLO_MSG);
	}
	
	public TestHello(){
		// Tak tez moza ale lepiej na
		// Na insterfejsach programowac
		stringVector =  new Vector();
	}

	public String getName(){
		return HELLO_MSG;
	}

	public Vector getVector(){
		return stringVector;
	};

	public int getEage(){
		return 1;
	};
	public String getRevision(){
		return "v1.0";
	};

	private boolean getStatu(){
		return true;
	};
}
