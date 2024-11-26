package modelRequest;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestAccount {
    @JsonProperty("userName")
    private String userName;
    @JsonProperty("password")
    private String password;

    public RequestAccount(String userName, String password) {
        this.userName = userName;
        this.password = password;
        implementBusinessRules();
    }
    private void implementBusinessRules(){
        userName=userName+System.currentTimeMillis();
    }
}