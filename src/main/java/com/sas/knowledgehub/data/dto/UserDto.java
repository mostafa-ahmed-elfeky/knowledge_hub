package com.sas.knowledgehub.data.dto;

import lombok.Data;

@Data
public class UserDto extends BaseEntityDto {

  private String username;
  private String email;
  private String password;

}





