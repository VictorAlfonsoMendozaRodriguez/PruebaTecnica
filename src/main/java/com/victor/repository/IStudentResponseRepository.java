package com.victor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victor.model.StudentResponse;

public interface IStudentResponseRepository extends JpaRepository<StudentResponse,Integer>   {

}
