public class Bitwise {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int andRes = a & b;
        int orRes = a | b;
        int xorRes = a ^ b;
        int notRes = ~a;
        int leftShiftRes = a << 1;
        int rightShiftRes = a >> 1;
        System.out.println("Bitwise AND: " + andRes);
        System.out.println("Bitwise OR: " + orRes);
        System.out.println("Bitwise XOR: " + xorRes);
        System.out.println("Bitwise NOT: " + notRes);
        System.out.println("Left Shift: " + leftShiftRes);
        System.out.println("Right Shift: " + rightShiftRes);
}
}
