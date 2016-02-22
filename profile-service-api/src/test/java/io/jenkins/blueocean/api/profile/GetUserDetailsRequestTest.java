package io.jenkins.blueocean.api.profile;

import io.jenkins.blueocean.commons.JsonConverter;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Vivek Pandey
 */
public class GetUserDetailsRequestTest {
    @Test
    public void serializeDeserialize(){

        GetUserDetailsRequest request = GetUserDetailsRequest.byUserId("123");

        String json = JsonConverter.toJson(request);

        System.out.println("Converted from Java:\n"+json);

        GetUserDetailsRequest requestFromJson = JsonConverter.toJava(json, GetUserDetailsRequest.class);


        Assert.assertEquals(request.byUserId, requestFromJson.byUserId);
        System.out.println("Converted back from Json:\n"+JsonConverter.toJson(requestFromJson));
    }
}
