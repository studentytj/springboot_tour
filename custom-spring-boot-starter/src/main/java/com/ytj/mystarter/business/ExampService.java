package com.ytj.mystarter.business;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExampService {
    private String prefix;
    private String suffix;


    public ExampService(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public String wrap(String word) {
        return prefix + word + suffix;
    }
}
