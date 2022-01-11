/*
 * © 2022 tienhuynh-tn
 * All rights reserved!
 * For more information, please contact via my email: tien.huynhlt.tn@gmail.com
 */
package tienhlt.utils;

/**
 *
 * @author Tien Huynh - Tien Huynh TN - Huynh Le Thuy Tien
 */
public class MyApplicationConstant {

    public static class LoginGmailFeatures {

        public static String GOOGLE_CLIENT_ID = "your-client-id";
        public static String GOOGLE_CLIENT_SECRET = "your-client-secret";
        public static String GOOGLE_REDIRECT_URI = "http://localhost:8084/LoginGoogleGmail/LoginGoogleServlet";
        public static String GOOGLE_LINK_GET_TOKEN = "https://accounts.google.com/o/oauth2/token";
        public static String GOOGLE_LINK_GET_USER_INFO = "https://www.googleapis.com/oauth2/v3/userinfo?access_token=";
        public static String GOOGLE_GRANT_TYPE = "authorization_code";
    }
}
