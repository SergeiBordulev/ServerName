public class ServerName {
    private static String getServerName(String url) {
        int startIndex = url.indexOf("://");
        int endIndex = url.indexOf("/", startIndex + 3);

        if (endIndex == -1) {
            return url.substring(startIndex + 3);
        }

        return url.substring(startIndex + 3, endIndex);
    }

    public static void main(String[] args) {
        System.out.println(getServerName("https://www.youtube.com/watch?v=2KGtXzIb8l8"));
    }
}
