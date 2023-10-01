package com.swinpostnetworks.conferencedemo.repositories;

import com.swinpostnetworks.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
