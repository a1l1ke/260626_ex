package oop;

public class AppService {
    private AppProvider appProvider;

    public AppService(AppProvider appProvider) {
        this.appProvider = appProvider;
    }

    public void run() {
        appProvider.run();
    }
}
