package tn.esprit.tpfoyer.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReservationTest {

    private Reservation reservation;

    @BeforeEach
    public void setUp() {
        // Initialize the Reservation object before each test
        reservation = new Reservation();
    }

    @Test
    public void testGetterAndSetter() {
        // Set values using the setters
        reservation.setIdReservation(1L);
        reservation.setDateDebut("2024-12-01");
        reservation.setDateFin("2024-12-10");
        reservation.setNote("Nice stay");
        reservation.setNom("Doe");
        reservation.setPrenom("John");
        reservation.setEmail("john.doe@example.com");

        // Validate the values using the getters
        assertEquals(1L, reservation.getIdReservation());
        assertEquals("2024-12-01", reservation.getDateDebut());
        assertEquals("2024-12-10", reservation.getDateFin());
        assertEquals("Nice stay", reservation.getNote());
        assertEquals("Doe", reservation.getNom());
        assertEquals("John", reservation.getPrenom());
        assertEquals("john.doe@example.com", reservation.getEmail());
    }

    @Test
    public void testConstructorWithParams() {
        // Test constructor with parameters
        Reservation reservation = new Reservation(1L, "2024-12-01", "2024-12-10", "Great stay", "Doe", "John", "john.doe@example.com");

        assertEquals(1L, reservation.getIdReservation());
        assertEquals("2024-12-01", reservation.getDateDebut());
        assertEquals("2024-12-10", reservation.getDateFin());
        assertEquals("Great stay", reservation.getNote());
        assertEquals("Doe", reservation.getNom());
        assertEquals("John", reservation.getPrenom());
        assertEquals("john.doe@example.com", reservation.getEmail());
    }

    @Test
    public void testToStringMethod() {
        // Test the toString method
        Reservation reservation = new Reservation(1L, "2024-12-01", "2024-12-10", "Great stay", "Doe", "John", "john.doe@example.com");

        String expectedString = "Reservation(idReservation=1, dateDebut=2024-12-01, dateFin=2024-12-10, note=Great stay, nom=Doe, prenom=John, email=john.doe@example.com)";
        assertEquals(expectedString, reservation.toString());
    }
}
