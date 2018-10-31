import java.util.*;

public class TestHello {
	// praca z branczhmi checkot - przelaczanie i wracanai zmian
	// przelaczania sie na galeze
	// po margowaniu
	// robimy na dwa razy  commit i pull
	// przypomnienie commitowania praca na branchach + scenariusze
	static String HELLO_MSG = "Hello\n";
	private Vector strVect;

	public static void main(String args[]){
		TestHello th = new TestHello();
		System.out.println(HELLO_MSG);
	}

	public TestHello(){
		// Tak tez moza ale lepiej na
		// Na insterfejsach programowac
		strVect =  new Vector();
	}

	public String getName(){
		return HELLO_MSG;
	}

	public Vector getVector(){
		return strVect;
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
	private boolean getComflict(){
		// symulacja konfliktu po fast-forward merge
	}
}
