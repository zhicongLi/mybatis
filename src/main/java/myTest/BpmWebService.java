package myTest;

import webService.SI03FA5LYDLMH2JTMHDBDBSJOUT;
import webService.SI03FA5LYDLMH2JTMHDBDBSJOUTService;

import javax.xml.ws.BindingProvider;

public class BpmWebService {
    public static void main(String[] args) {
       /* SI03FA3SJGJZLXT2JTMHDBDBSJOUTService si03FA3SJGJZLXT2JTMHDBDBSJOUTService = new SI03FA3SJGJZLXT2JTMHDBDBSJOUTService();
        SI03FA3SJGJZLXT2JTMHDBDBSJOUT si = si03FA3SJGJZLXT2JTMHDBDBSJOUTService.getSI03FA3SJGJZLXT2JTMHDBDBSJOUTPort();
        BindingProvider bindingProvider = (BindingProvider) si;
        bindingProvider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY,"zzsoapshsjgj");
        bindingProvider.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY,"Rho*2<fg8{1");
        SyncTask syncTask = new SyncTask();
        PortalTask portalTask = new PortalTask();

        portalTask.setId("");
        syncTask.setArg0(portalTask);

        SyncTaskResponse result = si.si03FA3SJGJZLXT2JTMHDBDBSJOUT(syncTask);*/


        SI03FA5LYDLMH2JTMHDBDBSJOUTService si03FA5LYDLMH2JTMHDBDBSJOUTService = new SI03FA5LYDLMH2JTMHDBDBSJOUTService();
        SI03FA5LYDLMH2JTMHDBDBSJOUT si03FA5LYDLMH2JTMHDBDBSJOUT = si03FA5LYDLMH2JTMHDBDBSJOUTService.getSI03FA5LYDLMH2JTMHDBDBSJOUTPort();
        BindingProvider bindingProvider = (BindingProvider) si03FA5LYDLMH2JTMHDBDBSJOUT;
        bindingProvider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY,"zzsoapshsjgj");
        bindingProvider.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY,"Rho*2<fg8{1");
        SyncTask syncTask = new SyncTask();
        PortalTask portalTask = new PortalTask();
        portalTask.setId("");
        syncTask.setArg0(portalTask);
        //SyncTaskResponse result = si03FA5LYDLMH2JTMHDBDBSJOUT.si03FA5LYDLMH2JTMHDBDBSJOUT(syncTask);

    }

}
