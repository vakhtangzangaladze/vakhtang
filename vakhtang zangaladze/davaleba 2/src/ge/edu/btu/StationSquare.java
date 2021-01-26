package ge.edu.btu;

import java.util.ArrayList;
import java.util.List;


public class StationSquare {
    public static void main(String[] args) {
        Passenger gio = new Passenger("gio",true);
        Passenger nika = new Passenger("nika",false);
        Passenger ana=new Passenger("ana", true);

        Train train = new Train();

        train.addPassanger(gio);
        train.addPassanger(nika);
        train.addPassanger(ana);


        train.showList();
    }
}
