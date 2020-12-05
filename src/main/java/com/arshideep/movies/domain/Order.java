package com.arshideep.movies.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class Order {

    @Id
    @JsonProperty("order_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @NonNull  private User user;

    @OneToOne
    @NonNull private Movie movie;

    private Date orderDate;

}
