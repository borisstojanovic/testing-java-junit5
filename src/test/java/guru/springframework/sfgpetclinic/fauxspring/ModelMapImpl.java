package guru.springframework.sfgpetclinic.fauxspring;

import java.util.HashMap;
import java.util.Map;

public class ModelMapImpl implements Model {
    private final Map<String, Object> map = new HashMap<>();

    @Override
    public void addAttribute(String key, Object o) {
        map.put(key, o);
    }

    @Override
    public void addAttribute(Object o) {
        //do nothing
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModelMapImpl modelMap = (ModelMapImpl) o;

        return map.equals(modelMap.map);
    }

    @Override
    public int hashCode() {
        return map.hashCode();
    }

    public Map<String, Object> getMap() {
        return map;
    }
}
