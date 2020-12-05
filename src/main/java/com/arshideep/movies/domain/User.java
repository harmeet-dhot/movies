package com.arshideep.movies.domain;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "table_user")
public class User {
      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
      @Column(name = "user_id")
      private Long userId;

      @Column(length = 255)
      @NonNull private String firstName;

      @Column(length = 255)
      @NonNull private String lastName;

      @Column(length = 255)
      @NonNull private String email;
}
