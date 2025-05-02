package UnitAPTEST;

public class SignRunner {

  public static void main(String[] args) {
    Sign x = new Sign("ABC222DE", 3);
    System.out.println(x.numberOfLines());
    System.out.println(x.getLines());
    System.out.println(x.numberOfLines());
    System.out.println(x.getLines());

    x = new Sign("ABCD", 10);
    System.out.println(x.numberOfLines());
    System.out.println(x.getLines());

    x = new Sign("ABCDEF", 6);
    System.out.println(x.numberOfLines());
    System.out.println(x.getLines());

    x = new Sign("", 4);
    System.out.println(x.numberOfLines());
    System.out.println(x.getLines());

    x = new Sign("AB_CD_EF", 2);
    System.out.println(x.numberOfLines());
    System.out.println(x.getLines());

    x = new Sign("APLUSCOMPSCI.COMROCKS", 5);
    System.out.println(x.numberOfLines());
    System.out.println(x.getLines());
  }
}
/*


ABC222DE === 3
3
ABC;222;DE
3
ABC;222;DE
ABCD === 10
1
ABCD
ABCDEF === 6
1
ABCDEF
 === 4
0
null
AB_CD_EF === 2
4
AB;_C;D_;EF
APLUSCOMPSCI.COMROCKS === 5
5
APLUS;COMPS;CI.CO;MROCK;S


*/
