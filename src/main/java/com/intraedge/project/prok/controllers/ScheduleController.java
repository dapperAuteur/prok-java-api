package com.intraedge.project.prok.controllers;

import java.util.List;

import javax.validation.Valid;

import com.intraedge.project.prok.domain.Schedule;
import com.intraedge.project.prok.services.ScheduleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ScheduleController
 */
@RestController
@RequestMapping("/schedules")
public class ScheduleController {

  @Autowired
  private ScheduleService scheduleService;

  @RequestMapping(value = "", method = RequestMethod.GET)
  public List<Schedule> getSchedules() {
    List<Schedule> schedules = scheduleService.getSchedules();
    return schedules;
  }

  @RequestMapping(value = "/{_id}", method = RequestMethod.GET)
  public Schedule getScheduleBy_id(@PathVariable("_id") String _id) {
    return scheduleService.findScheduleBy_id(_id);
  }

  @RequestMapping(value = "/{_id}", method = RequestMethod.PATCH)
  public Schedule modifyScheduleBy_id(@PathVariable("_id") String _id, @Valid @RequestBody Schedule schedule) {
    schedule.set_id(_id);
    scheduleService.updateScheduleBy_id(schedule);
    return schedule;
  }

  @RequestMapping(value = "", method = RequestMethod.POST)
  public Schedule createSchedule(@Valid @RequestBody Schedule newSchedule) {
    Schedule createdSchedule = scheduleService.createSchedule(newSchedule);
    return createdSchedule;
  }

  @RequestMapping(value = "/{_id}", method = RequestMethod.DELETE)
  public ResponseEntity<?> deleteSchedule(@PathVariable String _id) {
    scheduleService.deleteScheduleBy_id(_id);
    return new ResponseEntity<String>("Schedule with ID: '" + _id + "' was deleted", HttpStatus.OK);
  }

}