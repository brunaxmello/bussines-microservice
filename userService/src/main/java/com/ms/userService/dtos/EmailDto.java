package com.ms.userService.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
public class EmailDto {

    private UUID userId;
    private String emailTo;
    private String subject;
    private String text;


}
