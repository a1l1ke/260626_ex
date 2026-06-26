package oop;

public class AppService {
    private AppProvider appProvider;

    public AppService(AppProvider appProvider) {
        this.appProvider = appProvider;
    }

    public void run() {
        System.out.println("AppService.run");
        appProvider.run();
        System.out.println("AppService.run.complete");
    }
}
