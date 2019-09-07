package bd.edu.seu.frontendproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class LoginToken {
    private String username;
    private String fullname;
    private String role;

    public LoginToken() {
        role = "norole";
    }
}
