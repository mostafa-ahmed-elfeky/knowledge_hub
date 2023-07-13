package com.sas.knowledgehub.data.dto;

import lombok.Data;

@Data
public class CourseReviewDto extends BaseEntityDto {

  private UserDto userDto;
  private CourseDto courseDto;
  private Integer rating;
  private String review;

}