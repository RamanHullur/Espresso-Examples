package test.nice.testproject.experiment;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MockClockModule {
	@Provides
	@Singleton
	Clock provideClock() {
		return null;
//		return Mockito.mock(Clock.class);
	}
}