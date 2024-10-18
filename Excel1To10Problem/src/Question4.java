public class Question4 {
    public static void main(String[] args) {
        System.out.println(finalCoordinates(0, 0, "UUU"));
        System.out.println(finalCoordinates(0, 0, "URRDDL"));
        System.out.println(finalCoordinates(0, 0, "DOWN UP 2xRIGHT DOWN 3xLEFT"));
    }

    public static String finalCoordinates(int startX, int startY, String directions) {
        int x = startX;
        int y = startY;
        String[] commands;

        if(directions.contains(" ")){
            commands =  directions.split(" ");
        }
        else{
            commands = directions.split("");
        }


        for (String command : commands) {
            int multiplier = 1;
            String direction = command.trim();

            if (direction.contains("x")) {
                String[] parts = direction.split("x");
                multiplier = Integer.parseInt(parts[0]);
                direction = parts[1].toUpperCase();
            }


            switch (direction) {
                case "U":
                case "UP":
                    y += multiplier;
                    break;
                case "D":
                case "DOWN":
                    y -= multiplier;
                    break;
                case "R":
                case "RIGHT":
                    x += multiplier;
                    break;
                case "L":
                case "LEFT":
                    x -= multiplier;
                    break;
            }
        }

        return "(" + x + ", " + y + ")";
    }
}
