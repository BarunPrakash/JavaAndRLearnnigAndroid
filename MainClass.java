
public class virtualDemo {

   public static void main(String [] args) {
      Salary s = new Salary("Barun", "patna, Bihar", 3, 367700.00);
      test e = new Salary("prkaash", "kk, rachi", 8, 240000.00);
      System.out.println("Call mailCheck using Salary reference --");   
      s.mailCheck();
      System.out.println("\n Call mailCheck using Employee reference--");
      e.mailCheck();
   }
}
