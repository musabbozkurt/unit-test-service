package com.mb.testservice.mapper;

import com.mb.testservice.api.request.ApiTutorialRequest;
import com.mb.testservice.api.request.ApiTutorialUpdateRequest;
import com.mb.testservice.api.response.ApiTutorialResponse;
import com.mb.testservice.base.BaseUnitTest;
import com.mb.testservice.data.model.Tutorial;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TutorialMapperTest extends BaseUnitTest {

    TutorialMapper tutorialMapper = Mappers.getMapper(TutorialMapper.class);

    @Test
    void map_ApiTutorialRequestToTutorial_ShouldSucceed() {
        // arrange
        ApiTutorialRequest apiTutorialRequest = getApiTutorialRequest();

        // act
        Tutorial result = tutorialMapper.map(apiTutorialRequest);

        // assertion
        assertEquals(apiTutorialRequest.getTitle(), result.getTitle());
        assertEquals(apiTutorialRequest.getDescription(), result.getDescription());
        assertEquals(apiTutorialRequest.isPublished(), result.isPublished());
    }

    @Test
    void map_ApiTutorialUpdateRequestToTutorial_ShouldSucceed() {
        // arrange
        ApiTutorialUpdateRequest apiTutorialUpdateRequest = getApiTutorialUpdateRequest();

        // act
        Tutorial result = tutorialMapper.map(apiTutorialUpdateRequest);

        // assertion
        assertEquals(apiTutorialUpdateRequest.getTitle(), result.getTitle());
        assertEquals(apiTutorialUpdateRequest.getDescription(), result.getDescription());
        assertEquals(apiTutorialUpdateRequest.isPublished(), result.isPublished());
    }

    @Test
    void map_TutorialToApiTutorialResponse_ShouldSucceed() {
        // arrange
        Tutorial tutorial = getTutorial();

        // act
        ApiTutorialResponse result = tutorialMapper.map(tutorial);

        // assertion
        assertEquals(tutorial.getId(), result.getId());
        assertEquals(tutorial.getTitle(), result.getTitle());
        assertEquals(tutorial.getDescription(), result.getDescription());
        assertEquals(tutorial.isPublished(), result.isPublished());
    }

    @Test
    void map_ListOfTutorialToListOfApiTutorialResponse_ShouldSucceed() {
        // arrange
        List<Tutorial> tutorials = getTutorials();

        // act
        List<ApiTutorialResponse> result = tutorialMapper.map(tutorials);

        // assertion
        assertEquals(tutorials.get(0).getId(), result.get(0).getId());
        assertEquals(tutorials.get(0).getTitle(), result.get(0).getTitle());
        assertEquals(tutorials.get(0).getDescription(), result.get(0).getDescription());
        assertEquals(tutorials.get(0).isPublished(), result.get(0).isPublished());
    }
}
