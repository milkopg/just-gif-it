package schultz.dustin.io.health;

import javax.inject.Inject;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import com.justgifit.JustGifItProperties;

@Component
public class JustGifItHealthIndicator implements HealthIndicator {
	
	@Inject
	private JustGifItProperties properties;

	@Override
	public Health health() {
		if (properties.getGifLocation() != null && !properties.getGifLocation().canWrite()) {
			return Health.down().build();
		}
		// TODO Auto-generated method stub
		return Health.up().build();
	}

}
