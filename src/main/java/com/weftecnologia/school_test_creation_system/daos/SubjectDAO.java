package com.weftecnologia.school_test_creation_system.daos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.weftecnologia.school_test_creation_system.entities.Subject;

public class SubjectDAO {

  private static final String BASE_FOLDER = "data/subjects/";

  private ObjectMapper objectMapper = new ObjectMapper();

  public void save(Subject subject) throws IOException {
    Path folderPath = Paths.get(BASE_FOLDER);
    Files.createDirectories(folderPath);
    String fileName = "subject_" + subject.getId() + ".json";
    Path filePath = folderPath.resolve(fileName);

    objectMapper.writeValue(filePath.toFile(), subject);
    System.out.println("subject saved successfully." + filePath);
  }
}
