package com.electronicvotingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.electronicvotingsystem.entity.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {


}
