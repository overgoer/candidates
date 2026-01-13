package com.eddytester.controller;

import com.eddytester.model.Candidate;
import com.eddytester.service.CandidateService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class CandidateRestController{
    private final CandidateService candidateService;
    public CandidateRestController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @PostMapping("/candidate")

}
