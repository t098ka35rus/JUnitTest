package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SpacePersonComparatorTest {

    SpacePersonComparator spacePersonComparator = new SpacePersonComparator();
    ;


    @DisplayName("compare test")
    @Test
    void compare() {
        //input
        Person person = new Person("Dazdraperma Sponzhova", 33, 15);
        Person person1 = new Person("Salavat Netologshvili", 23, 13);
        //expected
        int expected = -1;
        //actual
        int actual = spacePersonComparator.compare(person, person1);
        assertEquals(expected, actual);
    }

    @DisplayName("countSLetters test")
    @Test
    void countSLetters() {
        //input
        final String inputstring = "tim zab";
        //expected
        final int expected = 0;
        //actual
        final int actual = spacePersonComparator.countSletters(inputstring);
        assertEquals(expected, actual);
    }

    @DisplayName("getSumS test")
    @Test
    void getSumS() {
        //input
        String inputstring = null;
        //actual
        assertThrows(NullPointerException.class, () -> {
            spacePersonComparator.getSumS(null);
        });
    }


}