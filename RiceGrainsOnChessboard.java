import static java.math.BigInteger.ONE;
import static java.math.BigInteger.ZERO;

import java.math.BigInteger;

public class RiceGrainsOnChessboard {


    public static void main(String[] args) {
        System.out.println(countRecursively(64));
        System.out.println(countFormula(64));
    }
    
    static BigInteger countRecursively(int field) {

        if (field < 1) {
            return ZERO;
        }
        if (field == 1) {
            return ONE;
        }
        return countRecursively(field - 1).multiply(new BigInteger("2"));
    }

    static BigInteger countFormula(int field) {
        return BigInteger.valueOf(2).pow(field - 1);
    }

}