package com.eddytester.model;

public enum CandidateStatus {
    MINOR("Minor"), CANDIDATE("Candidate"), RETIRED("Retired");

    CandidateStatus(String statusValue){
        this.statusValue = statusValue;
    }

    public final String statusValue;
}
