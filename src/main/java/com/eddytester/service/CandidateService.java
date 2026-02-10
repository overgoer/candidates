package com.eddytester.service;

import com.eddytester.model.Candidate;
import com.eddytester.model.CandidateDto;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Year;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class CandidateService {
    private final Map<Long, Candidate> storage = new ConcurrentHashMap<>();

    private long nextId = 1;

    public CandidateService() {
    }

        public CandidateDto saveCandidate(String name, String birthDate){
            Candidate newCandidate = new Candidate(name, birthDate);
            storage.put(nextId,newCandidate);
            Long id = nextId;
            ++nextId;
            return new CandidateDto(id, newCandidate);
        }

        public CandidateDto getCandidateById(Long id){
            Candidate candidate = storage.get(id);
        return new CandidateDto(id, candidate);
        }
}
