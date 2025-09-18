package dev.brandonfl.bugtest;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class TestDTO implements Serializable {

    @JsonProperty(value = "is_user_available")
    private boolean isUserAvailable;
}
