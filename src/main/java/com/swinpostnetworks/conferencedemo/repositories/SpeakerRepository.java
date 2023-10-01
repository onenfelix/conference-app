package com.swinpostnetworks.conferencedemo.repositories;

import com.swinpostnetworks.conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
