package omg.medvedomg.daggerdate;

import android.app.Application;

import omg.medvedomg.daggerdate.component.DaggerMyComponent;
import omg.medvedomg.daggerdate.component.MyComponent;

/**
 * Created by medvedomg on 12.12.16.
 */

public class MyApp extends Application {
    MyComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerMyComponent.builder().build();
    }

    public MyComponent getComponent(){
        return component;
    }
}
