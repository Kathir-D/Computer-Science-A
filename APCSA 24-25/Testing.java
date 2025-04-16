public class Testing {
  /*
public class Cello extends Instrument{
  private double size;

  public Cello (){
    super("Cello");
    this.size = 0;
  }

  public Cello (double size){
    super("Cello");
    this.size = size;
  }

  public Cello (String type){
    super(type);
    this.size = 0;
  }

  public Cello (String type, double size){
    super(type);
    this.size = size;
  }

  public String toString(){
    return super.toString() + this.size;
  }
}


 */

  /*
public werewolf(int age, double speed){
  this();
  this.age = age;
  this.speed = speed;
 */

  public static int fun4(int x){
    if (x < 1)
      return 1;
    else {
      return x + fun4(x - 1) + fun4(x - 2);
    }
  }

  public static void main(String[] args) {
    System.out.println(fun4(5));
  }

}
