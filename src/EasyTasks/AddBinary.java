package EasyTasks;

import java.math.BigInteger;

public class AddBinary {
    public static void main(String[] args) {
        String binNum = "101000001001001101100100000101011110110110011011101111111111101000000101111001110001111100001101";
        String binNum1 = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        System.out.println(addBinary(binNum, binNum1));
    }

    public static String addBinary(String a, String b) {
        BigInteger bi = new BigInteger(a, 2);
        BigInteger result = bi.add(new BigInteger(b,2));
        return result.toString(2);
    }
}
