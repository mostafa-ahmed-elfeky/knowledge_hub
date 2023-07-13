package com.sas.knowledgehub.data.dto;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class BaseEntityDto {

  private Long id;
  private String createdBy;
  private String updatedBy;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

}