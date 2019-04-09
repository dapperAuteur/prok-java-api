package com.intraedge.project.prok.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intraedge.project.prok.domains.Schedule;
import com.intraedge.project.prok.repositories.ScheduleRepository;

/**
 * ScheduleService
 */
@Service
public class ScheduleService {

  @Autowired
  private ScheduleRepository scheduleRepository;

  public List<Schedule> getSchedules() {
    List<Schedule> foundSchedules = scheduleRepository.findAll();
    return foundSchedules;
  }

  public Schedule findScheduleBy_id(String _id) {
    Schedule foundSchedule = scheduleRepository.findBy_id(_id);
    return foundSchedule;
  }

  public Schedule createSchedule(Schedule newSchedule) {
    Schedule createdSchedule = scheduleRepository.save(newSchedule);
    return createdSchedule;
  }

  public Schedule updateScheduleBy_id(Schedule schedule) {
    Schedule updatedSchedule = scheduleRepository.save(schedule);
    return updatedSchedule;
  }

  public void deleteScheduleBy_id(String _id) {
    Schedule foundSchedule = scheduleRepository.findBy_id(_id);
    scheduleRepository.delete(foundSchedule);
  }

}