package com.eddytester.service;

import com.eddytester.model.Candidate;
import com.eddytester.model.CandidateDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

import static org.junit.jupiter.api.Assertions.*;

class CandidateServiceTest {

    public CandidateService candidateService;

    @BeforeEach
    void setUp() {
        // Инициализация сервиса перед каждым тестом
        candidateService = new CandidateService();
    }

    @Test
    void validCandidateShouldBeSaved(){
        Candidate validCandidate = new Candidate("Jack", "1991-01-01");

        CandidateDto createdCandidate = candidateService.saveCandidate(
                validCandidate.getName(),
                validCandidate.getBirthDate()
        );

        assertEquals(createdCandidate.getBirthDate(), validCandidate.getBirthDate());
        assertEquals(createdCandidate.getName(), validCandidate.getName());
        assertEquals(
                createdCandidate.getAge(),
                Period.between(
                        LocalDate.now(), LocalDate.parse(createdCandidate.getBirthDate()))
                        .getYears()
        );
        assertNotNull(createdCandidate.getId());
    }
    //тесты начал писать но вижу что покрытие не увеличивается. не понятно

}