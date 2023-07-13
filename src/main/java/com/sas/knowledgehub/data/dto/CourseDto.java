package com.sas.knowledgehub.data.dto;

import com.sas.knowledgehub.data.constants.ValidationConst;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class CourseDto extends BaseEntityDto {

  @NotBlank(message = ValidationConst.COURSE_TITLE_IS_BLANK)
  private String title;

  private String description;

  @NotNull
  @Min(message = ValidationConst.COURSE_PRICE_MIN_10, value = 10)
  private BigDecimal price;

}