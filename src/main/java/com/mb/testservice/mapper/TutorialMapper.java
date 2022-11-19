package com.mb.testservice.mapper;

import com.mb.testservice.api.request.ApiTutorialRequest;
import com.mb.testservice.api.request.ApiTutorialUpdateRequest;
import com.mb.testservice.api.response.ApiTutorialResponse;
import com.mb.testservice.data.model.Tutorial;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TutorialMapper {

    Tutorial map(ApiTutorialRequest apiTutorialRequest);

    Tutorial map(ApiTutorialUpdateRequest apiTutorialRequest);

    ApiTutorialResponse map(Tutorial tutorial);

    List<ApiTutorialResponse> map(List<Tutorial> tutorial);

}
