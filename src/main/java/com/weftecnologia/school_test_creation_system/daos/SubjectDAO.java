package com.weftecnologia.school_test_creation_system.daos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.weftecnologia.school_test_creation_system.entities.Subject;
import com.weftecnologia.school_test_creation_system.exceptions.FileNotFoundException;

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

  public Subject findById(long id) throws IOException {
    String fileName = "subject_" + id + ".json";
    File file = new File(BASE_FOLDER + fileName);

    if (!file.exists())
      throw new FileNotFoundException("arquivo não encontrado: " + file.getPath());

    return objectMapper.readValue(file, Subject.class);
  }
}
