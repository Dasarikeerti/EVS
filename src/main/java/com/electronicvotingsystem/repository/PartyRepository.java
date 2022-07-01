package com.example.electronicvotingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.electronicvotingsystem.entity.Party;
@Repository
public interface PartyRepository extends JpaRepository<Party,Integer>
{

}
