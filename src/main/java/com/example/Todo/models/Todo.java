package com.example.Todo.models;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;


@Entity
@Data
public class Todo {
    @Id
    @GeneratedValue
    Long id;
    @NotNull
    @NotBlank
   @Schema(name="title",example = "complete spring boot")
    String title;
    @NotNull
    @NotBlank
    String description;
    Boolean isCompleted;
    @Email
    String email;
}
