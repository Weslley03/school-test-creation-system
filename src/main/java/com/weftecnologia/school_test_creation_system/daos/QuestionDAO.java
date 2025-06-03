package com.weftecnologia.school_test_creation_system.daos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.weftecnologia.school_test_creation_system.entities.Question;

public class QuestionDAO {

  private static final String BASE_FOLDER = "data/questions/";
  
  private ObjectMapper objectMapper = new ObjectMapper();

  public void save(Question question) throws IOException {
    Path folderPath = Paths.get(BASE_FOLDER);
    Files.createDirectories(folderPath);
    String fileName = "question_" + question.getId() + ".json";
    Path filePath = folderPath.resolve(fileName);

    objectMapper.writeValue(filePath.toFile(), question);
    System.out.println("question saved successfully." + filePath);
  }

  public Question findById(long id)  throws IOException {
    String fileName = "question_" + id + ".json";
    File file = new File(BASE_FOLDER + fileName);

    if(!file.exists()) throw new RuntimeException("arquivo não encontrado: " + file.getPath());

    return objectMapper.readValue(file, Question.class);
  }
}
