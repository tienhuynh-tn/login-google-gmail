/*
 * © 2022 tienhuynh-tn
 * All rights reserved!
 * For more information, please contact via my email: tien.huynhlt.tn@gmail.com
 */
package tienhlt.google;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Form;
import org.apache.http.client.fluent.Request;
import tienhlt.userDTO.User;
import tienhlt.utils.MyApplicationConstant;

/**
 *
 * @author Tien Huynh - Tien Huynh TN - Huynh Le Thuy Tien
 */
public class GoogleHelper {

    public String getToken(String code) throws ClientProtocolException, IOException {
        String response = Request.Post(MyApplicationConstant.LoginGmailFeatures.GOOGLE_LINK_GET_TOKEN)
                .bodyForm(Form.form().add("client_id", MyApplicationConstant.LoginGmailFeatures.GOOGLE_CLIENT_ID)
                        .add("client_secret", MyApplicationConstant.LoginGmailFeatures.GOOGLE_CLIENT_SECRET)
                        .add("redirect_uri", MyApplicationConstant.LoginGmailFeatures.GOOGLE_REDIRECT_URI).add("code", code)
                        .add("grant_type", MyApplicationConstant.LoginGmailFeatures.GOOGLE_GRANT_TYPE).build())
                .execute().returnContent().asString();

        JsonObject jobj = new Gson().fromJson(response, JsonObject.class);
        String accessToken = jobj.get("access_token").toString().replaceAll("\"", "");

        System.out.println("Token: " + accessToken);
        return accessToken;
    }

    public User getUserInfo(final String accessToken) throws ClientProtocolException, IOException {
        String link = MyApplicationConstant.LoginGmailFeatures.GOOGLE_LINK_GET_USER_INFO + accessToken;
        String response = Request.Get(link).execute().returnContent().asString();
        User user = new Gson().fromJson(response, User.class);

        return user;
    }
}
