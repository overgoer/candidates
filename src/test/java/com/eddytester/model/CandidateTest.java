    package com.eddytester.model;

    import org.junit.jupiter.api.Test;

    import java.time.Year;

    import static org.junit.jupiter.api.Assertions.*;

    class CandidateTest {

        Candidate candidateAdult = new Candidate("candidateName", Year.of(1991));

        Candidate candidateMinor = new Candidate("candidateName", Year.of(2025));

        Candidate candidateRetired = new Candidate("candidateName", Year.of(1900));

        @Test
        void birthYearShouldReturnUnchanged() {
            assertEquals(1991, candidateAdult.getBirthYear().getValue());
        }

        @Test
        void nameShouldReturnUnchanged() {
            assertEquals("candidateName", candidateAdult.getName());
        }

        @Test
        void statusCandidateShouldReturnUnchanged() {
            assertEquals("candidate", candidateAdult.getStatus());
        }

        @Test
        void getAge() {
            assertEquals(Year.now().getValue() - candidateAdult.getBirthYear().getValue() , candidateAdult.getAge());
        }

        @Test
        void getSstatusMinorShouldReturnUnchangedtatus() {
            assertEquals("minor", candidateMinor.getStatus());
        }

        @Test
        void getSstatusRetiredShouldReturnUnchangedtatus() {
            assertEquals("retired", candidateRetired.getStatus());
        }
    }