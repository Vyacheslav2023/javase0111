package ru.javalang.module02;

/**
 * Двоичные, восьмеричные и шестьнадцатеричные литералы
 * и поразрядные операции
 *
 */
public class Sample217 {
    public static void main(String[] args) {

        // Двоичные числа
        int a = 0b0010; System.out.println("a = " + a + " = 0b" + Integer.toBinaryString(a));
        int b = 0b0101; System.out.println("b = " + b + " = 0b" + Integer.toBinaryString(b));

        // Битовые операции AND, OR, XOR
        int aANDb = a & b; System.out.println("a & b = " + aANDb);
        int aORb = a | b; System.out.println("a | b = " + aORb);
        int aNotORb = a ^ b; System.out.println("a ^ b = " + aNotORb);

        // Унарная операция NOT
        int aNot = ~a; System.out.println("~a = " + aNot + " = 0b" + Integer.toBinaryString(aNot));
        int aNot1 = 0b11111111111111111111111111111101; System.out.println("aNot=" + aNot1 );
        a = ~aNot; System.out.println("a = ~aNot = " + a + ", = 0b" + Integer.toBinaryString(a));

        int NOTaANDb = ~a & b; System.out.println("~a | b = " + NOTaANDb + " = 0b" + Integer.toBinaryString(NOTaANDb));
        int bANDNOTa = b & ~a; System.out.println("b | ~a = " + bANDNOTa + " = 0b" + Integer.toBinaryString(bANDNOTa));
        int NOTaANDbORbANDNOTa = (~a & b) | (a & ~b); System.out.println("(~a & b) | (a & ~b) =" + NOTaANDbORbANDNOTa);

        // Поразрядные битовые сдвиги
        int aSHIFTLEFT = a << 1; System.out.println("a << 1 = " + aSHIFTLEFT);
        int aSHIFTRIGHT = a >> 1; System.out.println("a >> 1 = " + aSHIFTRIGHT);
        int bSHIFTRIGHTN = b >>> 1; System.out.println("b >>> 1 = " + bSHIFTRIGHTN + " = 0b" + Integer.toBinaryString(bSHIFTRIGHTN));

        // Восьмеричные числа
        int octaA = 010;
        System.out.println("Восьмеричное число 056 в десятичной форме: " + octaA);

        // Шестьнадцатеричные значения
        int HEXa = 0x0a, HEXb = 0x0b, HEXc=0x0c, HEXd=0x0d, HEXe = 0x0e, HEXf=0x0f;
        System.out.println("Шестьнадцатеричное число 0x0f в десятичной форме: " + HEXf);
    }
}
