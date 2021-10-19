package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@Tag("model")
class PersonTest {

    @Test
    void groupedAssertions() {
        //given
        Person person = new Person(1L, "Joe", "Buck");
        //then
        assertAll("Test Props Set",
                () -> assertEquals("Joe", person.getFirstName()),
                () -> assertEquals("Buck", person.getLastName())
        );
    }

    @Test
    void groupedAssertionsMsgs() {
        //given
        Person person = new Person(1L, "Joe", "Buck");
        //then
        assertAll("Test Props Set",
                () -> assertEquals("Joe", person.getFirstName(), "First Name Failed"),
                () -> assertEquals("Buck", person.getLastName(), "Last Name Failed")
        );
    }

    @RepeatedTest(5)
    void myRepeatedTestWithDI(TestInfo testInfo, RepetitionInfo repetitionInfo){
        System.out.println(testInfo.getDisplayName() + ": " + repetitionInfo.getCurrentRepetition());
    }
}