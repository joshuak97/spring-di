package guru.springframework.springdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * The Class I18nEnglishService
 * @author Josue Cruz Santiago.
 * @since 15 Sep. 2024.
 */
@Profile({"ES", "default"})
@Service("i18nService")
public class I18nSpanishService implements GreetingSpringService {


    @Override
    public String greet() {
        return "Hello World - ES";
    }
}
