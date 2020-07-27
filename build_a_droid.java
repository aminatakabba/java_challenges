public class Droid {
  int batteryLevel;
  String name;

  public String toString(){
    return "Hello, I’m the droid: " + name;
  }

  public void performTask(String task) {
    System.out.println(name + " is performing: " + task);
    batteryLevel = batteryLevel - 10;
  }

  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100; 
  }
  public static void main(String [] args) {
    Droid codey = new Droid("Codey");
    System.out.println(codey);
    Droid margot = new Droid("Margot");
    margot.performTask("levitating");
  }
}