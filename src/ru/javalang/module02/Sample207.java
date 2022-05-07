package ru.javalang.module02;

/**
 * Класс-оболочка Character
 */
public class Sample207 {
    public static void main(String[] args) {
        char ch = '9';
//        Character c1 = new Character(ch);
        /* начиная с Java9 Caracter.valueOf(ch) */
        Character c1 = Character.valueOf(ch);

        System.out.println("ch = " + ch);
        System.out.println("cl.charValue() = " + c1.charValue());
        System.out.println("number of 'A' = " + Character.digit('A', 16));
        System.out.println("digit for 12 = " + Character.forDigit(12, 16));
        System.out.println("cl = " + c1.toString() );
        System.out.println("ch isDefined? " + Character.isDefined(ch));
        System.out.println("ch isDigit? " + Character.isDigit(ch));
        System.out.println("ch isIdentifierIgnorable? " + 	Character.isIdentifierIgnorable(ch));
        System.out.println("ch isJavaIdentifierPart? " + 	Character.isJavaIdentifierPart(ch));
        System.out.println("ch isJavaIdentifierStart? " + 	Character.isJavaIdentifierStart(ch));
        System.out.println("ch isLetter? " + Character.isLetter(ch));
        System.out.println("ch isLetterOrDigit? " + Character.isLetterOrDigit(ch));
    }
}
