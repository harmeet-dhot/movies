package com.arshideep.movies.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
      private Long userId;
      private String firstName;
      private String lastName;
}
