package ru.javalang.module10;

public class Sample1004NPE {
    public static void main(String[] args) {
//        int[] ints = findWord("буря скоро грянет буря", "буря");
//        int[] ints = findWord(null, "буря");

        int[] ints;

        try {
            ints = findWord("буря скоро грянет буря", null);
            System.out.println(ints.length);
        } catch (NullPointerException e){
            System.out.println("ОШИБКА!");
        }
        System.out.println("Продолжаем программу ...");
    }

    /**
     * Method findWord:
     * @param text
     * @param word
     * @return
     * @throws NullPointerException
     */
    public static int[] findWord(String text, String word) throws NullPointerException {
        if (text == null || word == null) {
            throw new NullPointerException("text == null || word == null");
        }
        int[] massivRez = new int[text.length()];
        int indexOf = 0;
        int i = 0;
        int fromIndex = 0;
        while (indexOf < text.length() && indexOf != -1) {
            indexOf = text.indexOf(word, fromIndex);
            if (indexOf >= 0) {
                massivRez[i++] = indexOf;
                fromIndex = indexOf += word.length();
            }
        }

        int[] massivRez2 = new int[i];
        for (int j = 0; j < i; j++) {
            massivRez2[j] = massivRez[j];
        }
        return massivRez2;
    }
}
