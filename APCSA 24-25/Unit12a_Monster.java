class Unit12a_Monster {

  private String name;
  private int size;

  public Unit12a_Monster() {
    this.name = "";
    this.size = 0;
  }

  public Unit12a_Monster(String name, int size) {
    this.name = name;
    this.size = size;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public boolean isBigger(Object obj) {
    Unit12a_Monster other = (Unit12a_Monster) obj;
    return this.size > other.getSize();
  }

  public boolean isSmaller(Object obj) {
    Unit12a_Monster other = (Unit12a_Monster) obj;
    return this.size < other.getSize();
  }

  public boolean namesTheSame(Object obj) {
    Unit12a_Monster other = (Unit12a_Monster) obj;
    return this.name.equals(other.getName());
  }

  public boolean isSameSize(Object obj) {
    Unit12a_Monster other = (Unit12a_Monster) obj;
    return this.size == other.getSize();
  }
}
