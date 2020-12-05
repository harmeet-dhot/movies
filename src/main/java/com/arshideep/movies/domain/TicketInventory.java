package com.arshideep.movies.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.apache.catalina.LifecycleState;

import javax.persistence.*;

@Data
@Entity
@Table
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class TicketInventory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Movie movie;

    private Long inventoryCount;

}
