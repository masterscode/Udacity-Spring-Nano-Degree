package social.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;

    @NotBlank(message="This field cannot be empty")
    private  String lastName;

    @NotBlank(message="This field cannot be empty")
    private String firstName;
    @NotEmpty(message="This field cannot be empty")
    private String gender;


//    @Size()
    private Double weight;

}
