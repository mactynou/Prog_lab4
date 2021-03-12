public interface MalyshKorotysh {
    String name = "malysh korotysh";
    void go();
    default String getName() {
        return name;
    }
}