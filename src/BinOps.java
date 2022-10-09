public class BinOps {
    public String sum(String a, String b) {
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        return Integer.toBinaryString(a1 + b1);
    }

    public String mult(String a, String b) {
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        return Integer.toBinaryString(a1 * b1);

    }
}
