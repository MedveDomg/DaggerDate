package omg.medvedomg.daggerdate.component;

import javax.inject.Singleton;

import dagger.Component;
import omg.medvedomg.daggerdate.module.MyDateModule;
import omg.medvedomg.daggerdate.ui.MainActivity;

/**
 * Created by medvedomg on 12.12.16.
 */
@Component(modules = {MyDateModule.class})
@Singleton
public interface MyComponent {
    void inject(MainActivity mainActivity);
}
