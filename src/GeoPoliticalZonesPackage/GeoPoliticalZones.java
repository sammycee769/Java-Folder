package GeoPoliticalZonesPackage;

public enum GeoPoliticalZones {
    NORTH_CENTRAL(new String[]{"Benue","FCT", "Kogi","Kwara","Nasarawa", "Niger", "Plateau" }),
    NORTH_EAST(new String[]{"Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"}),
    NORTH_WEST(new String[]{"Kaduna", "Kastina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"}),
    SOUTH_EAST(new String[]{"Abia", "Anambra", "Ebonyi", "Enugu", "Imo"}),
    SOUTH_SOUTH(new String[]{"Akwa-Ibom", "Bayelsa", "Cross_River", "Delta", "Edo", "Rivers", "Zamfara"}),
    SOUTH_WEST(new String[]{"Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo"});

    String[] state;
    private GeoPoliticalZones(String[] state) {

        this.state = state;
    }

    public static String getPoliticalZone(String states) {
        for (GeoPoliticalZones zone : GeoPoliticalZones.values()) {
            for (String state: zone.state) {
                if(state.equalsIgnoreCase(states)) {
                    return zone.toString();
                }
            }
        }
        return null;
    }
}
