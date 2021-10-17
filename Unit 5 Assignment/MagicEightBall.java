public class MagicEightBall{
  public String ask(String n){
    int rand = (int)Math.floor(Math.random()*5+1);
    if(rand ==1){
      return a;
    }else if(rand ==2){
      return b;
    }else if(rand ==3){
      return c;
    }else if(rand ==4){
      return d;
    }else if(rand ==5){
      return e;
    }else if(rand ==6){
      return f;
    }
    return "wrong";
    }
    private final String a = "yes";
    private final String b = "no";
    private final String c = "possibly";
    private final String d = "it would seem so";
    private final String e = "google it";
    private final String f = "ask dr kessner";
}
