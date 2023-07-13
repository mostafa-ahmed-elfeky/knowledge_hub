package com.sas.knowledgehub.data.constants;

public enum ErrorCode {

  GENERAL_ERROR("general error"),
  COURSE_TITLE_IS_BLANK("course title is blank"),
  COURSE_PRICE_MIN_10("min course price is 10 $"),
  ;


  private String message;
  ErrorCode(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}
