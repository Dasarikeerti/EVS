package com.electronicvotingsystem.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electronicvotingsystem.entity.Schedule;
import com.electronicvotingsystem.exception.CandidateNotFoundException;
import com.electronicvotingsystem.exception.ScheduleNotFoundException;
import com.electronicvotingsystem.model.ScheduleDTO;
import com.electronicvotingsystem.repository.ScheduleRepository;
import com.electronicvotingsystem.service.ScheduleService;
import com.electronicvotingsystem.utils.ConversionClass;
@Service
public class ScheduleServiceImpl implements ScheduleService {

	@Autowired
	private ScheduleRepository scheduleRepository;

	@Autowired
	private ConversionClass conversionClass;

	@Override
	public Schedule addSchedule(ScheduleDTO scheduleDTO) {
		return scheduleRepository.save(conversionClass.convertToScheduleEntity(scheduleDTO));
	}

	@Override
	public ScheduleDTO viewSchedule(int scheduleId)  throws CandidateNotFoundException{
		Optional<Schedule> schedule = scheduleRepository.findById(scheduleId);
		ScheduleDTO message = null;
		Schedule sched = null;
		if(schedule.isPresent()) {
			sched = schedule.get();
			message = conversionClass.convertToScheduleDTO(sched);
		}else {
			throw new CandidateNotFoundException("No such schedule");
		}
		return message;
	}

	@Override 
	public List<Schedule> viewAllSchedule()
	{ 
		return scheduleRepository.findAll(); 
	}

	@Override
	public Schedule updateSchedule(ScheduleDTO scheduleDTO) throws ScheduleNotFoundException {
		Optional<Schedule> schedule = scheduleRepository.findById(scheduleDTO.getScheduleId());
		Schedule scheduleRecord=null;
		if(schedule.isPresent()) {
			scheduleRecord= schedule.get();
			scheduleRepository.save(conversionClass.convertToScheduleEntity(scheduleDTO));

		}
		else {
			throw new ScheduleNotFoundException("Schedule Not Found");
		}

		return scheduleRecord;
	}

	@Override
	public String deleteSchedule(int scheduleId) throws ScheduleNotFoundException 
	{
		Optional<Schedule> schedule = scheduleRepository.findById(scheduleId);
		String message=null;
		if(schedule.isPresent()) {
			scheduleRepository.deleteById(scheduleId);
			message="Schedule Deleted Successfully";

		}else {
			message="No Schedule Found";
			throw new ScheduleNotFoundException(message);
		}
		return message;

	}

}
