package com.weftecnologia.school_test_creation_system.services;

import java.io.IOException;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.weftecnologia.school_test_creation_system.daos.SubjectDAO;
import com.weftecnologia.school_test_creation_system.dtos.CreateSubjectDTO;
import com.weftecnologia.school_test_creation_system.entities.Subject;
import com.weftecnologia.school_test_creation_system.util.IdGeneratorUtil;

@Service
public class SubjectService {

  private final SubjectDAO subjectDAO = new SubjectDAO();

  public void saveSubject(CreateSubjectDTO dto) throws IOException {
    int id = IdGeneratorUtil.generateId();

    Subject subject = new Subject();
    subject.setId(id);
    subject.setTypeOfTeaching(dto.getTypeOfTeaching());
    subject.setCreatedByIdUser(dto.getCreatedByIdUser());

    Date now = new Date();
    subject.setCreatedAt(now);
    subject.setUpdatedAt(now);

    subjectDAO.save(subject);
  }
}
