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

  @Column(name = "created_at")
  private LocalDateTime createdAt;

  @Column(name = "created_by")
  private LocalDateTime updatedAt;

}