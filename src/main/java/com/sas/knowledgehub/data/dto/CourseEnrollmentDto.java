package com.sas.knowledgehub.data.dto;

import lombok.Data;

@Data
public class CourseEnrollmentDto extends BaseEntityDto {

  private UserDto userDto;
  private CourseDto courseDto;

}