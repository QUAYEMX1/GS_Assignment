package com.example.ToDoApplication.Models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ToDoApp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int toDoId;

    boolean completed=false;

    String taskName;

    @CreationTimestamp
    LocalDate createdDate;
}
