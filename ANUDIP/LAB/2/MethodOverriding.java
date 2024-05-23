class Sport {
    public void play() {
        System.out.println("I Play Sports");
    }
}

class Football extends Sport {
    @Override
    public void play() {
        System.out.println("I play football");
    }
}

class Basketball extends Sport {
    @Override
    public void play() {
        System.out.println("I Play Basketball");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Sport sport = new Sport();
        sport.play();

        Football football = new Football();
        football.play();

        Basketball basketball = new Basketball();
        basketball.play();

    }
}
