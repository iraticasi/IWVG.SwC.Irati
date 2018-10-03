package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class UserTest {

    private User user;

    @BeforeEach
    void before() {
        user = new User(1, "Irati", "Casi");
    }

    @Test
    void testFullName() {
        assertEquals("Irati Casi", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("I.", user.initials());
    }

    @Test
    void testuppercaseName() {
        assertEquals("IRATI", user.uppercaseName());
    }

}