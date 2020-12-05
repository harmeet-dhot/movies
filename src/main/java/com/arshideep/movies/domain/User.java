package com.arshideep.movies.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="table_user")
public class User {
      @Id
      @GeneratedValue(strategy =GenerationType.AUTO)
      @Column(name="user_id")
      private Long userId;
      @Column(length = 255)
      private String firstName;
      @Column(length = 255)
      private String lastName;
}
