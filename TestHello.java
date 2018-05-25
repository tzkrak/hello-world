import java.util.*;

public class TestHello {
	static String HELLO_MSG = "Hello\n";
	private Vector stringVector;

	public static void main(String args[]){
		System.out.println(HELLO_MSG);
	}
	
	public TestHello(){
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
