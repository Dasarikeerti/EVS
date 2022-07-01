package com.electronicvotingsystem.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.electronicvotingsystem.entity.Schedule;
import com.electronicvotingsystem.model.ScheduleDTO;
import com.electronicvotingsystem.service.ScheduleService;

@RestController
public class ScheduleController {
	
	@Autowired
	private ScheduleService scheduleService;

	@PostMapping(value = "/addschedule")
	public Schedule addElection(@RequestBody @Valid ScheduleDTO scheduleDto) {
		return scheduleService.addSchedule(scheduleDto);
	}
	@GetMapping(value="/viewallschedule")
	public List<Schedule> viewAllSchedules(){
		return scheduleService.viewAllSchedule();
	}

}
