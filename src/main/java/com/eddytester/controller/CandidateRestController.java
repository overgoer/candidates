package com.eddytester.controller;

import com.eddytester.model.Candidate;
import com.eddytester.service.CandidateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class CandidateRestController{
    private final CandidateService candidateService;
    public CandidateRestController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @PostMapping("/candidate")
    public Candidate createCandidate(
            @RequestBody Candidate candidateRequest){
                return candidateService.createCandidate(
                    candidateRequest.getName(),
                    candidateRequest.getAge()
                );
    }

    @GetMapping("/candidate/{id}")
    Candidate one(@PathVariable Long id){
        return candidateService.getCandidateById(id);
    }
}
