import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.i18n.LocalizationService;

public class LocalizationServiceMock implements LocalizationService {
    private Location value;
    @Override
    public String locale(Country country){
        return "Добро пожаловать";
    }

    public void setValue(Location value) {
        this.value = value;
    }
}
