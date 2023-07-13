package com.sas.knowledgehub.data.entities;

import jakarta.persistence.Column;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class BaseEntity {

  @Column
  private String createdBy;

  @Column
  private String updatedBy;

  @Column
  private LocalDateTime createdAt;

  @Column
  private LocalDateTime updatedAt;

}