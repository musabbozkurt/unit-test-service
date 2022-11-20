package com.mb.testservice.service;

import com.mb.testservice.data.model.Tutorial;

import java.util.List;

public interface TutorialService {
    List<Tutorial> findByTitleContaining(String title);

    Tutorial findById(long id);

    Tutorial save(Tutorial tutorial);

    Tutorial update(long id, Tutorial tutorial);

    void deleteById(long id);

    void deleteAll();

    List<Tutorial> findByPublished(boolean b);
}
