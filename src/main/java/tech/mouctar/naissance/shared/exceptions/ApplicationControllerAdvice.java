package tech.mouctar.naissance.shared.exceptions;

import jakarta.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDateTime;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@Slf4j
@ControllerAdvice
public class ApplicationControllerAdvice {

    @ResponseStatus(value = NOT_FOUND)
    @ExceptionHandler(EntityNotFoundException.class)
    public @ResponseBody  ErrorEntity entityNotFoundException(EntityNotFoundException exception) {
        log.error("Erreur {} ", exception.getMessage(), exception);
        return new ErrorEntity(
                LocalDateTime.now(),
                NOT_FOUND.value(),
                null, exception.getMessage());
    }

    @ResponseStatus(value = BAD_REQUEST)
    @ExceptionHandler(RuntimeException.class)
    public @ResponseBody ErrorEntity runtimeExceptionHandler(RuntimeException exception) {
        log.error("Erreur {} ", exception.getMessage(), exception);
        return new ErrorEntity(
                LocalDateTime.now(),
                BAD_REQUEST.value(),
                null, exception.getMessage());
    }
}