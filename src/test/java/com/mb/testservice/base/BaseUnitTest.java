package com.mb.testservice.base;

import com.mb.testservice.api.request.ApiTutorialRequest;
import com.mb.testservice.api.request.ApiTutorialUpdateRequest;
import com.mb.testservice.api.response.ApiTutorialResponse;
import com.mb.testservice.data.model.Tutorial;

import java.util.Arrays;
import java.util.List;

public abstract class BaseUnitTest {

    public ApiTutorialRequest getApiTutorialRequest() {
        return new ApiTutorialRequest("Spring Boot @WebMvcTest", "Description", true);
    }

    public Tutorial getTutorial() {
        return new Tutorial(1, "Spring Boot @WebMvcTest", "Description", true);
    }

    public ApiTutorialResponse getApiTutorialResponse() {
        return new ApiTutorialResponse(1, "Spring Boot @WebMvcTest", "Description", true);
    }

    public List<Tutorial> getTutorials() {
        return Arrays.asList(new Tutorial(1, "Spring Boot @WebMvcTest 1", "Description 1", true),
                new Tutorial(2, "Spring Boot @WebMvcTest 2", "Description 2", true),
                new Tutorial(3, "Spring Boot @WebMvcTest 3", "Description 3", true));
    }

    public List<ApiTutorialResponse> getApiTutorialResponses() {
        return Arrays.asList(new ApiTutorialResponse(1, "Spring Boot @WebMvcTest 1", "Description 1", true),
                new ApiTutorialResponse(2, "Spring Boot @WebMvcTest 2", "Description 2", true),
                new ApiTutorialResponse(3, "Spring Boot @WebMvcTest 3", "Description 3", true));
    }

    public List<Tutorial> getTutorialList() {
        return Arrays.asList(new Tutorial(1, "Spring Boot @WebMvcTest", "Description 1", true),
                new Tutorial(3, "Spring Boot Web MVC", "Description 3", true));
    }

    public List<ApiTutorialResponse> getApiTutorialResponseList() {
        return Arrays.asList(new ApiTutorialResponse(1, "Spring Boot @WebMvcTest", "Description 1", true),
                new ApiTutorialResponse(3, "Spring Boot Web MVC", "Description 3", true));
    }

    public ApiTutorialUpdateRequest getApiTutorialUpdateRequest() {
        return new ApiTutorialUpdateRequest("Updated", "Updated", true);
    }

    public Tutorial getUpdatedTutorial() {
        return new Tutorial(1, "Updated", "Updated", true);
    }

    public ApiTutorialResponse getUpdatedApiTutorialResponse() {
        return new ApiTutorialResponse(1, "Updated", "Updated", true);
    }

}
