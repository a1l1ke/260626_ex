package oop;

public class App {
    private AppService appService;

    public App(AppService appService) {
        this.appService = appService;
    }
    
    public void run() {
        appService.run();
    }
}
