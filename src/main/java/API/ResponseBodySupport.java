package API;

public class ResponseBodySupport {
  private String url;
  private String text;

  public ResponseBodySupport() {
  }

  public ResponseBodySupport(String url, String text) {
    this.url = url;
    this.text = text;
  }

  public String getUrl() {
    return url;
  }

  public String getText() {
    return text;
  }

}
