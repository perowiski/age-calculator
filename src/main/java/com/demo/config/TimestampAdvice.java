package com.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

import java.beans.PropertyEditorSupport;
import java.sql.Timestamp;

@ControllerAdvice
public class TimestampAdvice {
    private final Logger logger = LoggerFactory.getLogger(TimestampAdvice.class);

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Timestamp.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String text) throws IllegalArgumentException {
                logger.info("Advice Timestamp: {}", text);
                Timestamp time = Timestamp.valueOf(text);
                setValue(time);
            }
        });
    }
}
