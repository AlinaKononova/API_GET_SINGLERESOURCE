package API;

import API.ResponseBodyData;

public class ResponseBodyFull {
  private ResponseBodyData data;
  private ResponseBodySupport support;

  public ResponseBodyFull() {
  }

  public ResponseBodyFull(ResponseBodyData data, ResponseBodySupport support) {
    this.data = data;
    this.support = support;
  }

  public ResponseBodySupport getSupport() {
    return support;
  }

  public ResponseBodyData getData() {
    return data;
  }

}
