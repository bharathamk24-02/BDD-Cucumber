package api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserResponse extends GetRequest {



    private List<GetRequest> GR;

    public List<GetRequest> getGR() {
        return GR;
    }

    public void setData(List<GetRequest> GR) {
        this.GR = GR;
    }




}
