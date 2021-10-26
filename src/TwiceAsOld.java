import java.sql.SQLOutput;

public class TwiceAsOld {

    public static void main(String[] args) {
        TwiceAsOld(40, 10);
        TwiceAsOld(40, 20);
        TwiceAsOld(40, 22);

    }
/*    Your function takes two arguments:
    current father's age (years)
    current age of his son (years)
    Сalculate how many years ago the father was twice as
    old as his son (or in how many years he will be twice as old).*/

    public static int TwiceAsOld(int dadYears, int sonYears) {
        //TODO: Add code here

        System.out.println("Father is " + dadYears + " years old. The son is "
                + sonYears + " old.");
        int iFather = dadYears;
        int iSon = sonYears;
        int i = 0;
        if ((dadYears / 2) == sonYears) {
            System.out.println("The Father is currently twice as old as his son");
        } else {
            if ((dadYears / 2) > sonYears) {
                while (iFather != (2 * iSon)) {
                    iFather++;
                    iSon++;
                    i++;
                }
                System.out.println("The Father will be twice as old as his son in "
                        + i + " years time. The Father will be " + (dadYears + i) +
                        " years old while his son will be " + (sonYears + i) + " years old.");
            } else {
                {
                    while (iFather != (2 * iSon)) {
                        iFather--;
                        iSon--;
                        i--;
                    }
                    System.out.println("The Father was twice as old as his son "
                            + i + " years ago The Father was " + (dadYears + i) +
                            " then, while his son was " + (sonYears + i) + " years old");
                }
            }
        }
        return i;
    }
}
