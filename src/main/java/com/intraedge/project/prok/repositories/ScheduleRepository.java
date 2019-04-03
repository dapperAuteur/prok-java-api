package com.intraedge.project.prok.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.intraedge.project.prok.domain.Schedule;

public interface ScheduleRepository  extends MongoRepository<Schedule, String> {
	Schedule findBy_id(String _id);
}
