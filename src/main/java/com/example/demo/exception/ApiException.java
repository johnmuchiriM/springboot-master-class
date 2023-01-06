package com.example.demo.exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;


//Private final, public Constructors, equals,hashcode,  getters and to String, | Record helps achieve immutability unlike Lombok which can be used for classes which are mutable

public record ApiException(String message, Throwable throwable, HttpStatus httpStatus, ZonedDateTime zonedDateTime) {
}
