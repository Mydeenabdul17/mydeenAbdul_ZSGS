package spotifyJson;

import java.util.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.file.Paths;
import java.io.IOException;

public class Spotify {

    private Stack<MenuItem> Stack = new Stack<>();
    String choices="";
    public static void main(String args[]) {
        Spotify spotify = new Spotify();
        spotify.start();
    }

    private void start() {
        int choice;
        Stack.push(new MenuItem(0, 0, "Select Language"));
        print(0, 0);

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("\nEnter your option : ");
            choice = input.nextInt();

            if (choice == 9) {
                Stack.pop();
                choices=choices.substring(0,choices.length()-18);
                if (Stack.isEmpty()) {
                    break;
                }
            }else if(choice==0){
            	break;
            }else {
                Stack.push(new MenuItem(Stack.peek().getLevel() + 1, choice, "Select Option"));
            }

            MenuItem top = Stack.peek();
            print(top.getLevel(), top.getChoice());

        } while (choice != 0);

        System.out.println("Thank you for visiting our website...");
    }

    private void print(int level, int choice) {
        for (String choiceString : getChoices(level, choice)) {
            System.out.println(choiceString);
        }
    }

    ArrayList<String> getChoices(int level, int choice) {
        ArrayList<String> choiceList = new ArrayList<>();

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonPath = "spotify_json_files/";  
            choices+="_choice_" + choice;
            List<MenuItem> menuItems = Arrays.asList(objectMapper.readValue(
                    Paths.get(jsonPath + "level_" + level + choices + ".json").toFile(),
                    MenuItem[].class));

            for (MenuItem menuItem : menuItems) {
                choiceList.add(menuItem.getDescription());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return choiceList;
    }

    public static class MenuItem {
        private int level;
        private int choice;
        private String description;

        public MenuItem() {
        }

        public MenuItem(int level, int choice, String description) {
            this.level = level;
            this.choice = choice;
            this.description = description;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public int getChoice() {
            return choice;
        }

        public void setChoice(int choice) {
            this.choice = choice;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
