package com.eddytester.service;

import com.eddytester.model.Candidate;
import com.eddytester.model.CandidateDto;
import org.junit.jupiter.api.Test;

import java.time.Year;

import static org.junit.jupiter.api.Assertions.*;

class CandidateServiceTest {

    public CandidateService candidateService;

    @Test
    void validCandidateShouldBeSaved(){
        Candidate validCandidate = new Candidate("Jack", Year.of(1991));
        CandidateDto createdCandidate = candidateService.saveCandidate(validCandidate.getName(), validCandidate.getBirthYear());
        assertEquals(createdCandidate.getBirthYear(), validCandidate.getBirthYear());
        assertEquals(createdCandidate.getName(), validCandidate.getName());
        assertEquals(createdCandidate.getAge(), Year.now().getValue() - validCandidate.getBirthYear().getValue());
        assertNotNull(createdCandidate.getId());
    }
    //тесты начал писать но вижу что покрытие не увеличивается. не понятно

}