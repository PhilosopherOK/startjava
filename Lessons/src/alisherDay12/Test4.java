package alisherDay12;

import java.util.ArrayList;
import java.util.List;


public class Test4 {
    public static void main(String[] args) {
        Members member1 = new Members("Ivori", 20);
        List<Members> members1 = new ArrayList<>();
        members1.add(member1);
        members1.add(new Members("Zak", 26));
        members1.add(new Members("Sheldon", 28));
        members1.add(new Members("Zemphira", 18));
        MusicBand band1 = new MusicBand("Empire", 1975, members1);


        Members member2 = new Members("Zorki", 18);
        List<Members> members2 = new ArrayList<>();
        members2.add(member2);
        members2.add(new Members("Zerich", 27));
        members2.add(new Members("Efiopii", 38));
        MusicBand band2 = new MusicBand("Parichka", 2007, members2);


        MusicBand.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();
    }
}
