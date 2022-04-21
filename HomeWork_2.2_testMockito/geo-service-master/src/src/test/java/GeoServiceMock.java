import ru.netology.entity.Location;
import ru.netology.geo.GeoService;

public class GeoServiceMock implements GeoService {
    private Location value;
    @Override
    public Location byIp(String ip){
        return value;
    }
    @Override
    public Location byCoordinates() {
        return null;
    }

    public void setValue(Location value) {
        this.value = value;
    }
}
