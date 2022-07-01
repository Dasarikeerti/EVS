package com.eletronicvotingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eletronicvotingsystem.entity.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Integer> {

}
