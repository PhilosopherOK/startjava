package alisherDay8;

public class Test1 {
    public static void main(String[] args) {
        String str0 = "0 ";
        String str1 = "1 ";
        String str2 = "2 ";
        String str3 = "3 ";
        String str4 = "4 ";
        String str5 = "5 ";
        String str6 = "6 ";
        String str7 = "7 ";
        String str8 = "8 ";
        String str9 = "9 ";
        String str10 = "10 ";
        String str11 = "11 ";
        String str12 = "12 ";
        String str13 = "13 ";
        String str14 = "14 ";
        String str15 = "15 ";
        String str16 = "16 ";
        String str17 = "17 ";
        String str18 = "18 ";
        String str19 = "19 ";
        String str20 = "20 ";
        String stringAll = str0+str1+str2+str3+str4+str5+str6+str7+str8+str9+str10+str11+str12+str13+str14+str15+str16+str17+str18+str19+str20;
        System.out.println(stringAll);

    StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20001; i++) {
        sb.append(i+" ");
        }
        System.out.println(sb.toString());
    }
}