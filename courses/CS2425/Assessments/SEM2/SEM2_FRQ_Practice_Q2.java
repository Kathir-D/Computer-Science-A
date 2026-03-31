package CSA2425;

public class SEM2_FRQ_Practice_Q2 {

  private String name1;
  private String name2;
  private String activeTeam;
  private int score1;
  private int score2;

  public SEM2_FRQ_Practice_Q2(String name1, String name2) {
    this.name1 = name1;
    this.name2 = name2;
    activeTeam = this.name1;
    score1 = 0;
    score2 = 0;
  }

  public void recordPlay(int score) {
    if (score == 0) {
      if (activeTeam.equals(name1)) {
        activeTeam = name2;
      } else {
        activeTeam = name1;
      }
    } else {
      if (activeTeam.equals(name1)) {
        score1 += score;
      } else {
        score2 += score;
      }
    }
  }

  public String getScore() {
    return score1 + "-" + score2 + "-" + activeTeam;
  }
}
