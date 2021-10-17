public class TestScoreKeeper{
  public static void main(String[] args){
    ScoreKeeper sk = new ScoreKeeper();
    sk.scoreNormal();
    sk.scoreNormal();
    sk.scoreBonus();
    System.out.println("score: " + sk.getScore());
  }
}
