package com.example.demo.service;

import com.example.demo.entities.Section;

import java.util.List;
import java.util.Map;

public interface SectionService {

    List<Section> getSectionsForCourse(long courseId);
    List<Section> updateSectionsOrder(List<Section> sections);
    Section addNewSection(Map<String, String> section);
    boolean removeSection(long sectionId);
    Section updateSection(Map<String, String> section, long sectionId);

}
