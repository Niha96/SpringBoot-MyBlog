package com.springboot.blog.payload;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
public class CommentDto {
    private Long id;
    @NotEmpty(message = "Comment body should not be empty")
    @Size(min = 10, message = "Comment body should be at least 10 characters")
    private String body;
    @NotEmpty(message = "Email should not be empty")
    @Email
    private String email;
    @NotEmpty(message = "Name should not be empty")
    private String name;
}
