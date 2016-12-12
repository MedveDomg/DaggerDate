package omg.medvedomg.daggerdate.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import omg.medvedomg.daggerdate.MyDate;

/**
 * Created by medvedomg on 12.12.16.
 */
@Module
public class MyDateModule {

    @Provides
    @Singleton
    public MyDate getMyDateInstance() {
        return new MyDate();
    }
}
