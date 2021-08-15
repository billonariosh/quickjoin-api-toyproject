package com.billo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.security.Timestamp;

@Schema(description = "사용자")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

   @NotNull
   @Size(min = 3, max = 50)
   private Long userno;

   @NotNull
   @Size(min = 3, max = 50)
   private String userid;

   @NotNull
   @Size(min = 3, max = 50)
   private String username;

   @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
   @NotNull
   @Size(min = 3, max = 100)
   private String password;

   @NotNull
   @Size(min = 3, max = 50)
   private String nickname;

   @NotNull
   @Size(min = 3, max = 50)
   private String phone;

   @NotNull
   @Size(min = 3, max = 50)
   private String email;

   @NotNull
   @Size(min = 3, max = 50)
   private String zipcode;

   @NotNull
   @Size(min = 3, max = 50)
   private String mainaddress;

   @Size(min = 3, max = 50)
   private String subaddress;

   @NotNull
   @Size(min = 3, max = 50)
   private boolean useyn;

   @NotNull
   @Size(min = 3, max = 50)
   private Timestamp regdate;

   @NotNull
   @Size(min = 3, max = 50)
   private Timestamp chagedate;

   @NotNull
   @Size(min = 3, max = 50)
   private Timestamp logindate;
}