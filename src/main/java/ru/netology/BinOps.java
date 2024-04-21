package ru.netology;

public class BinOps {
    public String sum(String a, String b) {
        if(a.isEmpty())
            a = "0";
        if(b.isEmpty())
            b = "0";
        if (!isValidBinaryString(a) || !isValidBinaryString(b)) {
            throw new NumberFormatException("В параметры метода должны передаваться комбинация из '0' и '1' ");
        }
        int ia = Integer.parseInt(a, 2);
        int ib = Integer.parseInt(b, 2);
        int result = ia + ib;
        return Integer.toBinaryString(result);
    }

    public String mult(String a, String b) {
        if(a.isEmpty())
            a = "1";
        else if (b.isEmpty()) {
            b = "1";
        }
        if (!isValidBinaryString(a) || !isValidBinaryString(b)) {
            throw new NumberFormatException("В параметры метода должны передаваться комбинация из '0' и '1' ");
        }
        int ia = Integer.parseInt(a, 2);
        int ib = Integer.parseInt(b, 2);
        int result = ia * ib;
        return Integer.toBinaryString(result);
    }

    private boolean isValidBinaryString(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != '0' && c != '1' ) {
                return false;
            }
        }
        return true;
    }
}
