package com.digitalinnovation.crud.saladereuniao.saladereuniao.repository;


import com.digitalinnovation.crud.saladereuniao.saladereuniao.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {

}