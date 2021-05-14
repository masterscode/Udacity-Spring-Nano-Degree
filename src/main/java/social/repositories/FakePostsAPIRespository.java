package social.repositories;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class FakePostsAPIRespository {
    ObjectNode responseBody;
    public FakePostsAPIRespository(){
        RestTemplate httpAgent = new RestTemplate();
        String url = "https://jsonplaceholder.typicode.com/posts";
        ResponseEntity<ObjectNode> apiResponse = httpAgent.getForEntity(url, ObjectNode.class);
        responseBody = apiResponse.getBody();
    }

    public ObjectNode getResponseBody(){
        return this.responseBody;
    }
}
