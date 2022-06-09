/**
In Java kann eine Klasse Methoden und Konstruktoren haben, die den gleichen Namen besitzen. Dies nennt man "Überladen".

Damit das Überladen möglich ist, muss wenigstens eine der folgenden Vorraussetzungen erfüllt sein:

- Der Datentyp mindestens eines Übergabeparameters ist anders als in den übrigen gleichnamen Methoden.
- Die Anzahl der Übergabeparameter ist unterschiedlich.

Das erlaubt den Compiler eindeutig zu bestimmen welche Methode denn schlussendlich aufgerufen werden soll. 
Der Rückgabewert muss bei allen überladenen Methoden immer gleich sein.
*/

public class Bottle {

    private double volume;
    private double currentLevel;

    /**
      Überladen wird oft bei Konstruktoren angewendet. 

      Man kann von einem Konstruktor auch einen anderen Konstruktor mit this() aufrufen. So erspart man sich oft doppelten Code (DRY Code!)
    **/
    public Bottle(double volume) {
        this(volume, 0);  
        System.out.println("Konstruktor mit einem double Parameter.");
    }

    public Bottle(int volume) {
        this(volume, 0);
        System.out.println("Konstruktor mit einem int Parameter.");
    }

    public Bottle(double volume, double currentLevel) {
        this.volume = volume;
        this.currentLevel = currentLevel;
        System.out.println("Konstruktor mit zwei double Parameter.");
    }

    public Bottle(){
        this(0,0);
        System.out.println("Konstruktor ohne Parameter.");
    }

  /**
    Auch Methoden kann man überladen.
    Damit können auch in Java "Default-Werte" für einzelne Parameter umgesetzt werden.
  **/
    public void reset() {
        System.out.println("resetBottle ohne Parameter.");
        reset(0,0); //setze Volumen und Level auf 0 (Default Werte in unserem Beispiel)
    }

    public void reset(double volume){
       System.out.println("resetBottle mit einem double Parameter.");
      //natürlich könnte man hier auch reset(volume,0) aufrufen!
      this.volume=volume;
      this.currentLevel = 0;
    }

    public void reset(double volume, double level) {
      System.out.println("resetBottle mit zwei double Parameter.");
      this.volume = volume;
      this.currentLevel = level;
    }


    /**
    weitere Methoden.....
     **/
    public void setVolume(double v){
        volume = v;
    }


    public double getVolume() {
        return volume;
    }

    public void setCurrentLevel(double level) {
        this.currentLevel = level;
    }

    public double getCurrentLevel(){
        return currentLevel;
    }

    public String toString() {
        return "Die Flasche ist mit "+currentLevel+" ml von "+volume+" ml gefüllt.";
    }

    public void fillBottle(double v) {
        currentLevel += v;

        if (currentLevel > volume) {
            currentLevel = volume;
        }
    }

    public void emptyBottle(double v) {
        currentLevel -= v;

        if (currentLevel < 0) {
            currentLevel = 0;
        }
    }


}

