    package com.eddytester.model;

    import org.junit.jupiter.api.Test;

    import java.time.LocalDate;
    import java.time.Period;
    import java.time.Year;
    import java.time.format.DateTimeFormatter;

    import static org.junit.jupiter.api.Assertions.*;

    class CandidateTest {

        String TWENTY_FIVE_YEARS_AGO =
                LocalDate.now().minusYears(25).toString();

        String ONE_YEAR_AGO =
                LocalDate.now().minusYears(1).toString();

        String NINETY_YEARS_AGO =
                LocalDate.now().minusYears(90).toString();

        Candidate candidateAdult = new Candidate("candidateName", TWENTY_FIVE_YEARS_AGO);

        Candidate candidateMinor = new Candidate("candidateName", ONE_YEAR_AGO);

        Candidate candidateRetired = new Candidate("candidateName", NINETY_YEARS_AGO);

        @Test
        void birthDateShouldReturnUnchanged() {
            assertEquals(TWENTY_FIVE_YEARS_AGO, candidateAdult.getBirthDate());
        }

        @Test
        void nameShouldReturnUnchanged() {
            assertEquals("candidateName", candidateAdult.getName());
        }

        @Test
        void statusShouldReturnUnchanged() {
            assertEquals("Candidate", candidateAdult.getStatus());
        }

        @Test
        void ageShouldReturnUnchanged() {
            assertEquals(
                    Period.between(
                            LocalDate.parse(candidateAdult.getBirthDate()),
                            LocalDate.now())
                            .getYears(), candidateAdult.getAge()
            );
        }

        @Test
        void getStatusMinorShouldReturnUnchangedtatus() {
            assertEquals("Minor", candidateMinor.getStatus());
        }

        @Test
        void getStatusRetiredShouldReturnUnchangedtatus() {
            assertEquals("Retired", candidateRetired.getStatus());
        }

        @Test
        void getStatusAdultShouldReturnUnchangedtatus() {
            assertEquals("Minor", candidateMinor.getStatus());
        }

    }