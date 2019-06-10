import java.util.*;

public class TestHello {
	// praca z branczhmi checkot - przelaczanie i wracanai zmian
	// przelaczania sie na galeze
	// po margowaniu
	// robimy na dwa razy  commit i pull
	// przypomnienie commitowania praca na branchach + scenariusze
	static String HELLO_MSG = "Hello\n";
	private Vector strVect;

	public static void main(String[] args){
		TestHello th = new TestHello();
		System.out.println(HELLO_MSG);
		ObjectVersusReference.main(new String[]{"test"});
		ObjectVersusReference.exampleCompareStraightType();

		PosiadaId iterator = new User();
		iterator.setId("100");
		ObjectVersusReference.testMap();
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

	private boolean getStatus(){
		return true;
	};
	private boolean getConflict(){
		// symulacja konfliktu po fast-forward merge
		return false;
	}
}

class ObjectVersusReference {
    public static void main(String[] args) {
        Object referenceToObjectX = new Object();
        Object anotherReferenceToObjectX = referenceToObjectX;
        Object refferenceToObjectY = new Object();

        System.out.println(referenceToObjectX.toString());
        System.out.println(anotherReferenceToObjectX.toString());
        System.out.println(refferenceToObjectY.toString());
    }
    public static void testCode_1(){
    	// zmienna typu interafce programowanie na intaracke
    	// samouczek programisty zastosowanie intarfajsow
    	// po co one
    	// java developoer na takie stanowisko chce
    	// tree
    	// is
    	/*
    api - interface programisty
static przypisanie do klasy

====
git powtorek

===
wrzuc kod do gita/ domyslny bezparametrowy
----
zaczac kodowac wodomu

ctr-space , control - shif space
czytani pliku hasmapowoani
git kluczowe pojecia
			gownaniy skrykptach eorr i i dziekuje
			domyslane enumy
    	*/
    }

    public static void exampleCompareStraightType(){
    	System.out.println("10 == 10: " + (10 == 10));
		System.out.println("10 != 10: " + (10 != 10));
		System.out.println("true == true: " + (true == true));
		System.out.println("true != true: " + (true != true));
		System.out.println("'a' == 'a': " + ('a' == 'a'));
		System.out.println("'a' != 'a': " + ('a' != 'a'));
		System.out.println("500L == 500L: " + (500L == 500L));
		System.out.println("500L != 500L: " + (500L != 500L));
    }

    public static void testMap(){
    	// nizgodne nie mozan rzutowac na typy generyczne
    	// nikezgodne kod jest kode koniec uczenia

    	//	OK poprawka tworzyc mozna 
  
    	List<String> lista = new ArrayList<String>();
    	lista.add("Grzesiek");
    	lista.add("Tomek");
    	lista.add("Janek");
    	lista.add(200);
    	for (int i = 0; i <= 100; i++){
    		lista.add("Item" + i);
    	}
    	for (String elem : lista)
    		System.out.println(elem);
    };
}

// public static final
// public static final (domyslne)
// framworki tworzone
// interejes tez dziedziczy do kompilatora
// intarajace znacznikowa

// 1. programowanie na interfejsach
// 2. generyki jako typy paramtryzowane ograniczenia
// 3. adnotacje i listy
// 4. przed argumentami metod, formatowanie komputera wziac na swieta 
// ----
// kollekcjo caly kod beack -endu przegladnoac api javy //
// spring boot -- baze 
// kolekcje

interface PosiadaId {
	public String getId();
	public void setId(String id);
}

class User implements PosiadaId {
	public void setId(String id){};
	public String getId(){ return "";};
}
