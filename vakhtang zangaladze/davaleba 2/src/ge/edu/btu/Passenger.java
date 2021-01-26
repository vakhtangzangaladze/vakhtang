package ge.edu.btu;
import java.util.ArrayList;
import java.util.List;


public class Passenger {
    private String o;
    private boolean l;

    public Passenger(String s, boolean x) {
        this.o = s;
        this.l = x;
    }

    public String getS() {
        return o;
    }

    public boolean isX() {
        return l;
    }

    public void setS(String s) {
        this.o = o;
    }

    public void setX(boolean x) {
        this.l = l;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "Name = " + o + '\'' +
                ", Ticket = " + l +
                '}';
    }
}
