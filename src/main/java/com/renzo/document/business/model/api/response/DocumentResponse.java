package com.renzo.document.business.model.api.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DocumentResponse {

  @ApiModelProperty(
          value = "Number",
          dataType = "Integer",
          example = "1")
  private Integer id;

  @ApiModelProperty(
          value = "Author",
          dataType = "String",
          example = "Robert")
  private String author;

  @ApiModelProperty(
          value = "Description Document",
          dataType = "String",
          example = "Document")
  private String description;

  @ApiModelProperty(
          value = "Gender Document",
          dataType = "String",
          example = "Romantic")
  private String gender;

  @ApiModelProperty(
          value = "Year Of Publication",
          dataType = "String",
          example = "2020")
  private Integer yearPublication;

  @ApiModelProperty(
          value = "Number Of Pages",
          dataType = "Integer",
          example = "50")
  private Integer numberPages;
}
