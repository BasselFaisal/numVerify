package com.phonaVerify.model.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Call {
   private boolean valid;
   private double number;
   private double local_format;
   private double international_format;
   private double country_prefix;
   private String country_code;
   private String country_name;
   private String location;
   private String carrier;
   private String line_type;

}
