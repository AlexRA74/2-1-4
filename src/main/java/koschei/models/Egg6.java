package koschei.models;


@Component
public class Egg6 {
    private Needle7 needle;
    @Autowired
    public Egg6(Needle7 needle) {
        this.needle = needle;
    }

    @Override
    public String toString() {

        return ", в яйце иголка " + needle.toString();
    }
}
