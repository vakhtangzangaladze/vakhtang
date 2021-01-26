import ge.edu.btu.Passenger;
import ge.edu.btu.Train;
import org.junit.Assert;
import org.junit.Test;

public class StationSquareTest {
    @Test
    public void test() {
        Train train = new Train();
        Passenger passenger = new Passenger("ana", true);
        train.Passenger(passenger);
        Assert.assertEquals(true, train.getPassengerList().get(0).haveTicket());
    }

}

