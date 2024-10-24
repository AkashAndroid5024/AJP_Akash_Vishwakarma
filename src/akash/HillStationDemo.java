package akash;

class HillStations {
    public void location() {
        System.out.println("This is a Hill Station.");
    }

    public void famousFor() {
        System.out.println("Known for its beautiful scenery.");
    }
}

class Manali extends HillStations {
    @Override
    public void location() {
        System.out.println("Manali is located in Himachal Pradesh.");
    }

    @Override
    public void famousFor() {
        System.out.println("Manali is famous for adventure sports.");
    }
}

class Mussoorie extends HillStations {
    @Override
    public void location() {
        System.out.println("Mussoorie is located in Uttarakhand.");
    }

    @Override
    public void famousFor() {
        System.out.println("Mussoorie is known for its scenic beauty.");
    }
}

class Gulmarg extends HillStations {
    @Override
    public void location() {
        System.out.println("Gulmarg is located in Jammu & Kashmir.");
    }

    @Override
    public void famousFor() {
        System.out.println("Gulmarg is known for skiing.");
    }
}

public class HillStationDemo {
    public static void main(String[] args) {
        HillStations hill = new HillStations();
        hill.location();
        hill.famousFor();

        HillStations manali = new Manali();
        manali.location();
        manali.famousFor();

        HillStations mussoorie = new Mussoorie();
        mussoorie.location();
        mussoorie.famousFor();

        HillStations gulmarg = new Gulmarg();
        gulmarg.location();
        gulmarg.famousFor();
    }
}

