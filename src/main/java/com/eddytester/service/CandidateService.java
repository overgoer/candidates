package com.eddytester.service;

import com.eddytester.model.Candidate;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class CandidateService {
    private final Map<Long, Candidate> storage = new ConcurrentHashMap<>();

    private long nextId = 1;

    public CandidateService() {
    }

    public void setStatus(Candidate candidate){
        if(candidate.getAge()<18) candidate.setStatus("minor");
        else if (candidate.getAge()<65) candidate.setStatus("candidate");
        else candidate.setStatus("retired");
    }

        public Candidate createCandidate(String name, Integer age){
            Candidate newCandidate = new Candidate();
            newCandidate.setName(name);
            newCandidate.setAge(age);
            newCandidate.setId(nextId);
            setStatus(newCandidate);
            storage.put(nextId,newCandidate);
            ++nextId;
            return newCandidate;
        }

        public Candidate getCandidateById(Long id){
        return storage.get(id);
        }
}
