package alisherDay12;


import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<Members> members = new ArrayList<>();

    public List<Members> getMembers() {
        return members;
    }

    public void setMembers(List<Members> members) {
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public static void transferMembers(MusicBand a, MusicBand b){
        for(Members members:a.getMembers()){
            b.getMembers().add(members);
        }
        a.getMembers().clear();
    }
    public void printMembers(){
        System.out.println(this.members);
    }

    public MusicBand(String name, int year, List<Members> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }


}
