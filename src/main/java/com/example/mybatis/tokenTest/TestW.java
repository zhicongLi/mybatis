package com.example.mybatis.tokenTest;public class TestW {
  public static void main(String[] argv) {
    PortalService portalService = new PortalService();

    PortalServicePortType portalServicePortType = portalService.getPortalServiceHttpPort();

    String str = portalServicePortType.getUserId("superadmin");
  }
}
