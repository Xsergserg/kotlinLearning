package codewars;

import java.util.regex.*;


public class password {
    public static void main(String[] args) {
        String str = "[" +
                "{" +
                "\"sentinels\": [" +

                "{ \"host\": \"192.168.221.32\", \"port\": \"6379\", \"password\":\"redispass1\" }" +
                "," +
                "{ \"host\": \"192.168.221.32\", \"port\": \"6380\", \"password\" : \"redispass4\" }" +
                "," +
                "{ \"host\": \"192.168.221.32\", \"port\": \"6381\", \"password\" :\"redispass2\" }\" }"+
                "," +
                "{ \"host\": \"192.168.221.32\", \"port\": \"6382\", \"password\":     \"redispass10\" }" +
                "]" +
                "}" +
                "]";
        System.out.println(str);
        Pattern pattern = Pattern.compile("(\"password\")\\s*:\\s*(\"[^\"]*\")");
        Matcher matcher = pattern.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find())
            matcher.appendReplacement(stringBuffer, "\"password\":" + transformPassword(matcher.group(2)));
        matcher.appendTail(stringBuffer);
        System.out.println(stringBuffer);
    }
    private static String transformPassword(String password) {
        password = password.substring(1, password.length() - 1);
        String result;
        if (password.equals("redispass4"))
            result = "redispass4decrypted";
        else if (password.equals("redispass1"))
            result = "redispass4encrypted";
        else
            return "null";
        return "\"" + result + "\"";
    }
}
