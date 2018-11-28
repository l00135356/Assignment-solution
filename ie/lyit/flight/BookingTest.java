package ie.lyit.flight;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class BookingTest {
    private Booking b1;
    private Booking b2;

    @Before
    public void setUp() throws Exception {
        b1 = new Booking();
        b2 = new Booking();
    }


    @Test
    public void testBookingFlightFlightArrayListOfPassenger() {
        ArrayList < Passenger > passengers = new ArrayList < Passenger > ();
        Passenger a = new Passenger("Mrs", "Sofia", "Parker", 20, 2, 2019, 3, true);
        Passenger b = new Passenger("Mr", "Peter", "Jackman", 10, 12, 2000, 7, false);
        Passenger c = new Passenger("Mr", "Neil", "Hoff", 16, 5, 2005, 1, true);

        Flight outbound = new Flight("1", "Ireland", "AmsterDam", 18, 01, 2019, 06, 50, 59.99);
        Flight inbound = new Flight("1", "AmsterDam", "Ireland", 22, 01, 2019, 14, 50, 29.99);

        Booking b1 = new Booking(outbound, inbound, passengers);
        passengers.add(a);
        assertNotNull(inbound);
        assertNotNull(outbound);
        assertNotNull(passengers);
        assertNotNull(a);
        //		passengers.add(b);
        //		passengers.add(c);


        //		assertNotNull(b);
        //		assertNotNull(c);


    }

    @Test
    public void testToString() {
        ArrayList < Passenger > passengers = new ArrayList < Passenger > ();
        Passenger a = new Passenger("Mrs", "Sofia", "Parker", 20, 2, 2019, 3, true);
        Passenger b = new Passenger("Mr", "Peter", "Jackman", 10, 12, 2000, 7, false);
        Passenger c = new Passenger("Mr", "Neil", "Hoff", 16, 5, 2005, 1, true);

        Flight outbound = new Flight("1", "Ireland", "AmsterDam", 18, 01, 2019, 06, 50, 59.99);
        Flight inbound = new Flight("1", "AmsterDam", "Ireland", 22, 01, 2019, 14, 50, 29.99);

        Booking b1 = new Booking(outbound, inbound, passengers);
        passengers.add(a);
        assertNotNull(inbound);
        assertNotNull(outbound);
        assertNotNull(passengers);
        assertNotNull(a);

        b1.toString();
    }

    @Test
    public void testCalculatePrice() {
        ArrayList < Passenger > passengers = new ArrayList < Passenger > ();
        Passenger a = new Passenger("Mrs", "Sofia", "Parker", 20, 2, 2019, 3, true);
        Passenger b = new Passenger("Mr", "Peter", "Jackman", 10, 12, 2000, 7, false);
        Passenger c = new Passenger("Mr", "Neil", "Hoff", 16, 5, 2005, 1, true);

        Flight outbound = new Flight("1", "Ireland", "AmsterDam", 18, 01, 2019, 06, 50, 59.99);
        Flight inbound = new Flight("1", "AmsterDam", "Ireland", 22, 01, 2019, 14, 50, 29.99);

        Booking b1 = new Booking(outbound, inbound, passengers);
        passengers.add(a);
        assertNotNull(inbound);
        assertNotNull(outbound);
        assertNotNull(passengers);
        assertNotNull(a);

        b1.calculatePrice();

    }

    @Test
    public void testFindPassenger() {
        ArrayList < Passenger > passengers = new ArrayList < Passenger > ();
        Passenger a = new Passenger("Mrs", "Sofia", "Parker", 20, 2, 2019, 3, true);
        Passenger b = new Passenger("Mr", "Peter", "Jackman", 10, 12, 2000, 7, false);
        Passenger c = new Passenger("Mr", "Neil", "Hoff", 16, 5, 2005, 1, true);

        Flight outbound = new Flight("1", "Ireland", "AmsterDam", 18, 01, 2019, 06, 50, 59.99);
        Flight inbound = new Flight("1", "AmsterDam", "Ireland", 22, 01, 2019, 14, 50, 29.99);

        Booking b1 = new Booking(outbound, inbound, passengers);
        passengers.add(a);
        assertNotNull(inbound);
        assertNotNull(outbound);
        assertNotNull(passengers);
        assertNotNull(a);

        b1.findPassenger(a);


    }

    @Test
    public void testSetOutBound() {
        ArrayList < Passenger > passengers = new ArrayList < Passenger > ();
        Passenger a = new Passenger("Mrs", "Sofia", "Parker", 20, 2, 2019, 3, true);
        Passenger b = new Passenger("Mr", "Peter", "Jackman", 10, 12, 2000, 7, false);
        Passenger c = new Passenger("Mr", "Neil", "Hoff", 16, 5, 2005, 1, true);

        Flight outbound = new Flight("1", "Ireland", "AmsterDam", 18, 01, 2019, 06, 50, 59.99);
        Flight inbound = new Flight("1", "AmsterDam", "Ireland", 22, 01, 2019, 14, 50, 29.99);

        Booking b1 = new Booking(outbound, inbound, passengers);
        passengers.add(a);
        assertNotNull(inbound);
        assertNotNull(outbound);
        assertNotNull(passengers);
        assertNotNull(a);

        b1.setOutBound(outbound);


    }

    @Test
    public void testSetInBound() {
        ArrayList < Passenger > passengers = new ArrayList < Passenger > ();
        Passenger a = new Passenger("Mrs", "Sofia", "Parker", 20, 2, 2019, 3, true);
        Passenger b = new Passenger("Mr", "Peter", "Jackman", 10, 12, 2000, 7, false);
        Passenger c = new Passenger("Mr", "Neil", "Hoff", 16, 5, 2005, 1, true);

        Flight outbound = new Flight("1", "Ireland", "AmsterDam", 18, 01, 2019, 06, 50, 59.99);
        Flight inbound = new Flight("1", "AmsterDam", "Ireland", 22, 01, 2019, 14, 50, 29.99);

        Booking b1 = new Booking(outbound, inbound, passengers);
        passengers.add(a);
        assertNotNull(inbound);
        assertNotNull(outbound);
        assertNotNull(passengers);
        assertNotNull(a);

        b1.setInBound(inbound);
    }

    @Test
    public void testSetTotalPrice() {
        ArrayList < Passenger > passengers = new ArrayList < Passenger > ();
        Passenger a = new Passenger("Mrs", "Sofia", "Parker", 20, 2, 2019, 3, true);
        Passenger b = new Passenger("Mr", "Peter", "Jackman", 10, 12, 2000, 7, false);
        Passenger c = new Passenger("Mr", "Neil", "Hoff", 16, 5, 2005, 1, true);

        Flight outbound = new Flight("1", "Ireland", "AmsterDam", 18, 01, 2019, 06, 50, 59.99);
        Flight inbound = new Flight("1", "AmsterDam", "Ireland", 22, 01, 2019, 14, 50, 29.99);

        Booking b1 = new Booking(outbound, inbound, passengers);
        passengers.add(a);
        assertNotNull(inbound);
        assertNotNull(outbound);
        assertNotNull(passengers);
        assertNotNull(a);

        b1.setTotalPrice(89.98);
    }

}