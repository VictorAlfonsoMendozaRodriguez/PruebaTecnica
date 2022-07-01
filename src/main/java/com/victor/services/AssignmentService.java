package com.victor.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victor.dto.AssignmentDTO;
import com.victor.model.Assignment;
import com.victor.repository.IStudentExamRepository;

@Service
public class AssignmentService implements IAssignmentService {
	
	@Autowired
	IStudentExamRepository studentExamRepo;

	@Override
	public AssignmentDTO create(AssignmentDTO assignment) {
		ModelMapper modelMapper = new ModelMapper();
		Assignment exam = modelMapper.map(assignment, Assignment.class);
		return modelMapper.map(studentExamRepo.save(exam), AssignmentDTO.class);
	}
    
}